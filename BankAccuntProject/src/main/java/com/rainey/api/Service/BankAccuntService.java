package com.rainey.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rainey.api.Dao.AccuntRepository;
import com.rainey.api.Exception.InsufficientDepositException;
import com.rainey.api.Model.BankAccunt;

import jakarta.transaction.Transactional;

@Service
public class BankAccuntService {
	@Autowired
	private AccuntRepository accuntRepository;
	@Transactional
	public void createAccunt(BankAccunt bankAccunt) {
		if (bankAccunt.getDeposit() < 1000) {
			throw new InsufficientDepositException("創建帳戶請存放大於1000元的金額");
		}else {
			accuntRepository.createAccunt(bankAccunt);
		}
	}
	public void transferAmount(String from,Long amount,String to) {
		accuntRepository.reduceDeposit(from, amount);
		accuntRepository.increaseDeposit(to, amount);
		
		
	}

}

package com.rainey.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rainey.api.Model.BankAccunt;
import com.rainey.api.Service.BankAccuntService;

@RestController
@RequestMapping("/bankAccuntApi")
public class Controller {
	@Autowired
	private BankAccuntService bankAccuntService;
	@PostMapping("/createaccunt")
	public ResponseEntity<String> createAccunt(@RequestBody BankAccunt bankAccunt){
		bankAccuntService.createAccunt(bankAccunt);
		return ResponseEntity.status(HttpStatus.CREATED).body("帳戶創建成功");
	}
}

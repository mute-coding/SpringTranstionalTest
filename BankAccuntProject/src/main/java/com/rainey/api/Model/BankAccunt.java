package com.rainey.api.Model;

public class BankAccunt {
	private int id;
	private String username;
	private Long deposit;
	public BankAccunt() {}
	public BankAccunt(int id,String username,Long deposit) {
		this.id = id;
		this.username = username;
		this.deposit = deposit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getDeposit() {
		return deposit;
	}
	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}
	
}

package com.rainey.api.DTO;

public class TransFerDTO {
	private  String from; 
	private Long Amount;
	private String to;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Long getAmount() {
		return Amount;
	}
	public void setAmount(Long amount) {
		Amount = amount;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	

}

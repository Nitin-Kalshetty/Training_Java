package com.clayfin.model;

public class BankList {
	private String bankName;
	private String id;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BankList [bankName=" + bankName + ", id=" + id + "]";
	}
	
}

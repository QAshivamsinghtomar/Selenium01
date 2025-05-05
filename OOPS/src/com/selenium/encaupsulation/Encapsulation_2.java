package com.selenium.encaupsulation;

public class Encapsulation_2 {

	private int accountNo ;
	private String accountType ;
	private int accountBalance ;
	private String accountHolder ;
	private String accountName ;
	
	
	// Constructor & Passing value
	public Encapsulation_2(int accountNo, String accountType, int accountBalance, 
			String accountHolder, String accountName) {
		
		this.accountNo = accountNo ;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.accountHolder = accountHolder;
		this.accountName = accountName;
	}


	// Getter and Setter Method - Convert Private Modifier data into Public Modifier
	public int getAccountNo() {
		return accountNo;
	}
    public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


    
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
	
}

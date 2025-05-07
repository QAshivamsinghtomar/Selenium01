package com.java.exceptionhandling;

// Custom Excetion --- How to create own custom Exception.

class Account{
	public String acountName ;
	public String accountNumber ;
	public String accountType ;
	public String accountHolderName ;
	public int accountBalance ;
	
	// Constructor
	public Account(String accountName, String accountNumber, String accountType, String accountHolderName, int accountBalance ) {
		this.acountName = accountName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
}


class insufficientBalanceException extends Exception{
	public insufficientBalanceException(String errorMessage) {
		super(errorMessage);
	}
}


class Transation{
	public void withdraw(Account account, int withdrawAmount) {
		
		System.out.println("-----------Transation Details--------");
		System.out.println("Account Name = "+account.acountName);
		System.out.println("Account Holder Name = "+account.accountHolderName);
		System.out.println("Account Number = "+account.accountNumber);
		System.out.println("Account Type ="+account.accountType);
		System.out.println("Withdraw Amount = "+withdrawAmount);
		
		
		try {
			if(account.accountBalance > withdrawAmount) {
				account.accountBalance = account.accountBalance - withdrawAmount ;
				System.out.println("Total Balance = "+account.accountBalance);
				System.out.println("Transation Successfull");
				
			}
			else {
				System.out.println("Total Balance = "+account.accountBalance);
				System.out.println("Transation Failure");
				
				throw new insufficientBalanceException
				("Insufficient Balance in your account...Please Enter Valid Amount");
			}
		}
		catch(insufficientBalanceException balanceException) {
			System.out.println(balanceException.getMessage());
		}
		finally {
			System.out.println("Thank you ");
		}
		
}
		
			
		
		
	}




public class Exception_Handling12 {
	public static void main(String[] args) {
		Account account1 = new Account("ICICI BANK", "ICICI121", "SAVING", "SHIVAM" , 20000);
		Transation transation1 = new Transation();
		transation1.withdraw(account1, 5000);
		
		System.out.println();
		System.out.println();
		
		
		Account account2 = new Account("HDFC BANK", "HDFC121", "SAVING", "SURAJ" , 20000);
		Transation transation2 = new Transation();
		transation2.withdraw(account2, 25000);
	}
	
	
	
}
	

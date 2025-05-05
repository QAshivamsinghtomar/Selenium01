package com.selenium.inheritance;

/*
-> USE-A Relationship -  Method of one class is using an object of another class is called 
USES - A Relationship. 
*/


class Account {
	
	private int accountNumber ;
	private String accountName ;
	private int accountBalance ;
	private String accountType ;
	private String accountBranch ;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getAccountBranch() {
		return accountBranch;
	}
	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

}


class Transaction {
	public void deposit (Account account , int amount) { // account is a class - it is a object in another
		    // class method, it is called Use - A relationship
		
	// Total balance
		int totalBalance = account.getAccountBalance() + amount;
		
		account.setAccountBalance(totalBalance);
		
		
		System.out.println("Account Number = "+account.getAccountNumber());
		System.out.println("Account Name = "+account.getAccountName());
		System.out.println("Account Balance = "+account.getAccountBalance());
		System.out.println("Account Type = "+account.getAccountType());
		System.out.println("Account Branch = "+account.getAccountBranch());
						
	}
} 


public class USE_A_Relationship {
	
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setAccountNumber(1002);
		account1.setAccountName("ICICI Bank");
		account1.setAccountBalance(5000);
		account1.setAccountBranch("Noida");
		account1.setAccountType("Saving");
		
		
		Transaction transaction = new Transaction();
		transaction.deposit(account1, 1200);
		
	}
}

	

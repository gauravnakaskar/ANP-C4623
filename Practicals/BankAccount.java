// first part of Code 

package sample;
// Defining Bank Accout class
public class BankAccount {
     private double balance; // initializing the Variables of Class 
     private String accountNumber;
	public BankAccount(double balance, String accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	// adding the getters and Setters 
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
     //method for Deposit transaction
     public  void deposit(double amount)
     {
    	 balance+=amount;
     }
     //method for withdraw transaction

     public  void withdraw(double amount)
     {
    	 balance-=amount;
     }
}

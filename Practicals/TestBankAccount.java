// tester class for Bank Account 
package sample;

public class TestBankAccount {

	public static void main(String[] args) {
	BankAccount ba=new BankAccount(10000,"123456");//Creating the instance of Class 
			System.out.println("Balance is"+ba.getBalance());//printing the balance Before the Trasaction 
	        System.out.println("Account no is"+ba.getAccountNumber());//printing the Account no. 
            ba.deposit(500);// performing Deposit Transaction 
            ba.withdraw(200);// performing Withdraw Transaction 
			System.out.println("Balance after deposite and withdraw"+ba.getBalance());//printing the balance after the Trasaction
	}

}

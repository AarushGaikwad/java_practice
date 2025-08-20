package encapsulationPractice;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
		else {
			System.out.println("amount deposited should be positive");
		}
		return balance;
	}
	
	public double withdraw(double amount) {
		if(amount > 0 && balance >= amount) {
			balance -= amount;
		}
		else {
			System.out.println("amount should be positive and withdrawal amount should be equal to total balance");
		}
		return balance;
	}
	
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.deposit(5000);
		System.out.println("deposited amount is: " + acc.getBalance());
		
		acc.withdraw(2000);
		System.out.println("amount withdrawed is: " + acc.getBalance());
		
		System.out.println("total balance after withdrwal is: " + acc.getBalance());
	}
}

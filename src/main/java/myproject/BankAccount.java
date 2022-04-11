package myproject;

public class BankAccount {
	
	long balance;

	public long getBalance() {
		return this.balance;
	}

	public void deposit(long value) {
		this.balance = this.balance + value;
	}

	public void withdraw(long value) {
		this.balance = this.balance - value;
	}

	public void withdraw(long foreignValue, double conversionfactor) {
		long factor = Math.round(conversionfactor);
		long value = foreignValue*factor;
		this.balance = this.balance - value;
	}

}

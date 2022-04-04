public class BankAccount {
	
	long balance;

	private long getBlance() {
		return this.balance;
	}

	private void deposit(long value) {
		this.balance = this.balance + value;
	}

	private void withdraw(long value) {
		this.balance = this.balance - value;
	}

	private void withdraw(long foreignValue, double conversionfactor) {
		long factor = Math.round(conversionfactor);
		long value = foreignValue*factor;
		this.balance = this.balance - value;
	}

}

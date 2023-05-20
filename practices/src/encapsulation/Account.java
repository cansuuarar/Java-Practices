package encapsulation;

//balance değişecek

public class Account {
	private double balance;

	
	public Account() {
	}
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withDraw(double money) {
		balance = balance - money;
	}

	public void deposit(double money) {
		balance = balance + money;
	}
	
	public void remittance(double money) {
		
	}

}

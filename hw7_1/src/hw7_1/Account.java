package hw7_1;


public class Account {
	private int balance;
	public Account(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public int getTotal() {
		return (int) (balance * 1.01);
	}


}

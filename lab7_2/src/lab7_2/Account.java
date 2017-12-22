package lab7_2;

public class Account {
	private String id;
	private int balance;

	public Account(String id, int balance) {
		this.id = id;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getTotal() {
		return (int)(balance * 1.01);
	}
}
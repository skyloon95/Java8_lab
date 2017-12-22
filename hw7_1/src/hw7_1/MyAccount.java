package hw7_1;

public class MyAccount extends Account {
	private double interestRate;
	public MyAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	@Override
	public int getTotal() {
		return (int) (getBalance() * (1 + interestRate));
	}
	public boolean equalTotal(MyAccount other) {
		return getTotal() == other.getTotal();
	}


}

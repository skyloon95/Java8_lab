package lab7_2;

public class MyAccount extends Account {
	private double interest;

	public MyAccount (String id, int balance, double interest) {
		super(id, balance);
		this.interest = interest;
	}
	
	public double getInterest (){
		return interest;
	}
	
	public void setInterest (double interest){
		this.interest = interest;
	}
	
	@Override
	public int getTotal(){
		return (int)(getBalance()*(1+interest));
	}

}
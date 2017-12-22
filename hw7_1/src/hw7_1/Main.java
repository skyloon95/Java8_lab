package hw7_1;

public class Main {

	public static void main(String[] args) {
		   MyAccount m1 = new MyAccount(105, 0.00);
		   MyAccount m2 = new MyAccount(100, 0.05);
		   boolean same = m1.equalTotal(m2);
		   System.out.println(same);   
		}


}

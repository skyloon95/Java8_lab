/*
 *���ϸ� : BankAccountMain.java
 *�ۼ��� : 2017.4.6
 *�ۼ��� : 201432014 �𼳾�
 *���� : �͹̳� 
 */
package lab5_3;

/**
 * @author snow
 *
 */
public class BankAccountMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("lab5_3 : �𼳾�\n");
		
		BankAccount myAccount = new BankAccount();
		
		myAccount.deposit(2000);
		myAccount.deposit(3000);
		
		System.out.println("�ܾ� : " + myAccount.balance);

	}

}

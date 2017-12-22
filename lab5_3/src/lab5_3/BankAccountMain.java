/*
 *파일명 : BankAccountMain.java
 *작성일 : 2017.4.6
 *작성자 : 201432014 모설아
 *내용 : 터미널 
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
		System.out.println("lab5_3 : 모설아\n");
		
		BankAccount myAccount = new BankAccount();
		
		myAccount.deposit(2000);
		myAccount.deposit(3000);
		
		System.out.println("잔액 : " + myAccount.balance);

	}

}

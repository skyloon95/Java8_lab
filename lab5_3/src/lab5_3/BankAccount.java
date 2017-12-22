/*
 *파일명 : BankAccount.java
 *작성일 : 2017.4.6
 *작성자 : 201432014 모설아
 *내용 : 잔액 저장및 입금 
 */
package lab5_3;

/**
 * @author snow
 *
 */
public class BankAccount {
	int balance; // 잔액
	
	void deposit (int money){
		balance += money; // balance에 매개변수로 받은 금액을 추가.
	}

}

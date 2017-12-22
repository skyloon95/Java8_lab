/*
 *파일명 : BankAccount.java
 *작성일 : 2017.4.11
 *작성자 : 201432014 모설아
 *내용 : 잔액 필드, 입금, 출금, 잔액조회 메소드
 */
package hw5_1;

/**
 * @author snow
 *
 */
public class BankAccount {
	int balance; // 잔액
	
	
	int getBalance(){ // 잔액 리턴
		return balance;
	}
	
	void deposit(int money){ // 입금
		balance += money;
	}
	
	void withdraw(int money){ // 출금
		if(balance-money>=0){
			balance -= money;
		}
		else{
			System.out.println("잔액이 부족합니다.");
			System.out.println(balance+"원 이하로만 출금 가능합니다.\n\n");
		}
		
	}

}

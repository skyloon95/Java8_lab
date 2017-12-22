/*
 * 파일명 : MetroCard.java
 * 작성일 : 20170427
 * 작성자 : 모설아
 * 내용 : 지하철 카드 동작
 */
package hw6_1;

/**
 * @author snow
 *
 */

public class MetroCard {
	private int balance;// (1) 잔액 필드



	public MetroCard(int balance){
		this.balance = balance;// (2) 잔액을 매개변수로 받아 초기화 하는 생성자
	}





	public int getBalance(){
		return balance;// (3) getBalance() - 잔액 getter
	}





	public void ride(){
		if(balance>=1000){
			balance -= 1000;
			System.out.println("탑승");
		}
		
		else{
			System.out.println("잔액이 모자랍니다. 탑승할 수 없습니다.\n");// (4) ride() - 1회 탑승마다 호출되는 메소드
		}
	}




	public void charge(int money){
		balance += money;// (5) charge() -매개변수로 받은 금액만큼 충전하는 메소드
	}


}

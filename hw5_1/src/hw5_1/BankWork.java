/*
 *파일명 : BankWork.java
 *작성일 : 2017.4.11
 *작성자 : 201432014 모설아
 *내용 : 드라이버 클래스 
 */
package hw5_1;

import java.util.Scanner; 

/**
 * @author snow
 *
 */
public class BankWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw5_1 : 모설아\n");

		BankAccount myAccount = new BankAccount(); // 객체 선언
		Scanner input = new Scanner(System.in);

		int userSelect; // 사용자 입력 저장

		while(true){ // 반복 실행을 위한 루프
			System.out.println("1 : 입금 / 2 : 출금 / 3 : 잔액 조회 / 4 : 종료\n");

			System.out.print("원하는 작업에 해당하는 번호를 입력해주세요 : "); // 최초 안내문

			while(true){ // userSelect 값을 입력받는 루프
				userSelect = input.nextInt();

				if(userSelect>=1 && userSelect<=4) break;

				else{ // 잘못된 입력이 들어올 경우 반복 안내문
					System.out.print("잘못된 명령어 입니다.\n1,2,3,4 로만 입력해 주세요 : ");
				}
			}

			switch (userSelect){ // 유저가 선택한 작업을 실행.
			case 1 :
				doDeposit(myAccount); // 입금용 매소드
				break;

			case 2 :
				doWithdraw(myAccount); // 출금용 매소드
				break;

			case 3 : 
				System.out.println("잔액 : "+ myAccount.getBalance()); // 잔액 출력.
				break;

			case 4 : 
				break; // 스위치 종료

			}
			
			if(userSelect==4) break; // 프로그램 종료.
			
			System.out.println("\n\n\n\n");
		}
	}

	private static void doDeposit(BankAccount myAccount){
		int money;

		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n입금 메뉴입니다.");

		System.out.print("입금하실 금액을 입력해 주세요 : ");
		money=input.nextInt();

		myAccount.deposit(money);
	}

	private static void doWithdraw(BankAccount myAccount){
		int money;

		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n출금 메뉴입니다.");

		System.out.println("현재 출금 가능한 최대 금액은 "+myAccount.getBalance()+"원 입니다.");
		System.out.print("출금하실 금액을 입력해 주세요 : ");
		money=input.nextInt();

		myAccount.withdraw(money);
	}

}

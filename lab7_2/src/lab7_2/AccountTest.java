package lab7_2;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("lab7_2 : 모설아\n");

		final int loa = 5; // 배열의 길이
		final int aloa = 2; // Account형 객체의 수

		String inputId;
		int inputBalance;
		double inputInterest;

		Account[] array = new Account[loa];

		Scanner input = new Scanner(System.in);

		for(int i = 0; i<aloa ; i++){
			System.out.print((i+1)+" 번째 계좌 번호 입력 : ");
			inputId = input.nextLine();

			System.out.print("\n잔액 입력 : ");
			inputBalance = input.nextInt();

			input.nextLine(); // 버퍼의 엔터 삭제

			array[i] = new Account(inputId, inputBalance);
			System.out.println("");
		}

		for(int i = aloa ; i<loa ; i++){
			System.out.print((i+1)+" 번째 계좌 번호 입력 : ");
			inputId = input.nextLine();

			System.out.print("\n잔액 입력 : ");
			inputBalance = input.nextInt();

			System.out.print("\n이자율 설정 : ");
			inputInterest = input.nextDouble();

			input.nextLine(); // 버퍼의 엔터 삭제

			array[i] = new MyAccount(inputId, inputBalance,inputInterest);
			System.out.println("");
		}

		print(array);

		System.out.println("이자율 2배 증가");
		doubleInterest(array);

		print(array);

	}

	private static void print(Account[] array){
		for(int i = 0 ; i<array.length ; i++){
			if(array[i] instanceof Account){
				System.out.println(array[i].getId()+" 계좌의 만기 해지 총액은 "+array[i].getTotal()+"원 입니다.");
			}
			else{
				System.out.println(array[i].getId()+" 계좌의 이자율은 "+((MyAccount)array[i]).getInterest()+" 이며, 만기 해지 총액은 "+((MyAccount)array[i]).getTotal()+"원 입니다.");
			}
			System.out.println("");
		}
	}

	private static void doubleInterest(Account[] array)
	{
		for(int i = 0 ; i<array.length ; i++){
			if(array[i] instanceof MyAccount){
				((MyAccount)array[i]).setInterest(((MyAccount)array[i]).getInterest()*2);
			}
		}
	}
}

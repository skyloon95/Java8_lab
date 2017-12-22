/*
 *파일명 : ComputeFee.java
 *작성일 : 2017.3.31
 *작성자 : 모설아
 *내용 : 조건에 따른 회비 계산과 출력. 
 */
package hw4_1;

import java.util.*;

/**
 * @author snow
 *
 */
public class ComputeFee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] basicFee = {5000, 15000, 20000, 20000}; // 기본 회비를 저장하는 배열

		int gradeInput; // 사용자 입력

		int fee;

		System.out.println("hw4_1 : 모설아\n");

		System.out.println("학년별 회비 게산을 도와주는 프로그램입니다.");
		Scanner input = new Scanner(System.in); // 스캐너 System.in 객체 input선언

		while(true){
			System.out.print("1~4 범위의 학년을 입력해주세요 : ");

			gradeInput = input.nextInt();

			if(gradeInput>=1&&gradeInput<=4) break;
		}

		System.out.println("\n" + gradeInput + "학년 회비는 " + basicFee[gradeInput-1] + "원 입니다.\n" + "아래에 제시되는 문제를 맞추시면 회비의 10%를 할인 해드립니다!\n" );

		fee = (int)(basicFee[gradeInput-1] * test(gradeInput));

		System.out.println("지불하실 회비는 " + fee + "원입니다.");
	}

	private static double test (int grade){ // 정답 오답 여부를 판단하여 결과를 반환하는 메소드.
		double discount = 1.0;
		int answer; // 답을 입력받을 변수

		Scanner input = new Scanner(System.in);

		switch (grade){ // 정답이면 0.9, 오답이면 그대로 1을 반환.

		case 1 :
			System.out.print("1 + 1 = ");

			answer = input.nextInt();

			if(answer == 2){
				System.out.println("정답입니다 !");
				discount = 0.9;
			}
			else System.out.println("틀렸습니다.");

			return discount;

		case 2 :
			System.out.print("5 - 2 = ");

			answer = input.nextInt();

			if(answer == 3){
				System.out.println("정답입니다 !");
				discount = 0.9;
			}
			else System.out.println("틀렸습니다.");

			return discount;

		case 3 :
			System.out.print("2 * 3 = ");

			answer = input.nextInt();

			if(answer == 6){
				System.out.println("정답입니다 !");
				discount = 0.9;
			}
			else System.out.println("틀렸습니다.");

			return discount;

		default :
			System.out.print("8 / 2 = ");

			answer = input.nextInt();

			if(answer == 4){
				System.out.println("정답입니다 !");
				discount = 0.9;
			}
			else System.out.println("틀렸습니다.");

			return discount;
		}
	}

}

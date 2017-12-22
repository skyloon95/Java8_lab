/*
 * 작성자 : 201432014 모설아
 * 작성일 : 2017.03.27
 * 내용 : 평균기온 검색
 * 파일명 : Find_Temp.java
 */

package lab4_2;

import java.util.*; // 모든 라이브러리 클래스 호출
/**
 * 
 * @author snow
 *
 */

public class Find_Temp {
	/**
	 * 
	 * @param args
	 */
	public static void main (String[] args){
		double[] average_Temp = {-5.0, 0.2, 7.0, 9.5, 15.0, 25.5, 28.0, 30.5, 29.5, 18.5, 8.0, -1.5}; // 기온 저장 배열 객체

		System.out.println("lab4_2 모설아\n");

		int user_Input; // 유저 인풋 저장 int형 변수

		Scanner input = new Scanner(System.in); // 키보드 입력을 받는 객체 input 지정

		while(true){ // 오류시 반복을 위한 반복문
			System.out.print("1~12 범위의 월을 입력하세요 : ");

			user_Input = input.nextInt();

			if(user_Input >=1 && user_Input <=12) break; // 정상범위일 경우 탈출
		}

		System.out.println("\n"+user_Input+"월의 평균기온 = "+average_Temp[user_Input - 1]);
	}

}

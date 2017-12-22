/*
  * 파일명: AgeCheck.java
  * 작성일: 2017.3.16
  * 작성자: 201432014모설아
  * 내용: 성년여부, 나이 파악
  */
import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		System.out.println("lab2_2 : 모설아\n");
		
		Scanner input = new Scanner(System.in); // Scanner(System.in)기능을 가지는 input객체 선언
		
		System.out.print("출생 연도를 입력하세요 : ");
		int birthYear = input.nextInt(); // 출생년도
		int thisYear = 2017; // 당해 년도
		int age = (thisYear-birthYear+1); // 나이
		final int ADULT_AGE = 20; // 성년을 20살로 정한다는 상수 선언
		
		boolean isAdult = (ADULT_AGE<=age); // 부울변수 선언, 20세 이상이면 true
		
		System.out.println(isAdult);
		System.out.println(birthYear + "년생 " + age +"세");
	}

}

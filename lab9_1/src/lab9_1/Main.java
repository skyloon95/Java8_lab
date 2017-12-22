package lab9_1;

/*
 * 파일명: Main.java
 * 작성일: 2017년 5월 22일
 * 작성자: 모설아
 * 내용: 정수검증을 위한 인터페이스와 이를 구현하는 클래스를 사용하는 정수검증시스템 프로그램
 */

import java.util.Scanner;

//인터페이스 Sample 정의
interface Sample {
	int sampleMethod();  // 매개변수가 없고, int 값을 리턴하는 추상메소드 sampleMethod()

}

//(1) 검증기를 위한 인터페이스 Validator 정의 - int형 값을 매개변수로 받고, boolean 값을 리턴하는 추상메소드 isValid()를 지님
interface Validator{
	boolean isValid(int num);
}



// 하나의 검증기를 지니는 정수검증시스템 클래스 IntegerValidateSystem
class IntegerValidateSystem {
	// 인스턴스 변수: 검증기
	private Validator validator;

	// 새로운 검증기를 등록
	public void addValidator(Validator v) { 
		validator = v;
	}

	// 등록된 검증기를 이용하여 정수값 검증한 결과를 출력
	public void printValidateResult(int num) { 
		if(validator.isValid(num)) {
			System.out.println(num + "은 합격입니다.");
		}
		else {
			System.out.println(num + "은 불합격입니다.");
		}
	}
}

//Validator를 구현하는 ScoreValidator 클래스를 정의
class ScoreValidator implements Validator {
	@Override
	public boolean isValid(int num) { // 정수값이 0~100 범위의 값인가를 검증
		return num >= 0 && num <= 100;
	}
}

//(2) Validator를 구현하는 EvenValidator 클래스를 정의 - isValid() 메소드는 정수값이 짝수인가를 검증
class EvenValidator implements Validator{
	@Override
	public boolean isValid(int num){
		return num%2==0;
	}
}




public class Main {
	public static void main(String[] args) {

		System.out.println("lab9_1: 모설아");

		Scanner input = new Scanner(System.in);
		System.out.print("검증할 정수값을 입력하세요: ");
		int value = input.nextInt();

		// 정수검증시스템을 생성
		IntegerValidateSystem mySystem = new IntegerValidateSystem();

		// ScoreValidator 객체를 mySystem의 검증기로 등록
		mySystem.addValidator(new ScoreValidator());

		// testSystem으로 value를 검증
		mySystem.printValidateResult(value);

		// (3) EvenValidator 객체를 mySystem의 검증기로 다시 등록
		mySystem.addValidator(new EvenValidator());



		// (4) mySystem으로 value를 다시 검증
		mySystem.printValidateResult(value);



	}
}


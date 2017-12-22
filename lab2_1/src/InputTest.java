/*
  * 파일명: InputTest.java
  * 작성일: 2017.03.16
  * 작성자: 201432014 모설아
  * 내용: 이름, 성적 입력받은 후 출력.
  */
import java.util.Scanner; // Scanner 클래스 불러오기

public class InputTest {

	public static void main(String[] args) {
		System.out.println("lab2_1 : 모설아\n");
		System.out.print("이름을 입력하세요 : ");
		
		String name; // 이름을 저장할 문자열
		
		Scanner input = new Scanner(System.in); // input개체 생성 후 System.in에 관한 스캔 기능 할당.
		name = input.nextLine();
		
		System.out.print("성적평점평균을 입력하세요 : ");
		
		double gpa; // 성적을 저장할 변수
		
		gpa = input.nextDouble();
		
		System.out.println(name+"님의 성적평점평균은 "+gpa+"점 입니다.");
	}

}

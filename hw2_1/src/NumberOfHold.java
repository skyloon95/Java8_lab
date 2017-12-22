/*
 파일명 : NumberOfHold
 작성일 : 2017.3.17
 작성자 : 201432014 모설아
 내용   : 국제 대회에서 개최된 횟수 계산 및 출력
 */

/**
 * @author Snow
 */

import java.util.*; // 라이브러리 클래스 모두 호출
/**
 * 
 * @author Snow
 * 개최 횟수를 찾는 클래스
 *
 */
public class NumberOfHold {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String nameOfWorldGameFest, nameOfGame;
		int startYear, periodOfHold, numberOfHold;
		final int THIS_YEAR = 2016; // 상수 THIS_YEAR선언, 2016년까지로 설정.
		
		Scanner input = new Scanner(System.in); // 키보드 입력을 받아 저장하는 개체 input 선언
		
		System.out.println("hw2_1 : 모설아\n");
		
		System.out.print("대회명 입력 : ");
		nameOfWorldGameFest = input.nextLine();

		
		System.out.print("개최주기(년) 입력 : ");
		periodOfHold = input.nextInt();
		input.nextLine(); // 버퍼 삭제
		
		System.out.print("종목명 입력 : ");
		nameOfGame = input.nextLine();

		
		System.out.print("최초 채택연도 입력 : ");
		startYear = input.nextInt();
		input.nextLine(); // 버퍼 삭제
		
		numberOfHold = ((THIS_YEAR - startYear)/periodOfHold) + 1; // 처음 채택된 해까지 포함 되어야 하므로 1을 더해준다.
		
		System.out.println(periodOfHold + "년마다 개최되는 " + nameOfWorldGameFest + "에서 " + nameOfGame + "종목은 " + startYear + " 처음 채택되어 총 " + numberOfHold + "회 채택 되었다.");
	}

}

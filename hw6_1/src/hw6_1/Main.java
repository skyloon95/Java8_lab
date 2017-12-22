/*
 *파일명 : Main.java
 *작성자 : 201432014 모설아
 *작성일 : 2017.5.2
 *내용 : 드라이버 클래스
 */
package hw6_1;

/**
 * @author snow
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw6_1 : 모설아\n\n");
		
		MetroCard card1 = new MetroCard(2500); // 메트로 카드 객체 생성
		
		card1.ride(); // 탑승 3회
		card1.ride();
		card1.ride();
		
		System.out.println("잔액 : "+card1.getBalance());
		
		card1.charge(3000); // 충전

	}

}

/*
 *Main.java
 *작성자 : 201432014 모설아
 *무명 클래스 연습 
 */
package hw9_1;

/**
 * @author snow
 *
 */

interface Speakable{ // 인터페이스
	void speak();
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw9_1 : 모설아\n");
		
		greet(new Speakable(){ // 무명 클래스 정의 후 매개변수로 전달.
			public void speak(){
				System.out.println("hello");
			}
		});

	}
	
	public static void greet(Speakable s){ // greet함수, Speakable형 매개변수 s를 받아 실행.
		s.speak();
	}

}

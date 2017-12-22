/*
 *Main.java
 *작성자 : 201432014 모설아
 *람다식 연습
 */
package hw9_2;

/**
 * @author snow
 *
 */
public class Main {

	interface Speakable{ // interface
		void speak();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw9_2 : 모설아\n");
		
		greet(()->System.out.println("hello")); // 람다식 정의 후 매개변수로 전달. 해당 람다식이 speakable의 형태를 따르므로.
	}
	
	private static void greet(Speakable s){
		s.speak();
	}
}

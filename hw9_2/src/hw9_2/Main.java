/*
 *Main.java
 *�ۼ��� : 201432014 �𼳾�
 *���ٽ� ����
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
		System.out.println("hw9_2 : �𼳾�\n");
		
		greet(()->System.out.println("hello")); // ���ٽ� ���� �� �Ű������� ����. �ش� ���ٽ��� speakable�� ���¸� �����Ƿ�.
	}
	
	private static void greet(Speakable s){
		s.speak();
	}
}

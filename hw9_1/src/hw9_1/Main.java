/*
 *Main.java
 *�ۼ��� : 201432014 �𼳾�
 *���� Ŭ���� ���� 
 */
package hw9_1;

/**
 * @author snow
 *
 */

interface Speakable{ // �������̽�
	void speak();
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw9_1 : �𼳾�\n");
		
		greet(new Speakable(){ // ���� Ŭ���� ���� �� �Ű������� ����.
			public void speak(){
				System.out.println("hello");
			}
		});

	}
	
	public static void greet(Speakable s){ // greet�Լ�, Speakable�� �Ű����� s�� �޾� ����.
		s.speak();
	}

}

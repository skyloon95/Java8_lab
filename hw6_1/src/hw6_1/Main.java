/*
 *���ϸ� : Main.java
 *�ۼ��� : 201432014 �𼳾�
 *�ۼ��� : 2017.5.2
 *���� : ����̹� Ŭ����
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
		System.out.println("hw6_1 : �𼳾�\n\n");
		
		MetroCard card1 = new MetroCard(2500); // ��Ʈ�� ī�� ��ü ����
		
		card1.ride(); // ž�� 3ȸ
		card1.ride();
		card1.ride();
		
		System.out.println("�ܾ� : "+card1.getBalance());
		
		card1.charge(3000); // ����

	}

}

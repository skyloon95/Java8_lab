/*
 ���ϸ� : NumberOfHold
 �ۼ��� : 2017.3.17
 �ۼ��� : 201432014 �𼳾�
 ����   : ���� ��ȸ���� ���ֵ� Ƚ�� ��� �� ���
 */

/**
 * @author Snow
 */

import java.util.*; // ���̺귯�� Ŭ���� ��� ȣ��
/**
 * 
 * @author Snow
 * ���� Ƚ���� ã�� Ŭ����
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
		final int THIS_YEAR = 2016; // ��� THIS_YEAR����, 2016������� ����.
		
		Scanner input = new Scanner(System.in); // Ű���� �Է��� �޾� �����ϴ� ��ü input ����
		
		System.out.println("hw2_1 : �𼳾�\n");
		
		System.out.print("��ȸ�� �Է� : ");
		nameOfWorldGameFest = input.nextLine();

		
		System.out.print("�����ֱ�(��) �Է� : ");
		periodOfHold = input.nextInt();
		input.nextLine(); // ���� ����
		
		System.out.print("����� �Է� : ");
		nameOfGame = input.nextLine();

		
		System.out.print("���� ä�ÿ��� �Է� : ");
		startYear = input.nextInt();
		input.nextLine(); // ���� ����
		
		numberOfHold = ((THIS_YEAR - startYear)/periodOfHold) + 1; // ó�� ä�õ� �ر��� ���� �Ǿ�� �ϹǷ� 1�� �����ش�.
		
		System.out.println(periodOfHold + "�⸶�� ���ֵǴ� " + nameOfWorldGameFest + "���� " + nameOfGame + "������ " + startYear + " ó�� ä�õǾ� �� " + numberOfHold + "ȸ ä�� �Ǿ���.");
	}

}

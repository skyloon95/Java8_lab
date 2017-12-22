/*
 *���ϸ� : ComputeFee.java
 *�ۼ��� : 2017.3.31
 *�ۼ��� : �𼳾�
 *���� : ���ǿ� ���� ȸ�� ���� ���. 
 */
package hw4_1;

import java.util.*;

/**
 * @author snow
 *
 */
public class ComputeFee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] basicFee = {5000, 15000, 20000, 20000}; // �⺻ ȸ�� �����ϴ� �迭

		int gradeInput; // ����� �Է�

		int fee;

		System.out.println("hw4_1 : �𼳾�\n");

		System.out.println("�г⺰ ȸ�� �Ի��� �����ִ� ���α׷��Դϴ�.");
		Scanner input = new Scanner(System.in); // ��ĳ�� System.in ��ü input����

		while(true){
			System.out.print("1~4 ������ �г��� �Է����ּ��� : ");

			gradeInput = input.nextInt();

			if(gradeInput>=1&&gradeInput<=4) break;
		}

		System.out.println("\n" + gradeInput + "�г� ȸ��� " + basicFee[gradeInput-1] + "�� �Դϴ�.\n" + "�Ʒ��� ���õǴ� ������ ���߽ø� ȸ���� 10%�� ���� �ص帳�ϴ�!\n" );

		fee = (int)(basicFee[gradeInput-1] * test(gradeInput));

		System.out.println("�����Ͻ� ȸ��� " + fee + "���Դϴ�.");
	}

	private static double test (int grade){ // ���� ���� ���θ� �Ǵ��Ͽ� ����� ��ȯ�ϴ� �޼ҵ�.
		double discount = 1.0;
		int answer; // ���� �Է¹��� ����

		Scanner input = new Scanner(System.in);

		switch (grade){ // �����̸� 0.9, �����̸� �״�� 1�� ��ȯ.

		case 1 :
			System.out.print("1 + 1 = ");

			answer = input.nextInt();

			if(answer == 2){
				System.out.println("�����Դϴ� !");
				discount = 0.9;
			}
			else System.out.println("Ʋ�Ƚ��ϴ�.");

			return discount;

		case 2 :
			System.out.print("5 - 2 = ");

			answer = input.nextInt();

			if(answer == 3){
				System.out.println("�����Դϴ� !");
				discount = 0.9;
			}
			else System.out.println("Ʋ�Ƚ��ϴ�.");

			return discount;

		case 3 :
			System.out.print("2 * 3 = ");

			answer = input.nextInt();

			if(answer == 6){
				System.out.println("�����Դϴ� !");
				discount = 0.9;
			}
			else System.out.println("Ʋ�Ƚ��ϴ�.");

			return discount;

		default :
			System.out.print("8 / 2 = ");

			answer = input.nextInt();

			if(answer == 4){
				System.out.println("�����Դϴ� !");
				discount = 0.9;
			}
			else System.out.println("Ʋ�Ƚ��ϴ�.");

			return discount;
		}
	}

}

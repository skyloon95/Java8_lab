/*
 * �ۼ��� : 201432014 �𼳾�
 * ���ϸ� : lab4_1.jar
 * �ۼ��� : 2017.03.23
 * ���� : �迭����
 */

package lab4_1;

import java.util.*; // ��� Ŭ���� �ҷ�����.
/**
 * 
 * @author Snow
 *
 */

public class Array {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double[] d = new double[5]; // ������ �迭 ���� ���� d���� ��  ������ 5��¥�� ���� ��ü�� �ּҸ� ������.
		double sum = 0.0; // ���� ���� ������ ����

		System.out.println("lab4_1 : �𼳾�\n");

		for(int i=0;i<d.length;i++){ // �迭 ���� ��ü ���
			System.out.print(d[i]+" ");
		}

		System.out.println("\n");

		Scanner input = new Scanner(System.in); // ��ĳ���� ��ü ��ǲ ���� ��, Ű���� �Է��� �Ҵ�.

		for(int i=0;i<d.length;i++){ // ��� �ε����� �� �Է¹ޱ�
			System.out.print((i+1)+"��° �Ǽ� �Է� : ");
			d[i]=input.nextDouble();
		}

		System.out.print("\n");

		for(int i=0;i<d.length;i++){ // ���� ��ü ���
			System.out.print(d[i]+" ");
		}

		for(int i=0;i<d.length;i++){ // ���� ���Ͽ� sum�� ����.
			sum+=d[i];
		}

		System.out.println("\n�� = "+ sum); // ��� �� ���

	}

}
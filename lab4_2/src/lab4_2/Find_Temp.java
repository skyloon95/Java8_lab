/*
 * �ۼ��� : 201432014 �𼳾�
 * �ۼ��� : 2017.03.27
 * ���� : ��ձ�� �˻�
 * ���ϸ� : Find_Temp.java
 */

package lab4_2;

import java.util.*; // ��� ���̺귯�� Ŭ���� ȣ��
/**
 * 
 * @author snow
 *
 */

public class Find_Temp {
	/**
	 * 
	 * @param args
	 */
	public static void main (String[] args){
		double[] average_Temp = {-5.0, 0.2, 7.0, 9.5, 15.0, 25.5, 28.0, 30.5, 29.5, 18.5, 8.0, -1.5}; // ��� ���� �迭 ��ü

		System.out.println("lab4_2 �𼳾�\n");

		int user_Input; // ���� ��ǲ ���� int�� ����

		Scanner input = new Scanner(System.in); // Ű���� �Է��� �޴� ��ü input ����

		while(true){ // ������ �ݺ��� ���� �ݺ���
			System.out.print("1~12 ������ ���� �Է��ϼ��� : ");

			user_Input = input.nextInt();

			if(user_Input >=1 && user_Input <=12) break; // ��������� ��� Ż��
		}

		System.out.println("\n"+user_Input+"���� ��ձ�� = "+average_Temp[user_Input - 1]);
	}

}

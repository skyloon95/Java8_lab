/*
  * ���ϸ�: AgeCheck.java
  * �ۼ���: 2017.3.16
  * �ۼ���: 201432014�𼳾�
  * ����: ���⿩��, ���� �ľ�
  */
import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		System.out.println("lab2_2 : �𼳾�\n");
		
		Scanner input = new Scanner(System.in); // Scanner(System.in)����� ������ input��ü ����
		
		System.out.print("��� ������ �Է��ϼ��� : ");
		int birthYear = input.nextInt(); // ����⵵
		int thisYear = 2017; // ���� �⵵
		int age = (thisYear-birthYear+1); // ����
		final int ADULT_AGE = 20; // ������ 20��� ���Ѵٴ� ��� ����
		
		boolean isAdult = (ADULT_AGE<=age); // �οﺯ�� ����, 20�� �̻��̸� true
		
		System.out.println(isAdult);
		System.out.println(birthYear + "��� " + age +"��");
	}

}

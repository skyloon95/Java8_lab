/*
  * ���ϸ�: InputTest.java
  * �ۼ���: 2017.03.16
  * �ۼ���: 201432014 �𼳾�
  * ����: �̸�, ���� �Է¹��� �� ���.
  */
import java.util.Scanner; // Scanner Ŭ���� �ҷ�����

public class InputTest {

	public static void main(String[] args) {
		System.out.println("lab2_1 : �𼳾�\n");
		System.out.print("�̸��� �Է��ϼ��� : ");
		
		String name; // �̸��� ������ ���ڿ�
		
		Scanner input = new Scanner(System.in); // input��ü ���� �� System.in�� ���� ��ĵ ��� �Ҵ�.
		name = input.nextLine();
		
		System.out.print("������������� �Է��ϼ��� : ");
		
		double gpa; // ������ ������ ����
		
		gpa = input.nextDouble();
		
		System.out.println(name+"���� ������������� "+gpa+"�� �Դϴ�.");
	}

}

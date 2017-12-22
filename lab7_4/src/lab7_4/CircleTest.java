package lab7_4;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {

		System.out.println("lab7_4: �𼳾�\n");

		// �� circle1 ���� 
		Circle circle1 = new Circle(new Point(2, 3), 4);

		// �� circle2 ������ ���� ���� �Է�
		Scanner input = new Scanner(System.in);
		System.out.print("x ��ǥ �Է�: ");
		int x = input.nextInt();
		System.out.print("y ��ǥ �Է�: ");
		int y = input.nextInt();
		System.out.print("������ �Է�: ");
		int r = input.nextInt();

		// (1) �� circle2 ���� - ������ �Է¹��� ������ �ʱ�ȭ. �� �߽� ��ġ�� �� (x, y), �������� r �� �ʱ�ȭ
		Circle circle2 = new Circle(new Point(x,y),r);

		// circle1, circle2 ���
		System.out.println("��1: " + circle1);
		System.out.println("��2: " + circle2);

		System.out.print("�� ���� �����Ѱ�:");
		
		// (2) circle1�� circle2�� ����(�߽ɰ� �������� ��� ����)���� ���� ���
		System.out.println(circle1.equals(circle2));

		System.out.print("�߽� ��ġ�� ������:");

		// (3) circle1�� circle2�� �߽� ��ġ�� �������� ���� ���
		System.out.println(circle1.getCenter().equals(circle2.getCenter()));


		System.out.print("�������� ������:");

		// (4) circle1�� circle2�� �������� �������� ���� ��� 
		System.out.println(circle1.getRadius()==circle2.getRadius());


		System.out.print("�߽� ��ġ�� x ��ǥ���� ������:");

		// (5) circle1�� circle2�� �߽� ��ġ�� x ��ǥ���� �������� ���� ���  
		System.out.println(circle1.getCenter().getX()==circle2.getCenter().getX());

	}
}


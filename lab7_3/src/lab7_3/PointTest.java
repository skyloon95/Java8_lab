package lab7_3;

public class PointTest {
	
	public static void main(String[] args) {
		System.out.println("lab7_3: ȫ�浿\n");

		// (0, 0)�� �ʱ�ȭ�� point1 ����
		Point point1 = new Point(0, 0);

		// (1) (1, 2)�� �ʱ�ȭ�� point2 ����
		Point point2 = new Point(1, 2);



		// (2) (2, 1)�� �ʱ�ȭ�� point3 ����
		Point point3 = new Point(2, 1);



		// point1�� x��ǥ�� 1�� ����
		point1.setX(1);

		// (3) point1�� y��ǥ�� 2�� ����
		point1.setY(2);



		// point1 ���
		System.out.println(point1);

		// (4) point2 ���
		System.out.println(point2);



		// (5) point3 ���
		System.out.println(point3);



		// point1�� point2�� ������ ���
		System.out.println(point1.equals(point2));

		// (6) point1�� point3�� ������ ���
		System.out.println(point1.equals(point3));



	}
}

/*
 * ���ϸ� : Main.java
 * �ۼ��� : 201432014 �𼳾�
 * �ۼ��� : 2017.5.2
 * ���� : ����̹� Ŭ����
 */
package hw6_2;

/**
 * @author snow
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw6_2 : �𼳾�\n\n");

		Circle[] circles = new Circle[3]; // ũ�Ⱑ 3�� Circle�� �迭 ����

		circles[0] = new Circle(2.0); // �������� ���� 2.0 2.0 1.0 �� ���� �� �迭 ���ҿ� ����
		circles[1] = new Circle(2.0);
		circles[2] = new Circle(1.0);

		System.out.println("�� ���� ���� �� : "+areaSum(circles));
		System.out.println("���� ���� ���� ���� : "+minArea(circles));
	}

	// (1) Circle�� �迭�� �Ű������� �޾� ���� ���� ����
	private static double areaSum(Circle[] array) { 
		double sum = 0;
		for(int i = 0 ; i<3 ; i++){
			sum += array[i].getArea();
		}
		
		return sum;
	}

	// (2) Circle�� �迭�� �Ű������� �޾� �ּ� ������ ����
	private static double minArea(Circle[] array) { 
		double min = array[0].getArea();
		
		for(int i = 1; i<3 ;i++){
			if(array[i].getArea()<min){
				min = array[i].getArea();
			}
		}
		
		return min;	

	}

}

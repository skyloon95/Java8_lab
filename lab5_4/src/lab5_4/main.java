/*
 *���ϸ� : main.java
 *�ۼ��� : 2017.4.10
 *�ۼ��� : 201432014 �𼳾�
 *���� : ����̹� Ŭ����
 */
package lab5_4;

/**
 * @author snow
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("lab5_4 : �𼳾�");
		
		Triangle triangleA = new Triangle(); 
		Triangle triangleB = new Triangle();
		
		triangleA.width = 2.5;
		triangleA.hight = 3.0;
		
		triangleB.width = 5.0;
		triangleB.hight = 4.5;
		
		System.out.printf("�ﰢ�� A�� �غ� : %.1f / ���� : %.1f / ���� : %.1f\n",triangleA.width,triangleA.hight,triangleA.extent());
		System.out.printf("�ﰢ�� B�� �غ� : %.1f / ���� : %.1f / ���� : %.1f\n",triangleB.width,triangleB.hight,triangleB.extent());
		

	}

}

/*
 * ���ϸ� : Circle.java
 * �ۼ��� : 201432014 �𼳾�
 * �ۼ��� : 2017.5.2
 * ���� : �� Ŭ����
 */
package hw6_2;
/**
 * @author snow
 *
 */
public class Circle {

	private double radius; // ������

	public Circle (double radius){ // ������ �޼ҵ�
		this.radius = radius;
	}
	public double getArea(){ // ���� ��ȯ �޼ҵ�.
		return radius*radius*3.14;
	}

}

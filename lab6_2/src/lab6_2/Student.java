/*
 * ���ϸ� : Student.java
 * �ۼ��� : 2017.4.17
 * �ۼ��� : 201432014 �𼳾�
 * ���� : �л� ���� ���� Ŭ����
 */
package lab6_2;

/**
 * @author snow
 *
 */
public class Student {
	private int math; // ��������
	private int english; // ��������
	
	public Student(){
		math = 0;
		english = 0;
	}
	public Student(int math, int english){
		this.math = math;
		this.english = english;
	}
	public int getMath(){
		return math;
	}
	
	public void setMath(int math){
		this.math = math;
	}
	
	public int getEnglish(){
		return english;
	}
	
	public void setEnglish(int english){
		this.english = english;
	}

}

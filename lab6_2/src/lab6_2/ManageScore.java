/*
 * ���ϸ� : ManageScore.java
 * �ۼ��� : 2017.4.17
 * �ۼ��� : 201432014 �𼳾�
 * ���� : ����̺� Ŭ����
 */
package lab6_2;

/**
 * @author snow
 *
 */
public class ManageScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("lab6_2 : �𼳾�\n\n");
		
		Student student1 = new Student();
		student1.setMath(40);
		student1.setEnglish(85);
		
		Student student2 = new Student(45,70);
		
		System.out.println("�л� 1�� ���� + ���� ���� : "+(student1.getMath()+student1.getEnglish()));
		System.out.println("�л� 2�� ���� + ���� ���� : "+(student2.getMath()+student2.getEnglish()));
	}

}

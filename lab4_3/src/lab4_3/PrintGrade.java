/*
 * ���ϸ� : PrintGrade.java
 * �ۼ��� : 201432014 �𼳾�
 * ���� : ���� �г� ���
 * �ۼ��� : 2017.3.30
 */
package lab4_3;

/**
 * @author snow
 *
 */
public class PrintGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("lab4_3 : �𼳾�\n");
		
		final int MAX_GRADE = 6; // �ִ� �г�
		final int MIN_GRADE = 4; // �ּ� �г�
		int grade; // ���� �г� ���� ����
		
		int time = 0; // Ÿ�̸�
		
		while(time<10){ // 10ȸ ��� ���� ����
			grade = (int)(Math.random()*MAX_GRADE); // 0 ~ �ִ��г�-1 ������ ���� ���� ����
			
			if(grade>=(MIN_GRADE-1)){ // �ּ��г�-1 �̻��� ��� ����
				System.out.print(grade+1+" "); // ���
				time++; // Ÿ�̸� +1
			}
		}
	}

}

/*
 *���ϸ� : ManageScore.java
 *�ۼ��� : 201432014 �𼳾�
 *�ۼ��� : 2017.4.17
 *���� : ����̹� Ŭ���� 
 */
package lab6_1;

/**
 * @author snow
 *
 */
public class ManageScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student st1 = new Student();
		
		System.out.println("lab6_1 : �𼳾�\n");
		
		st1.setMath(40);
		st1.setEnglish(85);
		
		System.out.println("���� ���� : "+st1.getMath());
		System.out.println("���� ���� : "+st1.getEnglish());
		
	}

}

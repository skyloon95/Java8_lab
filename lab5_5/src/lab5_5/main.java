/*
 *���ϸ� : main.java
 *�ۼ��� : 2017.4.10
 *�ۼ��� : 201432014 �𼳾�
 *���� : ����̹� Ŭ����. 
 */
package lab5_5;

/**
 * @author snow
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("lab5_5 : �𼳾�\n");
		
		Student student = new Student(); // ��ü ����.
		
		student.mathScore = 40;
		student.englishScore = 85;
		
		System.out.println("�л��� ���� ���� : "+student.mathScore+"\n�л��� ���� ���� : "+student.englishScore);
		System.out.printf("�л��� ��� ���� : %.1f\n",student.getAverage());
		
		boolean pass; // pass���� ����� ����.
		
		pass=student.passTest(40, 60); // pass���� �ޱ�
		printPassResult(pass); // ��� ���
		
		pass=student.passTest(50, 50);
		printPassResult(pass);
	}
	
	private static void printPassResult (boolean pass){ // ��� ��¿� �żҵ�
		
		if(pass==true){
			System.out.println("pass");
		}
		
		else{
			System.out.println("nonpass");
		}
	}

}

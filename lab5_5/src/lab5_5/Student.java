/*
 *���ϸ� : Student.java
 *�ۼ��� : 2017.4.10
 *�ۼ��� : �𼳾�
 *���� : ���� �ʵ�, ������� ��ȸ�� �հݿ��� ��� �żҵ�. 
 */
package lab5_5;

/**
 * @author snow
 *
 */
public class Student {
	int mathScore;
	int englishScore;
	
	double getAverage (){ // ��� ���
		double result = (double)(mathScore + englishScore)/2.0;
		
		return result;
	}
	
	boolean passTest (int passScoreMath, int passScoreEnglish) { // �н����� ���
		boolean result;
		
		if(mathScore>=passScoreMath && englishScore>=passScoreEnglish) result = true; // �� �� �հ����� �̻��̸� �հ�
		
		else result = false; // �ƴҰ�� ���հ�
		
		return result;
	}

}

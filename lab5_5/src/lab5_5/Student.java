/*
 *파일명 : Student.java
 *작성일 : 2017.4.10
 *작성자 : 모설아
 *내용 : 점수 필드, 평균점수 조회와 합격여부 계산 매소드. 
 */
package lab5_5;

/**
 * @author snow
 *
 */
public class Student {
	int mathScore;
	int englishScore;
	
	double getAverage (){ // 평균 계산
		double result = (double)(mathScore + englishScore)/2.0;
		
		return result;
	}
	
	boolean passTest (int passScoreMath, int passScoreEnglish) { // 패스여부 계산
		boolean result;
		
		if(mathScore>=passScoreMath && englishScore>=passScoreEnglish) result = true; // 둘 다 합격점수 이상이면 합격
		
		else result = false; // 아닐경우 불합격
		
		return result;
	}

}

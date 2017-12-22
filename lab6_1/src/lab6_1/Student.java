/*
 * 파일명 : Student.java
 * 작성일 : 2017.4.17
 * 작성자 : 201432014 모설아
 * 내용 : 학생 점수 관리 클래스
 */
package lab6_1;

/**
 * @author snow
 *
 */
public class Student {
	private int math; // 수학점수
	private int english; // 영어점수
	
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

/*
 *파일명 : main.java
 *작성일 : 2017.4.10
 *작성자 : 201432014 모설아
 *내용 : 드라이버 클래스. 
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
		System.out.println("lab5_5 : 모설아\n");
		
		Student student = new Student(); // 객체 선언.
		
		student.mathScore = 40;
		student.englishScore = 85;
		
		System.out.println("학생의 수학 점수 : "+student.mathScore+"\n학생의 영어 점수 : "+student.englishScore);
		System.out.printf("학생의 평균 점수 : %.1f\n",student.getAverage());
		
		boolean pass; // pass여부 저장용 변수.
		
		pass=student.passTest(40, 60); // pass여부 받기
		printPassResult(pass); // 결과 출력
		
		pass=student.passTest(50, 50);
		printPassResult(pass);
	}
	
	private static void printPassResult (boolean pass){ // 결과 출력용 매소드
		
		if(pass==true){
			System.out.println("pass");
		}
		
		else{
			System.out.println("nonpass");
		}
	}

}

/*
 * 파일명 : PrintGrade.java
 * 작성자 : 201432014 모설아
 * 내용 : 랜덤 학년 출력
 * 작성일 : 2017.3.30
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
		System.out.println("lab4_3 : 모설아\n");
		
		final int MAX_GRADE = 6; // 최대 학년
		final int MIN_GRADE = 4; // 최소 학년
		int grade; // 랜덤 학년 정보 저장
		
		int time = 0; // 타이머
		
		while(time<10){ // 10회 출력 이후 종료
			grade = (int)(Math.random()*MAX_GRADE); // 0 ~ 최대학년-1 사이의 랜덤 정수 생성
			
			if(grade>=(MIN_GRADE-1)){ // 최소학년-1 이상인 경우 실행
				System.out.print(grade+1+" "); // 출력
				time++; // 타이머 +1
			}
		}
	}

}

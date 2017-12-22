/*
 *파일명 : ManageScore.java
 *작성자 : 201432014 모설아
 *작성일 : 2017.4.17
 *내용 : 드라이버 클래스 
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
		
		System.out.println("lab6_1 : 모설아\n");
		
		st1.setMath(40);
		st1.setEnglish(85);
		
		System.out.println("수학 점수 : "+st1.getMath());
		System.out.println("영어 점수 : "+st1.getEnglish());
		
	}

}

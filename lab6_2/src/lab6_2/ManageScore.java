/*
 * 파일명 : ManageScore.java
 * 작성일 : 2017.4.17
 * 작성자 : 201432014 모설아
 * 내용 : 드라이브 클래스
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
		System.out.println("lab6_2 : 모설아\n\n");
		
		Student student1 = new Student();
		student1.setMath(40);
		student1.setEnglish(85);
		
		Student student2 = new Student(45,70);
		
		System.out.println("학생 1의 수학 + 영어 점수 : "+(student1.getMath()+student1.getEnglish()));
		System.out.println("학생 2의 수학 + 영어 점수 : "+(student2.getMath()+student2.getEnglish()));
	}

}

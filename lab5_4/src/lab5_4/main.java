/*
 *파일명 : main.java
 *작성일 : 2017.4.10
 *작성자 : 201432014 모설아
 *내용 : 드라이버 클래스
 */
package lab5_4;

/**
 * @author snow
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("lab5_4 : 모설아");
		
		Triangle triangleA = new Triangle(); 
		Triangle triangleB = new Triangle();
		
		triangleA.width = 2.5;
		triangleA.hight = 3.0;
		
		triangleB.width = 5.0;
		triangleB.hight = 4.5;
		
		System.out.printf("삼각형 A의 밑변 : %.1f / 높이 : %.1f / 넓이 : %.1f\n",triangleA.width,triangleA.hight,triangleA.extent());
		System.out.printf("삼각형 B의 밑변 : %.1f / 높이 : %.1f / 넓이 : %.1f\n",triangleB.width,triangleB.hight,triangleB.extent());
		

	}

}

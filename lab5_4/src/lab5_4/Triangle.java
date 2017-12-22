/*
 *파일명 : Triangle.java
 *작성일 : 2017.4.10
 *작성자 : 201432014 모설아
 *내용 : 삼각형 밑변 높이 필드, 넓이 계산 매소드 
 */
package lab5_4;

/**
 * @author snow
 *
 */
public class Triangle {
	double width; // 넓이
	double hight; // 높이
	
	double extent (){ // 면적 계산
		double result = width*hight*0.5;
		
		return result;
	}

}

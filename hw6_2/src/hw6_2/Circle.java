/*
 * 파일명 : Circle.java
 * 작성자 : 201432014 모설아
 * 작성일 : 2017.5.2
 * 내용 : 원 클래스
 */
package hw6_2;
/**
 * @author snow
 *
 */
public class Circle {

	private double radius; // 반지름

	public Circle (double radius){ // 생성자 메소드
		this.radius = radius;
	}
	public double getArea(){ // 넓이 반환 메소드.
		return radius*radius*3.14;
	}

}

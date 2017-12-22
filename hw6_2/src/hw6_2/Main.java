/*
 * 파일명 : Main.java
 * 작성자 : 201432014 모설아
 * 작성일 : 2017.5.2
 * 내용 : 드라이버 클래스
 */
package hw6_2;

/**
 * @author snow
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw6_2 : 모설아\n\n");

		Circle[] circles = new Circle[3]; // 크기가 3인 Circle형 배열 생성

		circles[0] = new Circle(2.0); // 반지름이 각각 2.0 2.0 1.0 인 원을 각 배열 원소에 저장
		circles[1] = new Circle(2.0);
		circles[2] = new Circle(1.0);

		System.out.println("세 원의 면적 합 : "+areaSum(circles));
		System.out.println("가장 작은 원의 면적 : "+minArea(circles));
	}

	// (1) Circle형 배열을 매개변수로 받아 면적 합을 리턴
	private static double areaSum(Circle[] array) { 
		double sum = 0;
		for(int i = 0 ; i<3 ; i++){
			sum += array[i].getArea();
		}
		
		return sum;
	}

	// (2) Circle형 배열을 매개변수로 받아 최소 면적을 리턴
	private static double minArea(Circle[] array) { 
		double min = array[0].getArea();
		
		for(int i = 1; i<3 ;i++){
			if(array[i].getArea()<min){
				min = array[i].getArea();
			}
		}
		
		return min;	

	}

}

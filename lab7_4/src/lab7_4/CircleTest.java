package lab7_4;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {

		System.out.println("lab7_4: 모설아\n");

		// 원 circle1 생성 
		Circle circle1 = new Circle(new Point(2, 3), 4);

		// 원 circle2 생성을 위한 정보 입력
		Scanner input = new Scanner(System.in);
		System.out.print("x 좌표 입력: ");
		int x = input.nextInt();
		System.out.print("y 좌표 입력: ");
		int y = input.nextInt();
		System.out.print("반지름 입력: ");
		int r = input.nextInt();

		// (1) 원 circle2 생성 - 위에서 입력받은 정보로 초기화. 즉 중심 위치는 점 (x, y), 반지름은 r 로 초기화
		Circle circle2 = new Circle(new Point(x,y),r);

		// circle1, circle2 출력
		System.out.println("원1: " + circle1);
		System.out.println("원2: " + circle2);

		System.out.print("두 원이 동일한가:");
		
		// (2) circle1과 circle2가 동일(중심과 반지름이 모두 동일)한지 여부 출력
		System.out.println(circle1.equals(circle2));

		System.out.print("중심 위치가 같은가:");

		// (3) circle1과 circle2의 중심 위치가 동일한지 여부 출력
		System.out.println(circle1.getCenter().equals(circle2.getCenter()));


		System.out.print("반지름이 같은가:");

		// (4) circle1과 circle2의 반지름이 동일한지 여부 출력 
		System.out.println(circle1.getRadius()==circle2.getRadius());


		System.out.print("중심 위치의 x 좌표값이 같은가:");

		// (5) circle1과 circle2의 중심 위치의 x 좌표값이 동일한지 여부 출력  
		System.out.println(circle1.getCenter().getX()==circle2.getCenter().getX());

	}
}


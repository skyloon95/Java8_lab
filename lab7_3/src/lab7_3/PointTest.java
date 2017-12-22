package lab7_3;

public class PointTest {
	
	public static void main(String[] args) {
		System.out.println("lab7_3: 홍길동\n");

		// (0, 0)로 초기화한 point1 생성
		Point point1 = new Point(0, 0);

		// (1) (1, 2)로 초기화한 point2 생성
		Point point2 = new Point(1, 2);



		// (2) (2, 1)로 초기화한 point3 생성
		Point point3 = new Point(2, 1);



		// point1의 x좌표를 1로 지정
		point1.setX(1);

		// (3) point1의 y좌표를 2로 지정
		point1.setY(2);



		// point1 출력
		System.out.println(point1);

		// (4) point2 출력
		System.out.println(point2);



		// (5) point3 출력
		System.out.println(point3);



		// point1이 point2와 같은지 출력
		System.out.println(point1.equals(point2));

		// (6) point1이 point3과 같은지 출력
		System.out.println(point1.equals(point3));



	}
}

package lab15_2;

//MyPair 객체를 생성하고 이용하는 프로그램
public class Main {
	public static void main(String[] args) {
		System.out.println("lab15_2: 모설아");

		// 문자열을 좌우 원소로 갖는 MyPair 객체 stringPair를 생성
		MyPair<String> stringPair = new MyPair<>(new String("hello"), new String("bye"));

		// stringPair의 정보를 출력
		System.out.println(stringPair);

		// stringPair의 좌우 원소를 교환
		stringPair.swap();

		// stringPair의 정보를 출력
		System.out.println(stringPair);
	}
}

//String형 좌우 원소를 저장하는 클래스
class MyPair<T> {
	private T left;
	private T right;
	
	public MyPair(T left, T right){
		this.left = left;
		this.right = right;
	}

	public void swap() {  //  좌우 원소를 교환하는 메소드
		T swp = left;
		left = right;
		right = swp;
	}

	@Override
	public String toString() { // 객체의 속성(좌우 원소)을 하나의 문자열로 리턴하는 메소드
		return "left:"+left+" "+"right:"+right;
	}
}

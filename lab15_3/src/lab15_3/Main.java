package lab15_3;

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
		
		System.out.println();
		
		// 책(Book 객체)을 좌우 원소로 갖는 MyPair 객체 bookPair를 생성
		MyPair<Book> bookPair = new MyPair<>(new Book("java"),new Book("C++"));
		// bookPair의 정보를 출력
		System.out.println(bookPair);
		// bookPair의 좌우 원소를 교환
		bookPair.swap();
		// bookPair의 정보를 출력
		System.out.println(bookPair);
		
		System.out.println();
		
		// 정수객체(Integer 객체)를 좌우 원소로 갖는 MyPair 객체 integerPair를 생성
		MyPair<Integer> integerPair = new MyPair<>(new Integer(1),new Integer(2));
		// integerPair의 정보를 출력
		System.out.println(integerPair);
		// integerPair의 좌우 원소를 교환
		integerPair.swap();
		// integerPair의 정보를 출력
		System.out.println(integerPair);
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

class Book{
	private String title; // 제목
	
	public Book(String title){// 제목을 매개변수로 받아 초기화
		this.title = title;
	}
	
	@Override
	public String toString(){
		return title;
	}
}

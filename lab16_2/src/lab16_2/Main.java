package lab16_2;

import lab16_2.WordRunnable;

class WordRunnable implements Runnable { // Runnable을 구현하는 WordRunnable

	private String word; // 단어
	private int number; // 반복횟수

	public WordRunnable(String word, int number) {
		this.word = word;
		this.number = number;
	}

	// (2) run() 메소드 오버라이드 - word를 number번 반복하여 한 칸씩 띄어 한 줄에 출력
	@Override
	public void run(){
		for(int i= 0; i<number ; i++){
			System.out.print(word+" ");
		}
	}


}


public class Main {
	public static void main(String[] args) {

		System.out.println("lab16_1: 모설아");

		// (3) 스레드 객체 t1 생성
		Thread t1 = new Thread(new WordRunnable("Apple", 22));


		// (4) 스레드 객체 t2 생성 
		Thread t2 = new Thread(new WordRunnable("Snow", 31));


		// (5) 스레드 t1 시작
		t1.start();



		// (6) 스레드 t2 시작
		t2.start();


	}
}

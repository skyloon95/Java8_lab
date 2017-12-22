package lab16_2;

import lab16_2.WordRunnable;

class WordRunnable implements Runnable { // Runnable�� �����ϴ� WordRunnable

	private String word; // �ܾ�
	private int number; // �ݺ�Ƚ��

	public WordRunnable(String word, int number) {
		this.word = word;
		this.number = number;
	}

	// (2) run() �޼ҵ� �������̵� - word�� number�� �ݺ��Ͽ� �� ĭ�� ��� �� �ٿ� ���
	@Override
	public void run(){
		for(int i= 0; i<number ; i++){
			System.out.print(word+" ");
		}
	}


}


public class Main {
	public static void main(String[] args) {

		System.out.println("lab16_1: �𼳾�");

		// (3) ������ ��ü t1 ����
		Thread t1 = new Thread(new WordRunnable("Apple", 22));


		// (4) ������ ��ü t2 ���� 
		Thread t2 = new Thread(new WordRunnable("Snow", 31));


		// (5) ������ t1 ����
		t1.start();



		// (6) ������ t2 ����
		t2.start();


	}
}

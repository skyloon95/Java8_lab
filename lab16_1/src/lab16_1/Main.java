package lab16_1;

class WordThread extends Thread { // (1) Thread�� ����ϴ� WordThread Ŭ������ ����

	private String word; // �ܾ�
	private int number; // �ݺ�Ƚ��

	public WordThread(String word, int number) {
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

		// (3) WordThread�� ������ ��ü t1 ����
		Thread t1 = new WordThread("Apple", 22);


		// (4) WordThread�� ������ ��ü t2 ���� 
		Thread t2 = new WordThread("Snow", 31);


		// (5) ������ t1 ����
		t1.start();



		// (6) ������ t2 ����
		t2.start();


	}
}

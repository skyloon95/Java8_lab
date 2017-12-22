package lab15_2;

//MyPair ��ü�� �����ϰ� �̿��ϴ� ���α׷�
public class Main {
	public static void main(String[] args) {
		System.out.println("lab15_2: �𼳾�");

		// ���ڿ��� �¿� ���ҷ� ���� MyPair ��ü stringPair�� ����
		MyPair<String> stringPair = new MyPair<>(new String("hello"), new String("bye"));

		// stringPair�� ������ ���
		System.out.println(stringPair);

		// stringPair�� �¿� ���Ҹ� ��ȯ
		stringPair.swap();

		// stringPair�� ������ ���
		System.out.println(stringPair);
	}
}

//String�� �¿� ���Ҹ� �����ϴ� Ŭ����
class MyPair<T> {
	private T left;
	private T right;
	
	public MyPair(T left, T right){
		this.left = left;
		this.right = right;
	}

	public void swap() {  //  �¿� ���Ҹ� ��ȯ�ϴ� �޼ҵ�
		T swp = left;
		left = right;
		right = swp;
	}

	@Override
	public String toString() { // ��ü�� �Ӽ�(�¿� ����)�� �ϳ��� ���ڿ��� �����ϴ� �޼ҵ�
		return "left:"+left+" "+"right:"+right;
	}
}

package lab14_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_1: �𼳾�");

		int[] values = new int[] {10, -2, 20, -3}; 
		int sum = arraySum(values);   // (��)
		System.out.println("���� " + sum);
	}

	private static int arraySum(int[] array) {
		int sum = 0;    
		for (int i = 0; i < array.length; i++) { // (��) 
			sum += array[i];   // (��)
		}
		return sum;
	}
}

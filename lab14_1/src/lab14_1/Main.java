package lab14_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_1: 모설아");

		int[] values = new int[] {10, -2, 20, -3}; 
		int sum = arraySum(values);   // (가)
		System.out.println("합은 " + sum);
	}

	private static int arraySum(int[] array) {
		int sum = 0;    
		for (int i = 0; i < array.length; i++) { // (나) 
			sum += array[i];   // (다)
		}
		return sum;
	}
}

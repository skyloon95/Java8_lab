import java.util.*;

public class main {
	public static void main (String[] args){
		int inputLength;
		Scanner input = new Scanner(System.in)
		
		System.out.println("hw4_2 : ������");
		System.out.println("���� ���� �Է� : ");
		
		inputLength = input.nextInt();
		
		int[] arr = new int[inputLength];
		
		System.out.print(inputLength + "���� ���� �Է� : ");
		
		for(int i = 1 ; i < inputLength ; i+++){
			arr[i] = input.nextInt();
		}
		
		int index = finding(arr, inputLength);
		
		System.out.println("�ִ밪 �ε��� = "+ index);
		System.out.println("�ִ밪 = "+ arr[index]);
	
	}
	
	private static int finding (int[] rarr, int rarrLength){
		int max = rarr[0];
		
		int index;
		
		for(int i = 1 ; i<rarrLength ; i++){
			if(rarr[i]>max){
				max = rarr[i];
				index = i;
			}
		}
		
		return index;
	}

}

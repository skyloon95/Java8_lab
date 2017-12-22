/*
 *���ϸ� : FindMaximun.java
 *�ۼ��� : 201432014 �𼳾�
 *�ۼ��� : 2017.3.31
 *���� : �ִ���ġ ���
 */
package hw4_2;

import java.util.*;

/**
 * @author snow
 *
 */
public class FindMaximum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw4_2 : �𼳾�\n");
		
		int arrLength; // �迭 ���� ���� ����
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�� ���α׷��� �Է��Ͻ� �����迭���� ���� ū ���� ���� �ε����� �˷��帳�ϴ�.");
		System.out.println("(�ȳ��Ǵ� �ε����� �ִ밪�� ���ÿ� �������� ��� ���� �տ� �ִ� ���� ����մϴ�.)");
		System.out.print("�Է��Ͻ� �������� �� ������ �����ּ��� : ");
		arrLength = input.nextInt();
		
		int[] arr = new int[arrLength]; // ����ڰ� ���� ���̸�ŭ�� �迭 ��ü ����.
		
		System.out.print(arrLength + "���� ������ �Է� �� �ּ��� : ");
		
		for(int i = 0 ; i < arrLength ; i++){ // �迭 �Է¹ޱ�
			arr[i] = input.nextInt();
		}
		
		int resultIndex = findIndex(arr, arrLength);
		
		System.out.println("�ִ밪�� �ε��� : " + resultIndex);
		System.out.println("�ִ밪 : " + arr[resultIndex]);

	}
	
	private static int findIndex (int[] carr, int carrLength){ // �迭�� �ִ��� �ε����� �����ϴ� �Լ�.
		int max, index;
		
		index = 0; // 0��°�� �ִ��� ��츦 ����Ͽ� 0���� �ʱ�ȭ
		max = carr[0]; // �켱 0��° ���� ���� max���� �ִ´�.
		
		for(int i = 1 ; i<carrLength ; i++){
			if(carr[i]>max){ // �ִ밪�� �ΰ� �̻��� ��� �ּ� �ε����� �����ؾ� �ϹǷ� max�� �ʰ��� ��쿡�� ����
				max = carr[i];
				index = i; 
			}
		}
		
		return index;
	}

}

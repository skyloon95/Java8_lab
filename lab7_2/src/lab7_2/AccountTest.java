package lab7_2;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("lab7_2 : �𼳾�\n");

		final int loa = 5; // �迭�� ����
		final int aloa = 2; // Account�� ��ü�� ��

		String inputId;
		int inputBalance;
		double inputInterest;

		Account[] array = new Account[loa];

		Scanner input = new Scanner(System.in);

		for(int i = 0; i<aloa ; i++){
			System.out.print((i+1)+" ��° ���� ��ȣ �Է� : ");
			inputId = input.nextLine();

			System.out.print("\n�ܾ� �Է� : ");
			inputBalance = input.nextInt();

			input.nextLine(); // ������ ���� ����

			array[i] = new Account(inputId, inputBalance);
			System.out.println("");
		}

		for(int i = aloa ; i<loa ; i++){
			System.out.print((i+1)+" ��° ���� ��ȣ �Է� : ");
			inputId = input.nextLine();

			System.out.print("\n�ܾ� �Է� : ");
			inputBalance = input.nextInt();

			System.out.print("\n������ ���� : ");
			inputInterest = input.nextDouble();

			input.nextLine(); // ������ ���� ����

			array[i] = new MyAccount(inputId, inputBalance,inputInterest);
			System.out.println("");
		}

		print(array);

		System.out.println("������ 2�� ����");
		doubleInterest(array);

		print(array);

	}

	private static void print(Account[] array){
		for(int i = 0 ; i<array.length ; i++){
			if(array[i] instanceof Account){
				System.out.println(array[i].getId()+" ������ ���� ���� �Ѿ��� "+array[i].getTotal()+"�� �Դϴ�.");
			}
			else{
				System.out.println(array[i].getId()+" ������ �������� "+((MyAccount)array[i]).getInterest()+" �̸�, ���� ���� �Ѿ��� "+((MyAccount)array[i]).getTotal()+"�� �Դϴ�.");
			}
			System.out.println("");
		}
	}

	private static void doubleInterest(Account[] array)
	{
		for(int i = 0 ; i<array.length ; i++){
			if(array[i] instanceof MyAccount){
				((MyAccount)array[i]).setInterest(((MyAccount)array[i]).getInterest()*2);
			}
		}
	}
}

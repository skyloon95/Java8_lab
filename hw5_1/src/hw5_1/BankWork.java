/*
 *���ϸ� : BankWork.java
 *�ۼ��� : 2017.4.11
 *�ۼ��� : 201432014 �𼳾�
 *���� : ����̹� Ŭ���� 
 */
package hw5_1;

import java.util.Scanner; 

/**
 * @author snow
 *
 */
public class BankWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw5_1 : �𼳾�\n");

		BankAccount myAccount = new BankAccount(); // ��ü ����
		Scanner input = new Scanner(System.in);

		int userSelect; // ����� �Է� ����

		while(true){ // �ݺ� ������ ���� ����
			System.out.println("1 : �Ա� / 2 : ��� / 3 : �ܾ� ��ȸ / 4 : ����\n");

			System.out.print("���ϴ� �۾��� �ش��ϴ� ��ȣ�� �Է����ּ��� : "); // ���� �ȳ���

			while(true){ // userSelect ���� �Է¹޴� ����
				userSelect = input.nextInt();

				if(userSelect>=1 && userSelect<=4) break;

				else{ // �߸��� �Է��� ���� ��� �ݺ� �ȳ���
					System.out.print("�߸��� ��ɾ� �Դϴ�.\n1,2,3,4 �θ� �Է��� �ּ��� : ");
				}
			}

			switch (userSelect){ // ������ ������ �۾��� ����.
			case 1 :
				doDeposit(myAccount); // �Աݿ� �żҵ�
				break;

			case 2 :
				doWithdraw(myAccount); // ��ݿ� �żҵ�
				break;

			case 3 : 
				System.out.println("�ܾ� : "+ myAccount.getBalance()); // �ܾ� ���.
				break;

			case 4 : 
				break; // ����ġ ����

			}
			
			if(userSelect==4) break; // ���α׷� ����.
			
			System.out.println("\n\n\n\n");
		}
	}

	private static void doDeposit(BankAccount myAccount){
		int money;

		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n�Ա� �޴��Դϴ�.");

		System.out.print("�Ա��Ͻ� �ݾ��� �Է��� �ּ��� : ");
		money=input.nextInt();

		myAccount.deposit(money);
	}

	private static void doWithdraw(BankAccount myAccount){
		int money;

		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n��� �޴��Դϴ�.");

		System.out.println("���� ��� ������ �ִ� �ݾ��� "+myAccount.getBalance()+"�� �Դϴ�.");
		System.out.print("����Ͻ� �ݾ��� �Է��� �ּ��� : ");
		money=input.nextInt();

		myAccount.withdraw(money);
	}

}

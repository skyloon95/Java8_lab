/*
 *���ϸ� : BankAccount.java
 *�ۼ��� : 2017.4.11
 *�ۼ��� : 201432014 �𼳾�
 *���� : �ܾ� �ʵ�, �Ա�, ���, �ܾ���ȸ �޼ҵ�
 */
package hw5_1;

/**
 * @author snow
 *
 */
public class BankAccount {
	int balance; // �ܾ�
	
	
	int getBalance(){ // �ܾ� ����
		return balance;
	}
	
	void deposit(int money){ // �Ա�
		balance += money;
	}
	
	void withdraw(int money){ // ���
		if(balance-money>=0){
			balance -= money;
		}
		else{
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println(balance+"�� ���Ϸθ� ��� �����մϴ�.\n\n");
		}
		
	}

}

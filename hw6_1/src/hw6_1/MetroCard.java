/*
 * ���ϸ� : MetroCard.java
 * �ۼ��� : 20170427
 * �ۼ��� : �𼳾�
 * ���� : ����ö ī�� ����
 */
package hw6_1;

/**
 * @author snow
 *
 */

public class MetroCard {
	private int balance;// (1) �ܾ� �ʵ�



	public MetroCard(int balance){
		this.balance = balance;// (2) �ܾ��� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	}





	public int getBalance(){
		return balance;// (3) getBalance() - �ܾ� getter
	}





	public void ride(){
		if(balance>=1000){
			balance -= 1000;
			System.out.println("ž��");
		}
		
		else{
			System.out.println("�ܾ��� ���ڶ��ϴ�. ž���� �� �����ϴ�.\n");// (4) ride() - 1ȸ ž�¸��� ȣ��Ǵ� �޼ҵ�
		}
	}




	public void charge(int money){
		balance += money;// (5) charge() -�Ű������� ���� �ݾ׸�ŭ �����ϴ� �޼ҵ�
	}


}

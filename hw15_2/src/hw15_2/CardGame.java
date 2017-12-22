/*
 * CardGame.java
 * �ۼ��� : 201432014 �𼳾�
 * ���� : �� �÷��̾�� ������ ī�带 �����ְ� ī�� ������ ������ ���غ� �� ������������ �����Ͽ� ū���� �̱�� ��⸦ 10��Ʈ ����.
 */
package hw15_2;

import java.util.ArrayList;
import java.util.Collections;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

class Card {
	int number;

	public Card(int number) {
		this.number = number;
	}

	@Override
	public String toString() { // to String �������̵�
		return "" +number;
	}

}

class Deck {
	ArrayList<Card> deck = new ArrayList<Card>();
	int[] number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

	// ī�带 �����Ͽ� ���� �ִ´�.
	public Deck() {
		// 20���� ī�带 ������ �մ� ���� �����.
		for (int j = 0; j < number.length; j++)
			deck.add(new Card(number[j]));
	}

	// ī�带 ���´�.
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// ���� ó������ ī�带 �����Ͽ��� ��ȯ�Ѵ�.
	public Card deal() {//���� �� ��� null�� ��ȯ
		if(deck.isEmpty())
			return null;
		return deck.remove(0);
	}

}

class Player {
	ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards() {
		System.out.println(list);
	}

	public int sum(){//list�� ��� ī�� ���ڰ��� ����
		int sum = 0;
		for(int i = 0; i<list.size() ; i++){
			sum += list.get(i).number;
		}

		return sum;
	}

	public void sortList(){ // ī�带 ������������ ���� �ϴ� CollectionsŬ���� sort�޼ҵ�
		Collections.sort(list, (n1,n2)-> n2.number - n1.number);
	}

	public Card deal (){ // ī�� �ϳ��� �̾Ƴ��� ��ȯ�ϰ� list���� ����.
		return list.remove(0);
	}
}

public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_2 : �𼳾�\n");

		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		while(deck.deck.size()!=0){ // deck ����� 0�� �ƴѰ�� �й�
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}

		System.out.print("�÷��̾�1");
		p1.showCards();// ī�� ����
		System.out.print("�÷��̾�2");
		p2.showCards();// ī�� ����

		System.out.println();

		System.out.println("�÷��̾�1 ī�� �� = "+p1.sum());
		System.out.println("�÷��̾�2 ī�� �� = "+p2.sum());

		System.out.println();

		p1.sortList(); // ī�� ����
		p2.sortList(); // ī�� ����

		System.out.println();

		System.out.println("���� ��");
		System.out.print("�÷��̾�1");
		p1.showCards(); // ī�����
		System.out.print("�÷��̾�2");
		p2.showCards(); // ī�����

		System.out.println();
		
		System.out.println("��Ʈ�� ���� ");
		
		int p1Win = 0; // �̱� Ƚ���� ������ ���� �ΰ�
		int p2Win = 0;

		while(p1.list.size()!=0){ // p1�� p2�� ���� ���� ī�带 �����Ƿ� p1�� ���������Ͽ� ����� 0�� �ƴϸ� ����.
			Card cp1 = p1.deal(); // card�� ���� cp1, cp2�� ���� p1, p2���� ���Ϲ��� �� ����.
			Card cp2 = p2.deal();

			if(cp1.number-cp2.number<0){//�¸��� �Ǻ�
				System.out.print("2 ");
				p2Win++;
			}

			else if(cp1.number-cp2.number>0){
				System.out.print("1 ");
				p1Win++;
			}
		}
		System.out.println();
		
		System.out.println("�÷��̾� 1 : �÷��̾� 2 = "+p1Win+" : "+p2Win); // �÷��̾� �¼� ��
		System.out.println();
		
		if(p1Win-p2Win>0){ // ��ü ���� �¸��� ����
			System.out.println("�÷��̾� 1 �¸�");
		}
		else if(p1Win-p2Win==0){
			System.out.println("���");
		}
		else if(p1Win-p2Win<0){
			System.out.println("�÷��̾� 2 �¸�");
		}

	}
}
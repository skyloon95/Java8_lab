/*
 * CardGame.java
 * �ۼ��� : 201432014 �𼳾�
 * ���� : �� �÷��̾�� ������ ī�带 �����ְ� ī�� ������ ������ ���Ͽ� ��������� ���ڷ� ���
 */
package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

class Card {
	int number;

	public Card(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
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
	public Card deal() {
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
}

public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1 : �𼳾�\n");
		
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		while(deck.deck.size()!=0){ // deck ����� 0�� �ƴѰ�� �й�
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
		p1.showCards();
		p2.showCards();
		
		System.out.println();
		
		System.out.println("�÷��̾�1 ī�� �� = "+p1.sum());
		System.out.println("�÷��̾�2 ī�� �� = "+p2.sum());
		
		System.out.println();
		
		if(p1.sum()-p2.sum()<0){//�¸��� �Ǻ�
			System.out.println("�÷��̾� 2 �¸�");
		}
		else if(p1.sum()-p2.sum()==0){
			System.out.println("���");
		}
		else if(p1.sum()-p2.sum()>0){
			System.out.println("�÷��̾� 1 �¸�");
		}
	}
}
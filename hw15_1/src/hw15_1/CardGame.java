/*
 * CardGame.java
 * 작성자 : 201432014 모설아
 * 내용 : 두 플레이어에게 번갈아 카드를 나눠주고 카드 숫자의 총합을 구하여 높은사람을 승자로 출력
 */
package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 

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

	// 카드를 생성하여 덱에 넣는다.
	public Deck() {
		// 20장의 카드를 가지고 잇는 텍을 만든다.
		for (int j = 0; j < number.length; j++)
			deck.add(new Card(number[j]));
	}

	// 카드를 섞는다.
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// 덱의 처음에서 카드를 제거하여서 반환한다.
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

	public int sum(){//list의 모든 카드 숫자값을 더함
		int sum = 0;
		for(int i = 0; i<list.size() ; i++){
			sum += list.get(i).number;
		}
		
		return sum;
	}
}

public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1 : 모설아\n");
		
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		while(deck.deck.size()!=0){ // deck 사이즈가 0이 아닌경우 분배
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
		p1.showCards();
		p2.showCards();
		
		System.out.println();
		
		System.out.println("플레이어1 카드 합 = "+p1.sum());
		System.out.println("플레이어2 카드 합 = "+p2.sum());
		
		System.out.println();
		
		if(p1.sum()-p2.sum()<0){//승리자 판별
			System.out.println("플레이어 2 승리");
		}
		else if(p1.sum()-p2.sum()==0){
			System.out.println("비김");
		}
		else if(p1.sum()-p2.sum()>0){
			System.out.println("플레이어 1 승리");
		}
	}
}
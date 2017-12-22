/*
 * CardGame.java
 * 작성자 : 201432014 모설아
 * 내용 : 두 플레이어에게 번갈아 카드를 나눠주고 카드 숫자의 총합을 구해본 뒤 내림차순으로 정렬하여 큰쪽이 이기는 경기를 10세트 진행.
 */
package hw15_2;

import java.util.ArrayList;
import java.util.Collections;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 

class Card {
	int number;

	public Card(int number) {
		this.number = number;
	}

	@Override
	public String toString() { // to String 오버라이드
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
	public Card deal() {//덱이 빈 경우 null을 반환
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

	public void sortList(){ // 카드를 내림차순으로 정렬 하는 Collections클래스 sort메소드
		Collections.sort(list, (n1,n2)-> n2.number - n1.number);
	}

	public Card deal (){ // 카드 하나를 뽑아내어 반환하고 list에서 제거.
		return list.remove(0);
	}
}

public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_2 : 모설아\n");

		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		while(deck.deck.size()!=0){ // deck 사이즈가 0이 아닌경우 분배
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}

		System.out.print("플레이어1");
		p1.showCards();// 카드 공개
		System.out.print("플레이어2");
		p2.showCards();// 카드 공개

		System.out.println();

		System.out.println("플레이어1 카드 합 = "+p1.sum());
		System.out.println("플레이어2 카드 합 = "+p2.sum());

		System.out.println();

		p1.sortList(); // 카드 정렬
		p2.sortList(); // 카드 정렬

		System.out.println();

		System.out.println("정렬 후");
		System.out.print("플레이어1");
		p1.showCards(); // 카드공개
		System.out.print("플레이어2");
		p2.showCards(); // 카드공개

		System.out.println();
		
		System.out.println("셋트별 승자 ");
		
		int p1Win = 0; // 이긴 횟수를 저장할 변수 두개
		int p2Win = 0;

		while(p1.list.size()!=0){ // p1과 p2는 같은 수의 카드를 가지므로 p1을 기준으로하여 사이즈가 0이 아니면 실행.
			Card cp1 = p1.deal(); // card형 변수 cp1, cp2에 각각 p1, p2에서 리턴받은 값 저장.
			Card cp2 = p2.deal();

			if(cp1.number-cp2.number<0){//승리자 판별
				System.out.print("2 ");
				p2Win++;
			}

			else if(cp1.number-cp2.number>0){
				System.out.print("1 ");
				p1Win++;
			}
		}
		System.out.println();
		
		System.out.println("플레이어 1 : 플레이어 2 = "+p1Win+" : "+p2Win); // 플레이어 승수 비교
		System.out.println();
		
		if(p1Win-p2Win>0){ // 전체 게임 승리자 공개
			System.out.println("플레이어 1 승리");
		}
		else if(p1Win-p2Win==0){
			System.out.println("비김");
		}
		else if(p1Win-p2Win<0){
			System.out.println("플레이어 2 승리");
		}

	}
}
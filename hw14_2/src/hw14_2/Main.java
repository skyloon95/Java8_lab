package hw14_2;

import java.util.Scanner;

class TooSmallException extends Exception{
	public TooSmallException(){
		super("정수값이 너무 작습니다.");
	}
}

class TooBigException extends Exception{
	public TooBigException(){
		super("정수값이 너무 큽니다.");
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("hw14_2: 모설아");

		Scanner input = new Scanner(System.in);
		System.out.print("1~100 범위의 정수를 입력하세요: ");
		int value;
		try{
			value = input.nextInt();
			if (value<1){
				throw new TooSmallException();
			}
			else if(value>100){
				throw new TooBigException();
			}
		} catch(TooSmallException e){
			value = 1;
			System.out.println(e.getMessage());
		} catch(TooBigException e){
			value = 100;
			System.out.println(e.getMessage());
		}
		System.out.println("value = " + value);
	}
}


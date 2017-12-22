package hw14_2;

import java.util.Scanner;

class TooSmallException extends Exception{
	public TooSmallException(){
		super("�������� �ʹ� �۽��ϴ�.");
	}
}

class TooBigException extends Exception{
	public TooBigException(){
		super("�������� �ʹ� Ů�ϴ�.");
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("hw14_2: �𼳾�");

		Scanner input = new Scanner(System.in);
		System.out.print("1~100 ������ ������ �Է��ϼ���: ");
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


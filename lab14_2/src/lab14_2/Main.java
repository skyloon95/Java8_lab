package lab14_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("lab14_2: �𼳾�");
		Scanner scan = new Scanner(System.in);

		int age;
		System.out.print("���� �Է�: ");
		try{age = scan.nextInt();
		} catch(InputMismatchException e){
			age=20;
		}

		System.out.println("���̴� " + age);
	}
}
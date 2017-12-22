package lab14_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("lab14_2: 모설아");
		Scanner scan = new Scanner(System.in);

		int age;
		System.out.print("나이 입력: ");
		try{age = scan.nextInt();
		} catch(InputMismatchException e){
			age=20;
		}

		System.out.println("나이는 " + age);
	}
}
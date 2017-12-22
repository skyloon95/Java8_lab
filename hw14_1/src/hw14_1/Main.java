/*
 *Main.java
 *작성자 : 201432014 모설아
 *내용 : 
 */
package hw14_1;


import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * @author snow
 *
 */
public class Main {
	/**
	 * @param args
	 */
	// 두개의 파일로부터 정수값을 읽어 출력하는 프로그램

	public static void main(String[] args) {
		System.out.println("hw14_1: 모설아");

		// getData1()이 리턴한 값 value1을 출력, 예외처리를 하지 않음
		System.out.println("\n(1) 파일 data1.txt로부터 정수값을 읽어 출력합니다.");
		int value1 = FileService.getData1("data1.txt");
		System.out.println("value1 = " + value1);

		// getData2()이 리턴한 값 value을 출력하되, 파일을 찾지 못하면 예외객체의 메시지(e.getMessage)를 출력
		System.out.println("\n(2) 파일 data2.txt로부터 정수값을 읽어 출력합니다.");
		try{
			int value2 = FileService.getData2("data2.txt");
			System.out.println("value2 = " + value2);
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}

// 파일의 데이터를 읽는 두개의 정적 메소드를 제공하는 클래스
class FileService {
	// 파일을 찾지 못하면 value를 -1을 리턴하도록 예외처리
	public static int getData1(String fileName) {
		int value;
		try{
			Scanner input = new Scanner(new File(fileName));
			value = input.nextInt(); 
		} catch(FileNotFoundException e){
			value=-1;
		}
		
		return value;
	}

	// 파일을 찾지 못하더라도 여기서 예외 처리하지 않고 상위 메소드에 예외를 전달(propagate)
	public static int getData2(String fileName) throws FileNotFoundException {
		int value;
		Scanner input = new Scanner(new File(fileName));
		value = input.nextInt(); 
		return value;
	}
}

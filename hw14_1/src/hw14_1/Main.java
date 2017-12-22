/*
 *Main.java
 *�ۼ��� : 201432014 �𼳾�
 *���� : 
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
	// �ΰ��� ���Ϸκ��� �������� �о� ����ϴ� ���α׷�

	public static void main(String[] args) {
		System.out.println("hw14_1: �𼳾�");

		// getData1()�� ������ �� value1�� ���, ����ó���� ���� ����
		System.out.println("\n(1) ���� data1.txt�κ��� �������� �о� ����մϴ�.");
		int value1 = FileService.getData1("data1.txt");
		System.out.println("value1 = " + value1);

		// getData2()�� ������ �� value�� ����ϵ�, ������ ã�� ���ϸ� ���ܰ�ü�� �޽���(e.getMessage)�� ���
		System.out.println("\n(2) ���� data2.txt�κ��� �������� �о� ����մϴ�.");
		try{
			int value2 = FileService.getData2("data2.txt");
			System.out.println("value2 = " + value2);
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}

// ������ �����͸� �д� �ΰ��� ���� �޼ҵ带 �����ϴ� Ŭ����
class FileService {
	// ������ ã�� ���ϸ� value�� -1�� �����ϵ��� ����ó��
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

	// ������ ã�� ���ϴ��� ���⼭ ���� ó������ �ʰ� ���� �޼ҵ忡 ���ܸ� ����(propagate)
	public static int getData2(String fileName) throws FileNotFoundException {
		int value;
		Scanner input = new Scanner(new File(fileName));
		value = input.nextInt(); 
		return value;
	}
}

package lab9_2;

/*
 * ���ϸ�: Main.java
 * �ۼ���: 2017�� 5�� 22��
 * �ۼ���: �𼳾�
 * ����: ���������� ���� �������̽��� �̸� �����ϴ� Ŭ������ ����ϴ� ���������ý��� ���α׷�
 */

import java.util.Scanner;

//�������̽� Sample ����
interface Sample {
	int sampleMethod();  // �Ű������� ����, int ���� �����ϴ� �߻�޼ҵ� sampleMethod()

}

//(1) �����⸦ ���� �������̽� Validator ���� - int�� ���� �Ű������� �ް�, boolean ���� �����ϴ� �߻�޼ҵ� isValid()�� ����
interface Validator{
	boolean isValid(int num);
}



// �ϳ��� �����⸦ ���ϴ� ���������ý��� Ŭ���� IntegerValidateSystem
class IntegerValidateSystem {
	// �ν��Ͻ� ����: ������
	private Validator validator;

	// ���ο� �����⸦ ���
	public void addValidator(Validator v) { 
		validator = v;
	}

	// ��ϵ� �����⸦ �̿��Ͽ� ������ ������ ����� ���
	public void printValidateResult(int num) { 
		if(validator.isValid(num)) {
			System.out.println(num + "�� �հ��Դϴ�.");
		}
		else {
			System.out.println(num + "�� ���հ��Դϴ�.");
		}
	}
}

public class Main {
	public static void main(String[] args) {

		System.out.println("lab9_2: �𼳾�");

		Scanner input = new Scanner(System.in);
		System.out.print("������ �������� �Է��ϼ���: ");
		int value = input.nextInt();

		// ���������ý����� ����
		IntegerValidateSystem mySystem = new IntegerValidateSystem();

		// ScoreValidator ��ü�� mySystem�� ������� ���
		mySystem.addValidator((num)->0<=num&&num<=100);

		// testSystem���� value�� ����
		mySystem.printValidateResult(value);

		// (3) EvenValidator ��ü�� mySystem�� ������� �ٽ� ���
		mySystem.addValidator((num)->num%2==0);



		// (4) mySystem���� value�� �ٽ� ����
		mySystem.printValidateResult(value);



	}
}

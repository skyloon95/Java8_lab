package lab9_1;

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

//Validator�� �����ϴ� ScoreValidator Ŭ������ ����
class ScoreValidator implements Validator {
	@Override
	public boolean isValid(int num) { // �������� 0~100 ������ ���ΰ��� ����
		return num >= 0 && num <= 100;
	}
}

//(2) Validator�� �����ϴ� EvenValidator Ŭ������ ���� - isValid() �޼ҵ�� �������� ¦���ΰ��� ����
class EvenValidator implements Validator{
	@Override
	public boolean isValid(int num){
		return num%2==0;
	}
}




public class Main {
	public static void main(String[] args) {

		System.out.println("lab9_1: �𼳾�");

		Scanner input = new Scanner(System.in);
		System.out.print("������ �������� �Է��ϼ���: ");
		int value = input.nextInt();

		// ���������ý����� ����
		IntegerValidateSystem mySystem = new IntegerValidateSystem();

		// ScoreValidator ��ü�� mySystem�� ������� ���
		mySystem.addValidator(new ScoreValidator());

		// testSystem���� value�� ����
		mySystem.printValidateResult(value);

		// (3) EvenValidator ��ü�� mySystem�� ������� �ٽ� ���
		mySystem.addValidator(new EvenValidator());



		// (4) mySystem���� value�� �ٽ� ����
		mySystem.printValidateResult(value);



	}
}


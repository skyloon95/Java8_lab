/*
 *Main.java
 *�ۼ��� : 201432014 �𼳾�
 *AdultTesterŬ���� ��� ����Ŭ������ �̿��Ͽ� �ۼ� 
 */
package hw9_3;

/**
 * @author snow
 *
 */

class Person{
	int age;
	String name;
}

@FunctionalInterface
interface Tester{
	void test(Person person);
}

public class Main {

	/**
	 * @param args
	 */
	
	public static void checkPerson(Person p, Tester tester){
		tester.test(p);
	}

	public static void main(String[] args) {
		System.out.println("hw9_3 : �𼳾�\n");
		
		Person person = new Person();
		person.age = 21;
		
		checkPerson(person, new Tester(){
			@Override
			public void test(Person p){
				System.out.println(p.age>20);
			}
		});
	}

}

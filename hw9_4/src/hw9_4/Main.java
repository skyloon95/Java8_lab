/*
 *Main.java
 *작성자 : 201432014 모설아
 *AdultTester클래스 대신 무명클래스를 이용하여 작성 
 */
package hw9_4;

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
		System.out.println("hw9_4 : 모설아\n");
		
		Person person = new Person();
		person.age = 21;
		
		checkPerson(person, (Person p)->System.out.println(p.age>20));
	}

}
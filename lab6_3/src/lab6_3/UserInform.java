/*
 *���ϸ� : UserInform.java
 *�ۼ��� : 2017.4.20
 *������ : 201432014 �𼳾�
 *���� : ȸ�� ���� 
 */
package lab6_3;

/**
 * @author snow
 *
 */
public class UserInform {
	private String name;
	private static int userCount=0;
	private int userNumber;
	
	public UserInform(String name){
		this.name = name;
		userNumber = (userCount++)+1;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getUserNumber(){
		return userNumber;
	}
	
	public static int getUserCount(){
		return userCount;
	}

}

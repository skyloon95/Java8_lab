/*
 *���ϸ� : UserManage.java
 *�ۼ��� : 2017.4.20
 *�ۼ��� : 201432014 �𼳾�
 *���� : ���� ���� ����� 
 */
package lab6_3;

/**
 * @author snow
 *
 */
public class UserManage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("lab6_3 : �𼳾�\n");
		
		System.out.println("ȸ�� ���� ���� ���α׷��Դϴ�.\n");
		
		System.out.println("���� ȸ�� �� : " + UserInform.getUserCount());
		
		UserInform user1 = new UserInform("������");
		UserInform user2 = new UserInform("�ɻ���");
		UserInform user3 = new UserInform("��ö��");
		
		printUserInform(user1);
		printUserInform(user2);
		printUserInform(user3);
		
		System.out.println("\n���� ȸ�� �� : " + UserInform.getUserCount());
	}
	
	private static void printUserInform(UserInform user){
		System.out.println("\n");
		System.out.println("ȸ�� �̸� : " + user.getName());
		System.out.println("ȸ�� ��ȣ : " + user.getUserNumber());
	}

}

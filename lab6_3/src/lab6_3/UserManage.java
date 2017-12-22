/*
 *파일명 : UserManage.java
 *작성일 : 2017.4.20
 *작성자 : 201432014 모설아
 *내용 : 유저 정보 입출력 
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
		System.out.println("lab6_3 : 모설아\n");
		
		System.out.println("회원 정보 관리 프로그램입니다.\n");
		
		System.out.println("현재 회원 수 : " + UserInform.getUserCount());
		
		UserInform user1 = new UserInform("문재인");
		UserInform user2 = new UserInform("심상정");
		UserInform user3 = new UserInform("안철수");
		
		printUserInform(user1);
		printUserInform(user2);
		printUserInform(user3);
		
		System.out.println("\n현재 회원 수 : " + UserInform.getUserCount());
	}
	
	private static void printUserInform(UserInform user){
		System.out.println("\n");
		System.out.println("회원 이름 : " + user.getName());
		System.out.println("회원 번호 : " + user.getUserNumber());
	}

}

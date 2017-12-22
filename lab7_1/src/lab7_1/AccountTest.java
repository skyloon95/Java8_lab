package lab7_1;

public class AccountTest {
	public static void main(String[] args) {
		System.out.println("lab7_1 : 모설아\n\n");

		Account a1 = new Account("536801-04-127968", 1000);
		System.out.println("계좌번호 : "+a1.getId());
		System.out.println("만기 해지 총액 : "+a1.getTotal());
		System.out.println("\n");

		MyAccount a2 = new MyAccount("536802-04-086761",1000,0.05);
		System.out.println("계좌번호 : "+a2.getId());
		System.out.println("이자율 : "+a2.getInterest());
		System.out.println("만기 해지 총액 : "+a2.getTotal());

		System.out.println("\n");

		a2.setBalance(2000);
		a2.setInterest(0.1);
		System.out.println("계좌번호 : "+a2.getId());
		System.out.println("이자율 : "+a2.getInterest());
		System.out.println("만기 해지 총액 : "+a2.getTotal());

	}

}

package lab7_1;

public class AccountTest {
	public static void main(String[] args) {
		System.out.println("lab7_1 : �𼳾�\n\n");

		Account a1 = new Account("536801-04-127968", 1000);
		System.out.println("���¹�ȣ : "+a1.getId());
		System.out.println("���� ���� �Ѿ� : "+a1.getTotal());
		System.out.println("\n");

		MyAccount a2 = new MyAccount("536802-04-086761",1000,0.05);
		System.out.println("���¹�ȣ : "+a2.getId());
		System.out.println("������ : "+a2.getInterest());
		System.out.println("���� ���� �Ѿ� : "+a2.getTotal());

		System.out.println("\n");

		a2.setBalance(2000);
		a2.setInterest(0.1);
		System.out.println("���¹�ȣ : "+a2.getId());
		System.out.println("������ : "+a2.getInterest());
		System.out.println("���� ���� �Ѿ� : "+a2.getTotal());

	}

}

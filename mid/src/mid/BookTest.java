package mid;


public class BookTest {

	public static void main(String[] args) {
		System.out.println("mid : �𼳾�");
		
		Book book1 = new Book("java1",5000);
		Book book2 = new Book("java2",20000);
		
		book1.discountPrice();
		book2.discountPrice();
		
		System.out.println(book1.getTitle()+" : "+book1.getPrice()+"��");
		System.out.println(book2.getTitle()+" : "+book2.getPrice()+"��");

	}

}

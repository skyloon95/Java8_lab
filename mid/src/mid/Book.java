package mid;

public class Book {
	private String title;
	private int price;
	
	public Book (String title,int price){
		this.title = title;
		this.price = price;
	}
	public String getTitle(){
		return title;
	}
	public int getPrice(){
		return price;
	}
	public void discountPrice(){
		if(price<=10000){
			price = (int)(price*0.9);
		}
		else{
			price = price-1000;
		}
		
	}
	

}

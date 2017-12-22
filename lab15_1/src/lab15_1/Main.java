package lab15_1;

class Box<T>{
	private T data;
	public void set(T data){
		this.data = data;
	}
	public T get(){
		return data;
	}
}

public class Main {

	public static void main(String[] args) {
		System.out.println("lab15_1 : �𼳾�");
		
		Box<String> bs = new Box<String>();
		bs.set("Hello World!");
		String s = bs.get();
		System.out.println(s);
		
		Box<Integer> bi = new Box<Integer>();
		bi.set(new Integer(10));
		Integer i = bi.get();
		System.out.println(i);
		
		Box<Double> bd = new Box<Double>();
		bd.set(new Double(3.14));
		Double d = bd.get();
		System.out.println(d);

	}

}
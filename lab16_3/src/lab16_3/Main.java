package lab16_3;

public class Main { 

	private static class MyThread extends Thread {  
		@Override 
		public void run(){ 
			for(int i = 0; i < 5; i++) { 
				try{
				System.out.print(getName() + " ");
				sleep((int)(Math.random()*1000));
				} catch (InterruptedException e){
					
				}
			}
		} 
	} 

	public static void main(String[] args) throws InterruptedException{ 

		System.out.println("lab16_3: 모설아"); 

		Thread t1 = new MyThread(); 
		Thread t2 = new MyThread(); 
		t1.start(); 
		t2.start();

		for(int i = 0; i < 5; i++) {
			System.out.print(Thread.currentThread().getName() + " ");
			Thread.sleep((int)(Math.random()*1000));
		}
		
		t1.join();
		t2.join();

		System.out.println("\n프로그램을 종료합니다.");
	} 
} 

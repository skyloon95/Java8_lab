package lab4_4;

/**
 * @author snow
 *
 */
public class ExtentOfTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("lab4_4 : �𼳾�\n");
		
		int width1=4,width2=3;
		int hight1=5,hight2=7;
		
		double extent1,extent2;
		
		extent1 = computeExtent(width1,hight1);
		extent2 = computeExtent(width2,hight2);
		
		System.out.printf("�ﰢ�� 1 : �غ� %d, ���� %d, ���� %.1f\n",width1,hight1,extent1);
		System.out.printf("�ﰢ�� 2 : �غ� %d, ���� %d, ���� %.1f\n",width2,hight2,extent2);

	}
	
	private static double computeExtent(int width,int hight){
		double extent = (width*hight)/2.0;
		
		return extent;
		
	}

}

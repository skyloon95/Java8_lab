/*
 * 작성자 : 201432014 모설아
 * 파일명 : lab4_1.jar
 * 작성일 : 2017.03.23
 * 내용 : 배열연습
 */

package lab4_1;

import java.util.*; // 모든 클래스 불러오기.
/**
 * 
 * @author Snow
 *
 */

public class Array {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double[] d = new double[5]; // 더블형 배열 참조 변수 d선언 후  더블형 5개짜리 변수 객체의 주소를 저장함.
		double sum = 0.0; // 더한 값을 저장할 변수

		System.out.println("lab4_1 : 모설아\n");

		for(int i=0;i<d.length;i++){ // 배열 원소 전체 출력
			System.out.print(d[i]+" ");
		}

		System.out.println("\n");

		Scanner input = new Scanner(System.in); // 스캐너형 객체 인풋 선언 후, 키보드 입력을 할당.

		for(int i=0;i<d.length;i++){ // 모든 인덱스에 값 입력받기
			System.out.print((i+1)+"번째 실수 입력 : ");
			d[i]=input.nextDouble();
		}

		System.out.print("\n");

		for(int i=0;i<d.length;i++){ // 원소 전체 출력
			System.out.print(d[i]+" ");
		}

		for(int i=0;i<d.length;i++){ // 전부 더하여 sum에 저장.
			sum+=d[i];
		}

		System.out.println("\n합 = "+ sum); // 결과 값 출력

	}

}
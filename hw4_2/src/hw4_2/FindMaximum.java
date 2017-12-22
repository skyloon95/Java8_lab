/*
 *파일명 : FindMaximun.java
 *작성자 : 201432014 모설아
 *작성일 : 2017.3.31
 *내용 : 최댓값위치 출력
 */
package hw4_2;

import java.util.*;

/**
 * @author snow
 *
 */
public class FindMaximum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hw4_2 : 모설아\n");
		
		int arrLength; // 배열 길이 설정 변수
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("이 프로그램은 입력하신 정수배열에서 가장 큰 수의 값과 인덱스를 알려드립니다.");
		System.out.println("(안내되는 인덱스는 최대값이 동시에 여러개일 경우 가장 앞에 있는 값을 출력합니다.)");
		System.out.print("입력하실 정수들의 총 개수를 정해주세요 : ");
		arrLength = input.nextInt();
		
		int[] arr = new int[arrLength]; // 사용자가 원한 길이만큼의 배열 객체 선언.
		
		System.out.print(arrLength + "개의 정수를 입력 해 주세요 : ");
		
		for(int i = 0 ; i < arrLength ; i++){ // 배열 입력받기
			arr[i] = input.nextInt();
		}
		
		int resultIndex = findIndex(arr, arrLength);
		
		System.out.println("최대값의 인덱스 : " + resultIndex);
		System.out.println("최대값 : " + arr[resultIndex]);

	}
	
	private static int findIndex (int[] carr, int carrLength){ // 배열의 최댓값의 인덱스를 리턴하는 함수.
		int max, index;
		
		index = 0; // 0번째가 최댓값일 경우를 대비하여 0으로 초기화
		max = carr[0]; // 우선 0번째 원소 값을 max값에 넣는다.
		
		for(int i = 1 ; i<carrLength ; i++){
			if(carr[i]>max){ // 최대값이 두개 이상인 경우 최소 인덱스를 저장해야 하므로 max를 초과할 경우에만 실행
				max = carr[i];
				index = i; 
			}
		}
		
		return index;
	}

}

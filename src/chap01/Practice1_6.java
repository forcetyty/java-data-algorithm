package chap01;

import java.util.Scanner;

// 실습 1 - 5
// For문의 반복
public class Practice1_6 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 N까지의 합을 구합니다.");
		System.out.println("N의 값 :");
		int n = stdIn.nextInt();
		
		int sum = 0;	//합
		// for문의 조건식을 통해 반복횟수 지정
		// for(초기화 부분; 제어식; 업데이트 부분)
		for(int i = 1; i <= n; i++) {
			sum += i;	// sum에 i를 더합니다.
		}
		
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
		
	}

}

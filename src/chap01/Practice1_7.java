package chap01;

import java.util.Scanner;

// 실습 1-6 
public class Practice1_7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		System.out.println("1부터 N까지의 합을 구합니다.");
		
		
		// n이 0보다 클 때까지 반복
		// do 문 while(제어식)
		do {
			System.out.println("N의 값 :");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;	// 합 변수
		
		for(int i = 1; i <= n; i++) {
			sum+=i;	// sum에 i를 더함
		}
		
		System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
		
		
	}

}

package chap01;

import java.util.Scanner;

//실습 1-4
public class Practice1_5 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 N까지의 합을 구합니다.");
		System.out.println("N의 값 :");
		int n = stdIn.nextInt();
		
		int sum = 0;	// 합
		int i = 1;
		
		//while문을 계속 반복하면서 값을 더해나간다.
		while(i <= n) {	//i가 N 이하면 반복합니다.
			sum += i;	//Sum에 i를 더합니다.
			i++;		//i값을 1만큼 증가시킵니다.
		}
		
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
	}

}

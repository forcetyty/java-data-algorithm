package chap01;

import java.util.Scanner;

// 실습 1C-1
// 중앙값 구하는 알고리즘
public class Practice1_3 {

	static int med3(int a, int b, int c) {
		// 3개의 입력받는 값을 비교해서 
		// 중앙값을 처리하는 로직!!!
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값 :");
		int a = stdIn.nextInt();
		System.out.println("b의 값 :");
		int b = stdIn.nextInt();
		System.out.println("c의 값 :");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
		
	}

}

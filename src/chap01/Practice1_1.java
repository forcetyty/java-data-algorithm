package chap01;

import java.util.Scanner;

//세 값의 최댓값
public class Practice1_1 {
	
	//순차적 구조 알고리즘
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 :"); int a = stdIn.nextInt();
		System.out.println("b의 값 :"); int b = stdIn.nextInt();
		System.out.println("c의 값 :"); int c = stdIn.nextInt();
		
		
		// a, b, c 중 최댓값을 구하여 max에 대입
		// if문 _ 선택구조(Selection)
		int max = a;
		if( b > max) max = b;
		if( c > max) max = c;
		
		System.out.println("최댓값은 " + max + "입니다");
		
	}

}

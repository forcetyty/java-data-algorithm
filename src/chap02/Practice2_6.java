package chap02;

import java.util.Scanner;

// 실습 2-6
// 배열의 요소를 역순으로 출력하는 알고리즘
public class Practice2_6 {
	
	//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		// t는 임시변수 역활
		int t = a[idx1];		
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i -1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 :");
		int num = stdIn.nextInt();		//요솟수
		
		int[] x = new int[num];			//요솟수가 num인 배열
		
		for (int i = 0; i < num; i++) {
			System.out.print("x["+ i +"] :");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);		// 배열 a의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for (int i = 0; i < num; i++) {
			System.out.println("x["+ i +"] = " + x[i]);
		}
	}
	
	
	

}

package chap02;

import java.util.Scanner;


// 배열요소의 최댓값을 구하는 메소드
// 실습 2- 4
// 입력받은 키를 바탕을 가장 큰 키를 찾음
public class Practice2_4 {

	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");

		System.out.println("사람의 수 :"); // 배열의 요솟수를 입력받음
		int num = stdIn.nextInt();

		int[] height = new int[num]; // 요솟수가 num인 배열을 생성

		// 가장 키가 큰 사람의 수를 찾는 알고리즘!!!
		for (int i = 0; i < height.length; i++) {
			System.out.println("height[" + i + "] : ");
			height[i] = stdIn.nextInt();
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");

	}

}

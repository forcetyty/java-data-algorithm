package chap02;

// 실습 2-10
// 3이 소수인지 판단하는 과정
public class Practice2_10 {

	public static void main(String[] args) {

		int counter = 0; // 나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 갯수
		int[] prime = new int[500]; // 소수를 저장하는 배열

		prime[ptr++] = 2;

		// 대상은 홀수만
		for (int n = 3; n <= 1000; n += 2) {
			int i;

			// 이미 찾은 소수로 나누어 봄
			for (i = 1; i < ptr; i++) {
				counter++;

				// 나누어 떨어지면 소수가 아님
				if (n % prime[i] == 0) {
					// 더 이상 반복은 불필요
					break;
				}
			}
			// 마지막까지 나누어떨어지지 않음
			if (ptr == i) {
				// 소수라고 배열에 저장
				prime[ptr++] = n;
			}

		}

		// 찾은 ptr개의 소수를 나타냄
		for (int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}

		System.out.println("나눗셈을 수행한 횟수 :" + counter);

	}

}

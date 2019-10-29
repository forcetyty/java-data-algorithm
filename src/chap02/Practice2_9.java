package chap02;

// 실습 2-9
// 소수의 나열
public class Practice2_9 {

	public static void main(String[] args) {
		int counter = 0; // 나눗셈의 횟수

		for (int n = 2; n <= 1000; n++) {
			
			int i;	// 이 변수 i는 임시성 변수임.
					// A. 실제로 구하고자 하는 값은 ' n ' 이 소수인지 아닌지를 분별하고 싶은 것!!! 

			// i가 n만큼 반복하는 이유는 A.의 이유와 같음 
			for (i = 2; i < n; i++) {
				counter++;
				// 나누어 떨어지면 소수가 아님
				
				if (n % i == 0) {
					break; // 더 이상의 반복은 불필요
				}
			}
			
			// 마지막까지 나누어 떨어지지 않음
			if (n == i) {
				System.out.println(n);
			}
			
		}
		System.out.println("나눗셈을 수행한 횟수 :" + counter);
	}
}

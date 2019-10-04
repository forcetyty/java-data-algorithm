package chap01;

// 예제 소스 코드명 : Max3m
public class Practice1_2 {

	// a, b, c의 최댓값을 구하여 출력
	static int max3(int a, int b, int c) {
		int max = a; // 최댓값

		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}
		return max; // 구한 최댓값을 호출한 곳으로 반환
	}
	
	// 메소드를 정의할 때는 매개변수 = Parameter
	// 메소드를 호출할 때는 실인수 = Actual Argument
	public static void main(String[] args) {
		
		// max3를 호출하고 매개변수로 넣어준 값 중 최댓값을 구한후
		// 실인수를 통해 값을 전달
		System.out.println("max3(3,2,1) =" + max3(3, 2, 1));
		System.out.println("max3(3,2,2) =" + max3(3, 2, 2));
		System.out.println("max3(3,1,2) =" + max3(3, 1, 2));
		System.out.println("max3(3,2,3) =" + max3(3, 2, 3));
		System.out.println("max3(2,1,3) =" + max3(2, 1, 3));
		System.out.println("max3(3,3,2) =" + max3(3, 3, 2));
		System.out.println("max3(3,3,3) =" + max3(3, 3, 3));
		System.out.println("max3(2,2,3) =" + max3(2, 2, 3));
		System.out.println("max3(2,3,1) =" + max3(2, 3, 1));
		System.out.println("max3(2,3,2) =" + max3(2, 3, 2));
		System.out.println("max3(1,3,2) =" + max3(1, 3, 2));
		System.out.println("max3(2,3,3) =" + max3(2, 3, 3));
		System.out.println("max3(1,2,3) =" + max3(1, 2, 3));
	}

}

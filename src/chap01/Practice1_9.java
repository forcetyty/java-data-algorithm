package chap01;

// 다중루프
// 곱셈표 출력
// 실습 1-7
public class Practice1_9 {
	
	public static void main(String[] args) {
		System.out.println("-----------곱셈표 출력-----------");
		
		// 다중루프
		// 2중 for을 통해서 i와 j의 값을 계산
		for(int i = 1; i <=9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}

}

package chap01;

import java.util.Scanner;

// 실습 1C-2
// 논리 연산과 드모르간 법칙
public class Practice1_8 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;
		
		System.out.println("2자리의 정수를 입력하세요 ");
		
		do {
			System.out.println("입력 :");
			no = stdIn.nextInt();
		} while (no < 10 || no > 99); // 핵심 로직 || <- 논리합 연산자
		
		// Tip
		// 단축 평가 (Short circuit evaluation
		// no < 10 || no >99 <- no < 10이 false이면 더이상 연산을 하지 않는다.
		// 이와 같은 평가 방식을 단축 평가라고 한다.
		
		
		System.out.println("변수 no의 값은 " + no + "가 되었습니다.");
	}

}

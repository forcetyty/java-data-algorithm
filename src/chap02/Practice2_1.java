package chap02;

// 실습2-1
// 배열 기초
// 배열의 선언 방법과 구성요소에 대한 숙지
public class Practice2_1 {
	
	public static void main(String[] args) {
		// int[] a;			//선언하기
		// a = new int[5];	//참조하기
		
		int[] a = new int[5];	//배열의 선언
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;		//a[4]에 a[1] * 2, 곧 74를 대입
		
		// 각 요소의 값을 나타냄
		// 구성요소를 초기화하는 값, 곧 배열을 생성할 때 각 구성 요소에 넣어지는 값을 초깃값(default value)라고 한다
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i] );
		}
		
		
	}

}

package array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 배열 (Array) : 같은 자료형의 묶음

		// 배열의 초기화 (1)
		int[] scores = { 89, 100, 99, 91, 82 };
		System.out.println("첫 번 째 값 : " + scores[0]); // alt + shift + r 이름 바꾸는 단축키
		System.out.println("두 번 째 값 : " + scores[1]);
		System.out.println("세 번 째 값 : " + scores[2]);
		System.out.println("네 번 째 값 : " + scores[3]);
		System.out.println("다섯 번 째 값 : " + scores[4]);
		// index (색인)

		// 배열의 초기화 (2)
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);

		// 배열의 값 변경
		numbers[0] = 1000;
		System.out.println(numbers[0]);
		System.out.println(numbers); // hash 값 (c로 치면 주소값)
		
		// 반복문을 이용한 배열값 출력
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 합계 구하기
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
	}

}

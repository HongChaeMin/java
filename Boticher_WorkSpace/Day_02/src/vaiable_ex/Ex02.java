package vaiable_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 자료형 변환 => casting

		// double -> int int -> double

		double pi = 3.14;

		int intPi = (int) pi; // double -> int로 캐스팅 : 소수점버림

		System.out.println(intPi);

		System.out.println((double) intPi); // int -> double : .0이 붙는다

		int num = 7;
		double result = num / 2; // 예상값 : 3.5
		System.out.println(result); // 3.0 // int / int = int

		// 1. 둘 중 하나의 값을 실수로 casting 한다
		result = (double) num / 2;

		// 2. 실수로 나눈다
		result = num / 2.0;
		System.out.println(result);

		// 반올림 하는 법
		// Math.round(실수); => 3.14 => 3 / 3.8 => 4
		pi = 3.141592653;
		System.out.println(Math.round(pi));
		
		// 둘 째 자리까지 반올림해서 나타내는 방법
		// 1. pi에 100을 곱해서 314.1592653 만든다
		// 2. Math.round() 호출 : 소수점 첫째 자리에서 반올림해서 만든다 => 314
		// 3. 3.14로 만들기 위해서 100을 나눈다
		
	}

}
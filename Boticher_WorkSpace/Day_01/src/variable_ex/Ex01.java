package variable_ex;

public class Ex01 {

	public static void main(String[] args) {

		// 정수형 변수 (Integer)
		int number = 10; // 맨 처음 변수에 값을 넣는 것 : '초기화', 변수에 값을 넣는것 : 할당한다. assign
		System.out.println(number);

		number = 100; // 변수이므로 값을 변경할 수 있다. 재사용할 때는 자료형 생략
		System.out.println(number);

		int number2 = 5;
		int sum = number + number2;
		System.out.println(sum);

		// 실수형 변수 (float)
		float f = 1.55555555555555555f;
		System.out.println(f);

		// 문자 변수(character) : 문자 한 개, 작은 따옴표로 감싼다
		char c = 65;
		System.out.println(c);

		// boolean 변수 : true, false
		boolean isReal = true; // camel case (낙타) is_real : snake case(뱀)
		boolean isFalse = false;
		System.out.println("참 : " + isReal);
		System.out.println("거짓 : " + isFalse);

		
		
	}

}

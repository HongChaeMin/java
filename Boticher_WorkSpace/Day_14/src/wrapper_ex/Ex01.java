package wrapper_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 기본 자료형(primitive) : int, double, float, boolean...
		// 참조 자료형(reference) : int[], String, Integer, Double, Float, Boolean -> wrapper class or boxed class
		//						<heap에 들어 있는 자료형 / 주소값이 있는 자료형>
		
		// 필드
		// 메소드
		
		// 1. 기본 자료형(primitive)에 저장하기
		int n1 = 5;
		System.out.println(n1);
		
		// 2. 래퍼 클래스(Wrapper class)에 저장하기
		Integer n2 = 5;
		System.out.println(n2);
		
		// 3. 래퍼 클래스 객체를 만들어 값 저장하기
		Integer n3 = new Integer(5);
		System.out.println(n3);
		
		Integer n4 = 5;
		
		System.out.println(n1 == n2); // int - Integer : true => 값비교
		System.out.println(n1 == n3); // int - new Integer : true => 값비교
		System.out.println(n2 == n3); // Integer - new Integer : false => 주소비교
		System.out.println(n2 == n4); // Integer = Integer : true => 주소비교 (주소값이 재활용되면 참이 나옴)

		System.out.println(n2.equals(n3));
		
		// 둘 다 래퍼 클래스면 .equals 로 비교하기

		Integer num1 = new Integer(15);
		Integer num2 = new Integer(15);
		System.out.println(num1 == num2); // 주소가 같지 않다
		System.out.println(num1.equals(num2));
		
	}

}

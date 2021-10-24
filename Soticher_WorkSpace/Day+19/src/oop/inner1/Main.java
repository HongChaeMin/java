package oop.inner1;

public class Main {

	public static void main(String[] args) {
		
		//중첩클래스
		// - 종류
		//		1. 일반 중첩 클래스 : 클래스 안에 만들어지는 멤버 클래스 - **
		//		2. static중첩 클래스 : 클래스 안에 만들어지는 멤버 클래스 - (객체 생성과 상관 없이 사용) ****
		//		3. 지역중첩클래스 : x
		//		4. 익명중첩클래스 : 부분적 재정의 구문 - *************
		
		//1. 일반 중첩클래스
		//	- 클래스 안에 만들어지는 멤버 클래스
		//	- 클래스의 내부에서 어떤 기능들을 세부적으로 관리하려 할 때 사용된다
		
		Suit s = new Suit();	
		
		s.setPrice(20000);
//		s.t.price = 30000;
//		s.price = 10000;	
//		
//		//s.b.price = 20000; //private
//		
//		Suit.Top t = new Suit.Top();
//		
//		t.price = 20;
//		
//		//Suit.Bottom b = s.new Bottom();
//		
//		s.disp();
	}

}

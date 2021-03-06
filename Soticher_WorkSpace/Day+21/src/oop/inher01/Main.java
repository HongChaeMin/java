package oop.inher01;

public class Main {

	public static void main(String[] args) {
		
		//상속 (Inheritance)
		// - 클래스끼리 물려주거나 물려받는것
		// - 물려준 클래스(부모 클래스)의 속성과 기능을 물려받은 클래스(자식 클래스)
		//	 에서 사용이 가능해지고 물려받은 클래스에서는 추가적인 표편을 통해 새로운
		//	 클래스를 만드는 문법
		// - 클래스의 재활용, 프로그램의 유연성(수정, 삭제, 추가)의 증대를 위해 사용
		// - 상속을 바탕으로 다형성을 구현한다
		
		//형식
		// - 자식 클래스에서 부모 클래스를 지정한다
		// - extends를 통하여 클래스를 상속받는다 (단 1개만)
		// - 아무리 자시기더라도 부모의 private멤버는 접근 불가 ***
		
		//class 자식클래스명 extends 부모 클래스명{
		//			코드 정의;
		//}
		
		NewTest in = new NewTest(); //자식 객체
		in.disp();
		in.info();
		
		Test t = new Test();
		t.info();
		//t.disp();

	}

}

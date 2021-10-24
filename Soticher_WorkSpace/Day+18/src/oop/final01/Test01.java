package oop.final01;

public final class Test01 {

	int b;
	
	//final을 붙여 선언한 변수는 생성자 안에서 초기화를 진행해주어야한다
	final int a = 0;
	public Test01(int a) {
		//this.a = a; //초기화가 되지 않아서 error
	}
	
//	public  final void setData(int b) {
//		this.b = b;
//	} // 자식이 부모의 메소드를 덮어씌우기가 불가능
	
	public static void main(String[] args) {
		
		//제한자 - 어떠한 제약, 또는 제한을 발생시키는 키워드
		
//		final : 최종적인, 최후의
//			- 이것이 마지막이다
//			- 재설정 금지
			
//		변수 - 한 번 값을 설정하면 그 값이 최종적인 값이 된다. 데이터 변경이 불가
//		setter 자체가 사용이 불가
	
//		메소드 - 오버라이드 금지.. 메소드 재정의 금지
//				같은 이름인 메소드는 재정이 불가하다
			
//		클래스 - 상속금지 불가능
		
		final int a;
		//System.out.println("a = "+a);
		
		a = 20;
		//a = 30; 값을 한 번 설정했기 때문에 error
		System.out.println("a = "+a);
		
		//final : 더이상 _____를 금지한다는 뜻
		//변수	: 재설정금지
		//메소드	: 
		

	}

}

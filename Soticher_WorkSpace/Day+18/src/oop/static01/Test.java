package oop.static01;

//static
//	- 객체의 생성과 상관 없이 사용되는 멤버
//	- 클래스를 통하여 접근한다
//	- static 멤버는 접근 지정자 영항을 받는다

//변수
//	- 모든 객체가 서로 공유하여 일괄적으로 처리되어야 할 데이터를 저장하는 변수 공간
//	- 정적 메모리 영역에 공간잉 따로 형성되고 모든 객체가 그 공간을 참조하게 된다
//	- 프로그램이 실행 할 때 공간이 생성되고 프로그램이 끝날 때 공간이 소멸된다
//	- 모든 객체를 통틀어서 단 하나의 공간만 만들어진다
//	- 아무리 클래스 내부더라도 static멤버는 클래스를 통하여 접근하여야한다

public class Test {

	private int no; // 객체 번호(변수만 공간을 같이 쓴다)
	private static int su;
	
	public Test(int no, int su) {
		this.no = no;
		//this.su = su;
		Test.su = su;
	}
	public Test() {
		
	}
	
	public void disp() {
		System.out.println("no = "+no+"\tsu = "+su);
	}
	
	//static 메소드
	//	- 객체의 생성과 상관이 없지만 클래스의 기능과 연관이 있는 메소드들을 사용할 때 static
	//		메소드를 만들어준다
	//	- static 메소드는 static 멤버만 사용이 가능하다
	//	- this가 존재하지 않는다

	public static void setSu(int su) {
		Test.su = su;
		//no = 20; static멤버가 아니기 때문에 error
		getSu();
		System.currentTimeMillis(); //static
		System.out.println(); //static
	}
	
	public static int getSu() {
		return su;
	}
}

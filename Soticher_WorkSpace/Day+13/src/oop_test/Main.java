package oop_test;

public class Main {

	//메소드의 오버로드
	// - 객체지향 언어의 메소드의 참조 방식은 메소드명과 *매개변수까지 인식*한다
	// - 메소드명의 중복정의
	// - 같은 기능이라면 하나의 이름으로 통합적인 처리를 위해 사용한다
	
	// - 오버로드의 조건
	//		- 반환 자료형은 오버로드의 조건에 해당되지 않는다(getter는 해당 X)
	// 	- 매개변수의 개수 순서 자료형 셋 중에 하나라도 다르면 오벌도의 조건에 해당된다
	
	public void disp(int a) {
		System.out.println("a ="+a);
	}
	
	public void disp(int a,double b) {
		System.out.println("a ="+a);
	}
	
	public void disp(double a,int b) {
		System.out.println("a ="+a);
	}
	
	public void disp(double a) {
		System.out.println("a ="+a);
	}
	
	public void disp(char a) {
		System.out.println("a ="+a);
	}
	
	public void disp(String a) {
		System.out.println("a ="+a);
	}
	
	public static void main(String[] args) {
		
		Info in = new Info("홍길동",13);//이름 나이 생성자
		in.disp();
		
		Info in1 = new Info("홍길동");//이름만 넣어서 이름생성자
		in1.disp();
		
		Info in2 = new Info();//값을 넣지않아서 디폴트생성자
		in2.setData("홍길동", 15);
		in2.disp();

		Main ma = new Main();
		ma.disp("a");
		
		ma.disp('a');
		ma.disp(20);
		ma.disp(0.36, 45);
		
	}

}

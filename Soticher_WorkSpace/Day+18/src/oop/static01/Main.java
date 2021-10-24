package oop.static01;

public class Main {

	public static void main(String[] args) {
		
		//Test.su = 10; private로 인해 직접적인 접근 불가
		
		Test.setSu(20);
		Test t1 = new Test(1, 1);
		Test t2 = new Test(2, 2);
		Test t3 = new Test(3, 3);
		
		t1.disp();t2.disp();t3.disp();
		//Static : 주로 클래스들이 할당
		//모든 객체가 메모리를 공유
		
		//Heap : 주로 객체들이 할당
		//메모리를 공유하지 않습니다

		Test num1 = new Test();
		Test num2 = new Test();
		
		Test.setSu(20);
		num1.disp();
		num2.disp();
		
	}

}

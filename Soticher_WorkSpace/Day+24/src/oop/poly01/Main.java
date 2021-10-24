package oop.poly01;

public class Main {

	public static void main(String[] args) {
		
		//다형성
		// - 다양한 형태나 성질..
		// - 하나의 부모로부터 상속받은 클래스들은 모두 형태나 성질이 다르기 때문에
		// - 하나의 객체를 여러개의 클래스로 표현하는것
		// - 클래스를 기능별로 구분하여 기능에 대한 통합적인 처리를 위해서 사용한다
		// - 다중 상속을 통하여 여러개의 클래스들을 상속받아 기능별로 통합적으로 처리한다
		
		Dog d = new Dog("사모예드");
		
		d.disp();
		d.bark();
		d.eat();

		//타입불일치형 = 업캐스팅 = 다형성
		// - 업캐스팅 : 부모의 참조형 변수에 자식 인스턴스 공간의 정보를 담는것
		Animal a = new Dog("사모예드");
		a.disp();//부모의 고유한 메소드 0
		a.bark();//자식에서 오버라이드된 메소드 0
		//a.eat();
		
		// - 다운캐스팅 x
		
	}

}

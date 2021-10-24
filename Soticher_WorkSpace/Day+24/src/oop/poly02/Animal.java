package oop.poly02;

//추상 클래스
// - abstract를 붙어서 정의한 클래스
// - 추상 메소드를 가지고 있는클래스..X
// - 부모의 역할을 수행하기 위해 만들어지는 클래스
// - 일반적으로 객체 생성불가.. 익명중첩클래스를 통해 임시적으로 객체 생성 가능
// - 자식 클래스에서 추상메소드를 오버라이드 해주어야한다
//	  추상 메소드를 오버라이드 하지 않으면 자식 클래스도 추상 클래스로 만들어야한다

public abstract class Animal {

private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void disp() {
		System.out.println("이름 : "+name);
	}
	//추상메소드 - 빈껍데기 메소드
	// - 다형성을 위해서 부모클래스에서 정의하는 메소드
	// - 부모 클래스에서는 정의할 내용이 마땅치 않지만 다형성을 위해서 정의한다
	// - abstract를 붙어 정의
	
	public abstract void bark(); // 무조건 자식 클래스에서 오버라이드 해야됨
	
//	public void bark() {
//		System.out.println("??????????????");
//	}
	
}

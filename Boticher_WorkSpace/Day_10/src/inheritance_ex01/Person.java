package inheritance_ex01;

// 부모 클래스 (super class)
public class Person {
	protected String name; // 자식클래스는 접근 가능함 (같은 패키지 안에 있는 클래스들도)
	
	// 생성자
	public Person() {
		System.out.println("응애애앵!!!");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void introduce() {
		// 내이름은 OO 입니다
		System.out.println("내 이름 " + this.name + ", 탐정이죠");
	}
}

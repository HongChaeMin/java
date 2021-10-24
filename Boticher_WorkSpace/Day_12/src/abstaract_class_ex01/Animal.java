package abstaract_class_ex01;

// 부모 클래스
public abstract class Animal {
	
	// 추상 메소드 : 자식 클래스가 반드시 구현해야 하는 메소드다
	public abstract void cry();
	
	// 일반 메소드
	public void eat() {
		System.out.println("냠냠");
	}
}

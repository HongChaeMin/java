package poly01;

//extends - 클래스 상속 키워드 : 클래스와 추상클래스를 통틀어 단 하나만 상속할 수 있다

//CPP에서 다중 상속의 문제점들이 존재
// - 메소드의 겹침
// - 부모의 겹침

//JAVa에서는 다중 상속의 문제점을 보완하였다
// - 인터페이스를 통하여 여러개를 상속받을 수 있다
// - implements - 인터페이스 전용 상속 키워드 : 인터페이스는 여러개 상속가능

public class Cat extends Animal implements Eat, Bark{
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println("생선");
	}
	
	@Override
	public void bark() {
		System.out.println("미야옹");
	}

}

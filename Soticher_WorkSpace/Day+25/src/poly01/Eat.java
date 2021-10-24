package poly01;

//부모

//interface
// - 다중상속 전용 클래스
// - 클래스의 변형
// - interface를 뭍여서 선언한다

// - 확실하면 적고 확실하지 않으면 적지 않을것
// - 내부에 정의 할 수 있는 멤버들이 제한이 있다
// - 객체 생성불가 익명중첩 클래스를 통하여 객체 생성가능
// abstract랑 비슷하다
public interface Eat {

	//멤버변수
	// - 상수화 변수만 들어갈 수 있다 (아니면 지가 알아서 만듦)
	/*public static final*/ String SKILL1 = "q";
	
	//생성자는 존재 안 함
	
	//메소드 
	// - 추상메소드 아니면 static메소드만 정의할 수 있다
	// - 메소드의 형태만 적으면 추상 메소드 들어가진다 (얘도 지가 알아서 만듦)
	/*public abstract*/ void eat();
	
	static void food() {
		System.out.println("as");
	}
	
}

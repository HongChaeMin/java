package inheritance_ex01;

// 자식 클래스 (child class)
public class Student extends Person {

	private String major;

	// 생성자
	public Student() {
		System.out.println("학생입니다");
	}

	// 오버로딩 (파라미터 또는 파일의 개수가 다른 것)
	public Student(String name, String major) {
		super(name); // 무조건 부모가 제일 먼저 생성되어야 함
		// super.name = name;
		this.major = major;
	}
	
	// 오버라이드 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("내 전공은 " + this.major + "입니다");
	}

}

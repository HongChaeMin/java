package class_quiz01;

public class Person {

	// 속성 : field 필드
	private String name;
	private String brith;
	private String sex;
	private int age;
	
	// 기능 : method
	public Person(String name, String brith, String sex) {
		setName(name);
		setBrith(brith);
		setSex(sex);
		setAge(this.brith);
	}
	
	// 생성자(Constructor) : 객체가 생성될 때 불려지는 특수한 메소드
	// - return 타입이 없다
	// - 클래스명과 동일하다
	public Person() {
		System.out.println("응애 !!");
	}
	
	// 생성자 오버로딩 (Overloading) : 파라미터의 타입이 다르거나, 개수가 다르거나 불려지는  
	public Person(int name, String birth, String gender) {
		this.name = name + "";
		this.brith = birth;
		this.sex = gender;
	}
	
	// getter, setter : 캡슐화
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrith() {
		return brith;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(String age) {
		age = age.substring(0, 4);
		this.age = 2021 - Integer.valueOf(age) + 1;
	}

	public void 인사하기() {
		System.out.println("안녕하세요");
	}
	
	public void 걷기() {
		System.out.println("뚜벅 뚜벅 걷는 중...");
	}
	
	public void 소개하기() {
		System.out.println("안녕하세요 제 이름은 " + this.name + "이고, " + this.sex + "입니다");
	}
	
	public void 나이알려주기() {
		System.out.println("제 나이는 " + this.age + "세 입니다");
	}
	
}

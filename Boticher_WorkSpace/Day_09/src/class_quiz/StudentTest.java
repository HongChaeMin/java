package class_quiz;

public class StudentTest {

	// 속성 : 필드
	// 이름, 수업명, 나이, 전화번호
	private String name;
	private int age;
	private String className;
	private int phoneNumber;

	public StudentTest(String name, int age, String className, int phoneNumber) {
		setName(name);
		setAge(age);
		setClassName(className);
		setPhoneNumber(phoneNumber);
	}

	// 행위 : 메소드
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("나이를 잘못입력하셨습니다");
			this.age = 1;
			return;
		}
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void isAdult() {
		if (this.age < 20) {
			System.out.println("미성년자 입니다");
		} else {
			System.out.println("성인입니다");
		}
	}

	public void disp() {
		System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getClassName());
        System.out.println(getPhoneNumber());
        isAdult();
	}
}

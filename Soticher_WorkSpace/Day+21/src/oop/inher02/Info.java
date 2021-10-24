package oop.inher02;

public class Info {

	private String name;
	private int age;
	
	public Info() {
		System.out.println("부모의 디폴트 생성자 호출");
		this.age = 1;
	}
	
	public Info(String name) {
		System.out.println("부모 이름 생성자");
		this.name = name;
		this.age = 1;
	}
	
	public Info(String name, int age) {
		System.out.println("부모 이름, 나이 생성자");
		setName(name);
		setAge(age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 1) {
			System.out.println("나이를 잘못 입력하셨습니다");
			this.age = 1;
		}
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void disp() {
		System.out.println("이름 : "+name+" 나이 : "+age);
	}
	
}

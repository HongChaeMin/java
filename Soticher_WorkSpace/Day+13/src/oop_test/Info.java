package oop_test;

public class Info {
		
	//멤버 변수
	private String name;
	private int age;
	
	//생성자
	//생성자의 접근지정자도 public을 사용
	public Info() {
		System.out.println("디폴트 생성자 호출");
		this.age = 1;
	}
	
	public Info(String name) {
		System.out.println("이름 생성자");
		this.name = name;
		this.age = 1;
	}
	
	//이름과 나이 받는 생성자
	public Info(String name,int age) {
		System.out.println("이름 나이 생성자");
		this.name = name;
		this.setAge(age);
	}
	
	//setter getter
	//age setter에 나이를 1미만은 나이를 잘못입력했습니다를 출력하고 나이에 1의 값을 넣어주세요
	//return;을 사용하셔서 메소드 종료
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age<1) {
			System.out.println("나이를 잘못입력하셨습니다");
			this.age = 1;
			return;
		}
		this.age = age;
	}
	//getter
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	//멤버메소드
	public void setData(String name,int age) {
		this.name = name;
		this.setAge(age);
	}
	
	public void disp() {
		System.out.println("이름 :"+this.getName());
		System.out.println("나이 :"+this.getAge());
	}
	
}

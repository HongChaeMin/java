package oop_test01;

public class Info {
	
	//멤버변수
	private String name; //private는 클래스 안엥서만 멤버변수를 접근할 수 있다
	private int age;
	
	//this
	//	- 자기 자신을 호출한 객체의 정보를 가지는 참조형 변수
	//	- 메소드가 호출될 때 자동으로 만들어진다.
	//	- 메소드 외비ㅜ에서는 사용불가
	//	- 클래스의 멤버를 호출할 때는 this
	//형식
	//	클래스명 this;
	
	public void setData(String _name, int _age) {
		name = _name;
		age = _age;
		if(age<1) {
			System.out.println("나이를 잘못 입력하셨습니다");
			age = 1;
			return;
		}
		
	}
	
	//setter
	public void setName(String _name){
		name = _name;
	}
	
	public void setAge(int _age) {
		age = _age;
		if(age<1) {
			System.out.println("나이를 잘못 입력했습니다");
			age = 1;
			return;
		}
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void disp() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
}

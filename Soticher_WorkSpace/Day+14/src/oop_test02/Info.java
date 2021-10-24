package oop_test02;

public class Info {

	private String name;
	private int age;
	
	public Info(String _name, int _age) {
		name = _name;
		age = _age;
	}
	
	public Info() {
		
	}
	
	public void setData(String _name, int _age) {
		name = _name;
		age = _age;
	}
		
	public void setName(String _name) {
		name = _name;
	}
	
	public void setAge(int _age) {
		if(_age<1) {
			System.out.println("나이를 잘못입력하셨습니다");
			age = 1;
			return;
		}
		age = _age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void disp() {
		System.out.println("이름 : "+getName()+", 나이 : "+getAge());
	}
	
}

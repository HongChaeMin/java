package api.util.collection.list.test;

public class Student {

	private String name;
	private int age;
	
	public Student(String name, int age) {
		setAge(age);
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("나이를 잘못 입력하셨습니다");
			this.age = 1;
			return ;
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
		System.out.println("=====학생 정보=====");
		System.out.print("이름 : "+getName()+" / 나이 : "+getAge()+" ");
	}
	
}

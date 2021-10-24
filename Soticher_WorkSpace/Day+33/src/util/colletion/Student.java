package util.colletion;

public class Student extends Score{
	
	private String name;
	private int age;
	
	public Student(String name, int age, double ko, double ma, double eg ) {
		super(ko, ma, eg);
		setName(name);
		setAge(age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age<1) {
			System.out.println("���̸� �߸� �Է��ϼ̽��ϴ�");
			age = 1;
			return;
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
		System.out.print("�̸� : "+name+" ���� : "+age);
		super.disp();
	}
	
}

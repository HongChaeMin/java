package oop.inher02;

public class Info {

	private String name;
	private int age;
	
	public Info() {
		System.out.println("�θ��� ����Ʈ ������ ȣ��");
		this.age = 1;
	}
	
	public Info(String name) {
		System.out.println("�θ� �̸� ������");
		this.name = name;
		this.age = 1;
	}
	
	public Info(String name, int age) {
		System.out.println("�θ� �̸�, ���� ������");
		setName(name);
		setAge(age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 1) {
			System.out.println("���̸� �߸� �Է��ϼ̽��ϴ�");
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
		System.out.println("�̸� : "+name+" ���� : "+age);
	}
	
}

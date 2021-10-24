package oop_test;

public class Info {
		
	//��� ����
	private String name;
	private int age;
	
	//������
	//�������� ���������ڵ� public�� ���
	public Info() {
		System.out.println("����Ʈ ������ ȣ��");
		this.age = 1;
	}
	
	public Info(String name) {
		System.out.println("�̸� ������");
		this.name = name;
		this.age = 1;
	}
	
	//�̸��� ���� �޴� ������
	public Info(String name,int age) {
		System.out.println("�̸� ���� ������");
		this.name = name;
		this.setAge(age);
	}
	
	//setter getter
	//age setter�� ���̸� 1�̸��� ���̸� �߸��Է��߽��ϴٸ� ����ϰ� ���̿� 1�� ���� �־��ּ���
	//return;�� ����ϼż� �޼ҵ� ����
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age<1) {
			System.out.println("���̸� �߸��Է��ϼ̽��ϴ�");
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
	
	//����޼ҵ�
	public void setData(String name,int age) {
		this.name = name;
		this.setAge(age);
	}
	
	public void disp() {
		System.out.println("�̸� :"+this.getName());
		System.out.println("���� :"+this.getAge());
	}
	
}

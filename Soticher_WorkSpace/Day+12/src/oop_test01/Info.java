package oop_test01;

public class Info {
	
	//�������
	private String name; //private�� Ŭ���� �ȿ����� ��������� ������ �� �ִ�
	private int age;
	
	//this
	//	- �ڱ� �ڽ��� ȣ���� ��ü�� ������ ������ ������ ����
	//	- �޼ҵ尡 ȣ��� �� �ڵ����� ���������.
	//	- �޼ҵ� �ܺ�̿����� ���Ұ�
	//	- Ŭ������ ����� ȣ���� ���� this
	//����
	//	Ŭ������ this;
	
	public void setData(String _name, int _age) {
		name = _name;
		age = _age;
		if(age<1) {
			System.out.println("���̸� �߸� �Է��ϼ̽��ϴ�");
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
			System.out.println("���̸� �߸� �Է��߽��ϴ�");
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
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
	
}

package inheritance_ex01;

// �θ� Ŭ���� (super class)
public class Person {
	protected String name; // �ڽ�Ŭ������ ���� ������ (���� ��Ű�� �ȿ� �ִ� Ŭ�����鵵)
	
	// ������
	public Person() {
		System.out.println("���־־�!!!");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void introduce() {
		// ���̸��� OO �Դϴ�
		System.out.println("�� �̸� " + this.name + ", Ž������");
	}
}

package inheritance_ex01;

// �ڽ� Ŭ���� (child class)
public class Student extends Person {

	private String major;

	// ������
	public Student() {
		System.out.println("�л��Դϴ�");
	}

	// �����ε� (�Ķ���� �Ǵ� ������ ������ �ٸ� ��)
	public Student(String name, String major) {
		super(name); // ������ �θ� ���� ���� �����Ǿ�� ��
		// super.name = name;
		this.major = major;
	}
	
	// �������̵� : �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ� Ŭ�������� ������ �ϴ� ��
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("�� ������ " + this.major + "�Դϴ�");
	}

}

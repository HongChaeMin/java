package class_quiz;

public class StudentTest {

	// �Ӽ� : �ʵ�
	// �̸�, ������, ����, ��ȭ��ȣ
	private String name;
	private int age;
	private String className;
	private int phoneNumber;

	public StudentTest(String name, int age, String className, int phoneNumber) {
		setName(name);
		setAge(age);
		setClassName(className);
		setPhoneNumber(phoneNumber);
	}

	// ���� : �޼ҵ�
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("���̸� �߸��Է��ϼ̽��ϴ�");
			this.age = 1;
			return;
		}
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void isAdult() {
		if (this.age < 20) {
			System.out.println("�̼����� �Դϴ�");
		} else {
			System.out.println("�����Դϴ�");
		}
	}

	public void disp() {
		System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getClassName());
        System.out.println(getPhoneNumber());
        isAdult();
	}
}

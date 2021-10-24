package class_quiz01;

public class Person {

	// �Ӽ� : field �ʵ�
	private String name;
	private String brith;
	private String sex;
	private int age;
	
	// ��� : method
	public Person(String name, String brith, String sex) {
		setName(name);
		setBrith(brith);
		setSex(sex);
		setAge(this.brith);
	}
	
	// ������(Constructor) : ��ü�� ������ �� �ҷ����� Ư���� �޼ҵ�
	// - return Ÿ���� ����
	// - Ŭ������� �����ϴ�
	public Person() {
		System.out.println("���� !!");
	}
	
	// ������ �����ε� (Overloading) : �Ķ������ Ÿ���� �ٸ��ų�, ������ �ٸ��ų� �ҷ�����  
	public Person(int name, String birth, String gender) {
		this.name = name + "";
		this.brith = birth;
		this.sex = gender;
	}
	
	// getter, setter : ĸ��ȭ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrith() {
		return brith;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(String age) {
		age = age.substring(0, 4);
		this.age = 2021 - Integer.valueOf(age) + 1;
	}

	public void �λ��ϱ�() {
		System.out.println("�ȳ��ϼ���");
	}
	
	public void �ȱ�() {
		System.out.println("�ѹ� �ѹ� �ȴ� ��...");
	}
	
	public void �Ұ��ϱ�() {
		System.out.println("�ȳ��ϼ��� �� �̸��� " + this.name + "�̰�, " + this.sex + "�Դϴ�");
	}
	
	public void ���̾˷��ֱ�() {
		System.out.println("�� ���̴� " + this.age + "�� �Դϴ�");
	}
	
}

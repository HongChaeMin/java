package opp_test03;

public class Info {

	private String name;
	private int age;
	private int math;
	private int kor;
	private int eng;
	private int h;
	private double p;
	
	public Info(String _name, int _age, int _math, int _kor, int _eng) {
		name = _name;
		age = _age;
		math = _math;
		kor = _kor;
		eng = _eng;
	}
	public Info() {
		
	}
	
	//setter
	public void setName(String _name) {
		name = _name;
	}
	public void setAge(int _age) {
		if(_age<1) {
			System.out.println("���̸� �߸� �Է��ϼ̽��ϴ�");
			age = 1;
			return;
		}
		age = _age;
	}
	public void setMath(int _math) {
		math = _math;
	}public void setKor(int _kor) {
		kor = _kor;
	}
	public void setEng(int _eng) {
		eng = _eng;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getMath() {
		return math;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	
	//�հ豸�ϱ�
	public int sum() {
		h = math + kor + eng;
		return h;
	}
	//��ձ��ϱ�
	public double average() {
		p = h/3.0;
		return p;
	}
	
	public void disp() {
		System.out.println("�̸� : "+getName()+", ���� : "+getAge()+", �հ� : "+sum()+", ��� : "+average());
		if(average()>=70) {
			System.out.println("�հ��̿���~~~^^");
		}
	}
	
}

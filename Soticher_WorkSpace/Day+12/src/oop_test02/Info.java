package oop_test02;

public class Info {

	private String name;
	private int age;
	private int k;
	private int e;
	private int m;
	private int sum = 0;
	private double p = 0.0;
	
	public void setData(String _name, int _age, int _k, int _e, int _m) {
		name = _name;
		age = _age;
		k = _k;
		e = _e;
		m = _m;
		
		sum = k+e+m;
		
		p = sum/3;
	}
	
	//set �޼ҵ� �����ߵ� �����Ƽ� ����
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getK() {
		return k;
	}
	
	public int getE() {
		return e;
	}
	
	public int getM() {
		return m;
	}
	
	public int getSum() {
		return sum;
	}
	
	public double getP() {
		return p;
	}
	
	public void disp() {
		System.out.println(name+", "+age+", "+k+", "+e+", "+m+", "+sum+", "+p);
		if(p>=70.0) {
			System.out.println("�հ��Դϴ�");
		}else {
			System.out.println("���հ��̿��� ���� �ٽ� ������ ��û�̾�");
		}
	}
	
}

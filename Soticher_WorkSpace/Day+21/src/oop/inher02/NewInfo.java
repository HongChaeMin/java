package oop.inher02;

public class NewInfo extends Info{

	private double hei;
	
	//this - �ڱ� �ڽ�
	//super - �θ�
	
	public NewInfo() {
		System.out.println("�ڽ� ����Ʈ ������");
	}
	
	public NewInfo(String name, int age, double hei) {
		super(name, age);
		this.hei = hei;
		System.out.println("�ڽ� ������");
		
	}
	
	public void setHei(double hei) {
		this.hei = hei;
	}
	public double getHei() {
		return hei;
	}
	
	public void disp() {
		super.disp();
		System.out.println("Ű : "+this.hei);
	}
	
}

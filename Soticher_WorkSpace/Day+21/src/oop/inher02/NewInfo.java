package oop.inher02;

public class NewInfo extends Info{

	private double hei;
	
	//this - 자기 자신
	//super - 부모
	
	public NewInfo() {
		System.out.println("자식 디폴트 생성자");
	}
	
	public NewInfo(String name, int age, double hei) {
		super(name, age);
		this.hei = hei;
		System.out.println("자식 생성자");
		
	}
	
	public void setHei(double hei) {
		this.hei = hei;
	}
	public double getHei() {
		return hei;
	}
	
	public void disp() {
		super.disp();
		System.out.println("키 : "+this.hei);
	}
	
}

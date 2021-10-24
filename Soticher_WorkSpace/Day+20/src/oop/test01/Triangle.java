package oop.test01;

public class Triangle extends Diagram{

	private double n;
	
	public Triangle(int a, int b) {
		super(a, b);
		setN(a, b);
	}
	
	public void setN(int a, int b) {
		this.n = a*b/2.0;
	}
	
	public double getN() {
		return n;
	}
	
	public void disp() {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : "+getN());
	}
	
}

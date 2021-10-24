package oop.test01;

public class Circle extends Diagram{

	private double n;
	
	public Circle(int a, int b) {
		super(a, b);
		setN(a/2.0);
	}
	
	
	public void setN(double n) {
		n = Math.pow(n, 2.0)*Math.PI;
	}
	public double getN() {
		return n;
	}
	
	public void disp() {
		System.out.println("¿øÀÇ ³ĞÀÌ : "+getN());
	}
	
}

package oop.test01;

public class Square extends Diagram{

	private double n;
	
	public Square(int a, int b) {
		super(a, b);
		setN(a, b);
	}
	
	public void setN(int a, int b) {
		this.n = a*b;
	}
	public double getN() {
		return n;
	}
	
	public void disp() {
		System.out.println("사격형의 넓이 : "+getN());
	}
	
}

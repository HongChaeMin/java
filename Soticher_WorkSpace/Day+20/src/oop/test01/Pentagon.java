package oop.test01;

public class Pentagon extends Diagram{

	private double n;
	
	public Pentagon(int a, int b) {
		super(a, b);
		setN(a*1.0);
	}
	
	public void setN(double n) {
		this.n = (Math.pow(n, 2.0)/4.0)*Math.sqrt((25+(10*Math.sqrt(5))));
	}
	
	public double getN() {
		return n;
	}
	
	public void disp() {
		System.out.println("오각형의 넓이 : "+getN());
	}
		
}

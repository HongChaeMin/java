package oop.inher02;

public class Student {
	
	private String name;
	private int java;
	private int c;
	protected int tot;
	protected double p;
	
	public Student (String name, int java, int c){
		setName(name);
		setJava(java);
		setC(c);
		setTot(java+c);
		setP(tot/2.0);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setJava(int java) {
		if(java<0) {
			System.out.println("점수를 잘못 입력하셨습니다");
			this.java = 0;
			return;
		}
		this.java = java;
	}
	public void setC(int c) {
		if(c<0) {
			System.out.println("점수를 잘못 입력하셨습니다");
			this.c = 0;
			return;
		}
		this.c = c;
	}
	protected void setTot(int tot) {
		this.tot = tot;
	}
	protected void setP(double tot) {
		this.p = tot;
	}
	public String getName() {
		return name;
	}
	public int getJava() {
		return java;
	}
	public int getC() {
		return c;
	}
	protected int getTot() {
		return tot;
	}
	protected double getP() {
		return p;
	}
	
	public void disp() {
		System.out.print(name+"\t"+java+"\t"+c+"\t");
	}
	
}

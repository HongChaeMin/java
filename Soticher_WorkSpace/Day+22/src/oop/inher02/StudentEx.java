package oop.inher02;

public class StudentEx extends Student {

	private int python;
	
	public StudentEx(String name, int java, int c, int python) {
		super(name, java, c);
		setPython(python);
		setTot(java+c+python);
		setP(tot/3.0);
	}

	public void setPython(int python) {
		this.python = python;
	}
	public int getPython() {
		return python;
	}
	
	public void disp() {
		super.disp();
		System.out.print(python+"\t"+getTot()+"\t"+getP());
	}
	
}

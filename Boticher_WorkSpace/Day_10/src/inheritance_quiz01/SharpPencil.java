package inheritance_quiz01;

public class SharpPencil extends Amount {

	// ����, ��

	private int thickness;

	public SharpPencil(int amount, int thickness) {
		super(amount);
		this.thickness = thickness;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	public void disp() {
		super.disp();
		System.out.println("���� : " + this.thickness);
	}
	
}

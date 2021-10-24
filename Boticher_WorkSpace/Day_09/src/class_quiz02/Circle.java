package class_quiz02;

public class Circle {

	// �ʵ�
	private int horizontal;
	private double area;
	private double round;
	private int count;

	// ������
	public Circle(int horizontal, int count) {
		this.horizontal = horizontal;
		this.count = count;
		setArea(this.horizontal);
		setRound(this.horizontal);
	}

	public int getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(int horizontal) {
		this.horizontal = horizontal / 2;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int horizontal) {
		this.area = Math.pow(Math.PI * (horizontal / 2), 2.0);
	}

	public double getRound() {
		return round;
	}

	public void setRound(int horizontal) {
		this.round = 2.0 * Math.PI * horizontal;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	// ���� n�� ���� 
	// �޼ҵ� �����ε�(Overloading) : �޼ҵ� �̸��� ������ �Ķ������ ������ �ٸ��ų�
	// 							 �Ķ���� Ÿ���� �ٸ� ��� �ٸ� �޼ҵ�� �����ϰ� ��ġ�ϴ� �޼ҵ�� �ڵ� ȣ��ȴ�
	
	// �޼ҵ�
	public void disp() {
		System.out.println("���� ���� : " + this.area);
		System.out.println("���� �ѷ� : " + this.round);
		System.out.println("�� " + this.count + "���� ���� : " + (this.count * this.area));
	}

}

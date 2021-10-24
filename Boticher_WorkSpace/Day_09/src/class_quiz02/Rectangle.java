package class_quiz02;

public class Rectangle {

	private int vertical;
	private int horizontal;
	private double area;
	private double round;

	public Rectangle(int vertical, int horizontall) {
		setVertical(vertical);
		setHorizontal(horizontall);
		setArea(this.vertical, this.horizontal);
		setRound(this.vertical, this.horizontal);
	}

	public int getVertical() {
		return vertical;
	}

	public void setVertical(int vertical) {
		this.vertical = vertical;
	}

	public int getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(int horizontal) {
		this.horizontal = horizontal;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int vertical, int hoizeontall) {
		this.area = vertical * hoizeontall;
	}

	public double getRound() {
		return round;
	}

	public void setRound(int vertical, int hoizeontall) {
		this.round = (vertical + hoizeontall) * 2;
	}

	public void disp() {
		System.out.println("가로 " + this.vertical + "cm, 세로 " + this.horizontal + "cm 사각형이 만들어졌습니다.");
		System.out.println("넓이 : " + this.getArea() + "cm^1");
		System.out.println("둘레 : " + this.round + "cm");
	}

}

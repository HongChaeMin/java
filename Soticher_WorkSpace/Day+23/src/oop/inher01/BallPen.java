package oop.inher01;

public class BallPen extends Pens{
	
	private String color;
	
	public BallPen(int amount, String color) {
		super(amount);
		setColor(color);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public void disp() {
		System.out.println("BallPen");
		System.out.println("남은 수량 : "+getAmount()+"\t볼펜의 색 : "+getColor());
	}
	
}

package oop.inher01;

public class FountainPen extends BallPen{

	public FountainPen(String color, int amount) {
		super(amount, color);
	}
	
	public void disp() {
		System.out.println("FountainPen");
		System.out.println("남은 수량 : "+getAmount()+"\t볼펜의 색 : "+getColor());
	}
	
}

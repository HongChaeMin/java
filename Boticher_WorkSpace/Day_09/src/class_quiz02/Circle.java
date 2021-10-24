package class_quiz02;

public class Circle {

	// 필드
	private int horizontal;
	private double area;
	private double round;
	private int count;

	// 생성자
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
	
	// 원의 n개 넓이 
	// 메소드 오버로딩(Overloading) : 메소드 이름은 같은데 파라미터의 개수가 다르거나
	// 							 파라미터 타입이 다른 경우 다른 메소드로 인지하고 일치하는 메소드로 자동 호출된다
	
	// 메소드
	public void disp() {
		System.out.println("원의 넓이 : " + this.area);
		System.out.println("원의 둘레 : " + this.round);
		System.out.println("원 " + this.count + "개의 넓이 : " + (this.count * this.area));
	}

}

package polymorphism_quiz02;

public class Rectangle extends Shape {
	
	public Rectangle(int horizontal, int vertical) {
		super.horizontal = horizontal;
		super.vertical = vertical;		
	}
	
	public void printArea() {
		double area = super.horizontal * super.vertical;
		System.out.println("도형은 사각형이며 넓이는 " + area + "cm^2 입니다");
	}

}

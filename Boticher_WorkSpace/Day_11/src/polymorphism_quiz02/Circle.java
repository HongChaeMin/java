package polymorphism_quiz02;

public class Circle extends Shape {

	public Circle(int radius) {
		super.horizontal = radius;
	}

	@Override
	public void printArea() {
		double area = Math.pow(Math.PI * super.horizontal, 2.0);
		System.out.println("도형은 원이며 넓이는 " + area + "cm^2 입니다");
	}

}

package polymorphism_quiz02;

public class Rectangle extends Shape {
	
	public Rectangle(int horizontal, int vertical) {
		super.horizontal = horizontal;
		super.vertical = vertical;		
	}
	
	public void printArea() {
		double area = super.horizontal * super.vertical;
		System.out.println("������ �簢���̸� ���̴� " + area + "cm^2 �Դϴ�");
	}

}

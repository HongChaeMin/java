package polymorphism_quiz02;

public class Triangle extends Shape {

	public Triangle(int base, int height) {
		super.horizontal = base;
		super.vertical = height;
	}

	@Override
	public void printArea() {
		double area = (super.horizontal * super.vertical) / 2.0;
		System.out.println("������ �ﰢ���̸� ���̴� " + area + "cm^2 �Դϴ�");
	}

}

package class_quiz02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����, ���� : ");
		Rectangle rect1 = new Rectangle(sc.nextInt(), sc.nextInt());
		rect1.disp();

		System.out.println("����, ���� : ");
		Rectangle rect2 = new Rectangle(sc.nextInt(), sc.nextInt());
		rect2.disp();
		
		System.out.println("���� ����, ����  : ");
		Circle cir1 = new Circle(sc.nextInt(), sc.nextInt());
		cir1.disp();
		
	}

}

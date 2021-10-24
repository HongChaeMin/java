package class_quiz02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로, 세로 : ");
		Rectangle rect1 = new Rectangle(sc.nextInt(), sc.nextInt());
		rect1.disp();

		System.out.println("가로, 세로 : ");
		Rectangle rect2 = new Rectangle(sc.nextInt(), sc.nextInt());
		rect2.disp();
		
		System.out.println("원의 지름, 개수  : ");
		Circle cir1 = new Circle(sc.nextInt(), sc.nextInt());
		cir1.disp();
		
	}

}

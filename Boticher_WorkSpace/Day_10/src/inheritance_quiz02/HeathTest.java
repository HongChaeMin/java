package inheritance_quiz02;

import java.util.Scanner;

public class HeathTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�, Ű, �����Ը� �Է����ּ���");
		HealthRate heath = new HealthRate(sc.next(), sc.nextInt(), sc.nextInt());

		heath.disp();
		
	}

}

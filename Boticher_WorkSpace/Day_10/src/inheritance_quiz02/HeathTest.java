package inheritance_quiz02;

import java.util.Scanner;

public class HeathTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 키, 몸무게를 입력해주세요");
		HealthRate heath = new HealthRate(sc.next(), sc.nextInt(), sc.nextInt());

		heath.disp();
		
	}

}

package condition_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-----------문제 1-----------");

		System.out.println("두 점수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > 70 && b > 70) {
			System.out.println("합격입니다");
		} else {
			System.out.println("다시 공부해라 !!!!!");
		}

		System.out.println("-----------문제 2-----------");

		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의 공배수입니다");
		}else {
			System.out.println("응 아니야");
		}
		
		System.out.println("-----------문제 3-----------");

		System.out.print("1 ~ 10 사이의 수를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			System.out.println("잘했어용");
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}

}

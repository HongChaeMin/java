package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-----------문제 1-----------");

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("음수입니다");
		} else {
			System.out.println("양수입니다");
		}

		System.out.println("-----------문제 2-----------");

		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60 ) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		System.out.println("-----------문제 3-----------");

		System.out.print("BMI 수치를 입력해주세요 : ");
		int bmi = sc.nextInt();

		if (0 <= bmi && bmi < 10) {
			System.out.println("정상입니다");
		} else if (bmi >= 10 && bmi < 20) {
			System.out.println("과체중입니다 살 좀 빼세요");
		} else if (bmi >= 20) {
			System.out.println("비만인데 심각하다고 생각 안 해?");
		} else {
			System.out.println("잘못입력하셨습니다");
		}

	}

}

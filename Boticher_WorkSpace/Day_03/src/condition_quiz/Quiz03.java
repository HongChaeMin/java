package condition_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-----------문제 1-----------");

		System.out.println("두 점수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if ((a + b) / 2 >= 70) {
			System.out.println("합격입니당");
		} else {
			System.out.println("공부 더럽게 못하네요 ㅎㅎ");
		}

		System.out.println("-----------문제 2-----------");

		int max = 0;
		int arr[] = new int[3];

		System.out.println("세 개의 수를 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		System.out.println("-----------문제 3-----------");

		System.out.print("국어 : ");
		int ko = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		double avg = (ko + math) / 2.0;

		if (ko < 50 || math < 50) {
			System.out.println("과락");
		} else if (avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		System.out.println("-----------문제 4-----------");

		System.out.print("연도 : ");
		int year = sc.nextInt();

		if (year % 400 == 0) {
			System.out.println("윤년");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}

		System.out.println("-----------문제 5-----------");

		System.out.print("윷 상태를 입력하세요 : ");

		a = sc.nextInt();
		b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		max = a + b + c + d;

		if (max == 1) {
			System.out.println("도");
		} else if (max == 2) {
			System.out.println("개");
		} else if (max == 3) {
			System.out.println("걸");
		} else if (max == 4) {
			System.out.println("윷");
		} else {
			System.out.println("모");
		}

	}

}

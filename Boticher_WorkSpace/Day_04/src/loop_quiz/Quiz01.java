package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-------���� 1------");

		for (int i = 35; i < 41; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("-------���� 2------");

		for (int i = 5; i > (-6); i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("-------���� 3------");

		for (int i = 3; i <= 50; i += 3) {
			System.out.print(i + " ");

		}
		System.out.println();

		System.out.println("-------���� 4------");

		int n = 0;

		for (int i = 7; i <= 100; i += 7) {
			n++;
		}
		System.out.println("7�� ����� ���� : " + n);

		System.out.println("-------���� 5------");

		System.out.print("�ܼ��� �Է��ϼ��� : ");
		n = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}

	}

}

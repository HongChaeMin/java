package loop_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��ϼ��� : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);

		System.out.print("���� �Է��ϼ��� : ");
		int n1 = sc.nextInt();
		int sum1 = 1;
		for (int i = 1; i <= n1; i++) {
			sum1 *= i;
		}
		System.out.println(sum1);

		System.out.print("���� �Է��ϼ��� : ");
		int n2 = sc.nextInt();
		for (int i = 1; i <= n2; i++) {
			if (n2 % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}

package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();

		// num�� 10 �̻��̰� 40 �����̴� / 10 <= num <= 40 (�׸��� AND)
		if (num >= 10 && num <= 40) {
			System.out.println("num�� 10 �̻��̰� 40 �����̴�");
		}

		// �Ǵ� OR		
		if (num < 10 || num > 40) {
			System.out.println("num�� 10 �̻��̰ų� 40 �����̴�");
		}

	}

}

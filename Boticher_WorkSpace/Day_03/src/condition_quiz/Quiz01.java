package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-----------���� 1-----------");

		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("����Դϴ�");
		}

		System.out.println("-----------���� 2-----------");

		System.out.println("������ �Է��ϼ��� : ");
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

		System.out.println("-----------���� 3-----------");

		System.out.print("BMI ��ġ�� �Է����ּ��� : ");
		int bmi = sc.nextInt();

		if (0 <= bmi && bmi < 10) {
			System.out.println("�����Դϴ�");
		} else if (bmi >= 10 && bmi < 20) {
			System.out.println("��ü���Դϴ� �� �� ������");
		} else if (bmi >= 20) {
			System.out.println("���ε� �ɰ��ϴٰ� ���� �� ��?");
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		}

	}

}

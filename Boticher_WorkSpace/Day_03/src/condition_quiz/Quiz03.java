package condition_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-----------���� 1-----------");

		System.out.println("�� ������ �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if ((a + b) / 2 >= 70) {
			System.out.println("�հ��Դϴ�");
		} else {
			System.out.println("���� ������ ���ϳ׿� ����");
		}

		System.out.println("-----------���� 2-----------");

		int max = 0;
		int arr[] = new int[3];

		System.out.println("�� ���� ���� �Է��ϼ���");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		System.out.println("-----------���� 3-----------");

		System.out.print("���� : ");
		int ko = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();

		double avg = (ko + math) / 2.0;

		if (ko < 50 || math < 50) {
			System.out.println("����");
		} else if (avg >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}

		System.out.println("-----------���� 4-----------");

		System.out.print("���� : ");
		int year = sc.nextInt();

		if (year % 400 == 0) {
			System.out.println("����");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}

		System.out.println("-----------���� 5-----------");

		System.out.print("�� ���¸� �Է��ϼ��� : ");

		a = sc.nextInt();
		b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		max = a + b + c + d;

		if (max == 1) {
			System.out.println("��");
		} else if (max == 2) {
			System.out.println("��");
		} else if (max == 3) {
			System.out.println("��");
		} else if (max == 4) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}

	}

}

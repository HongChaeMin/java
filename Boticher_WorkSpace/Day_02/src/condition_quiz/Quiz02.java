package condition_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-----------���� 1-----------");

		System.out.println("�� ������ �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > 70 && b > 70) {
			System.out.println("�հ��Դϴ�");
		} else {
			System.out.println("�ٽ� �����ض� !!!!!");
		}

		System.out.println("-----------���� 2-----------");

		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2�� 3�� ������Դϴ�");
		}else {
			System.out.println("�� �ƴϾ�");
		}
		
		System.out.println("-----------���� 3-----------");

		System.out.print("1 ~ 10 ������ ���� �Է��ϼ��� : ");
		num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			System.out.println("���߾��");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
		
	}

}

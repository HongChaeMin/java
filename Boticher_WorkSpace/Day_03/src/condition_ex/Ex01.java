package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�����Ը� �Է��ϼ��� : ");
		int weight = sc.nextInt();

		if (weight <= 70) {
			System.out.println("ġ������Ű����������");
		} else {
			System.out.println("������ �Ծ�");
		}

		// if - else if - else��

		if (weight <= 70) { // 70kg ����
			System.out.println("������ ����");
		} else if (weight <= 75) { // 71 ~ 75
			System.out.println();
		} else if (weight <= 80) { // 76 ~ 80
			System.out.println();
		} else { // 80 ~
			System.out.println("���� ����");
		}

	}

}

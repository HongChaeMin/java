package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
//
//		// if - else if = else��
//		if (num == 1) {
//			System.out.println("number�� 1�̴�");
//		} else if (num == 2) {
//			System.out.println("number�� 2�̴�");
//		} else {
//			System.out.println("number�� 1�̳� 2�� �ƴϴ�");
//		}

		// switch �� : ���� - '����' | if �� ��� ����� �� �ִ�
		// break�� : break�� ���� ���� ����� ����ġ���� �������´�
		switch(num) {
		case 1:
			System.out.println("number�� 1�̴�");
			break;
		case 2:
			System.out.println("number�� 2�̴�");
			break;
		default : // ��� ó�� �˾Ҵ� �Ҹ�...
			System.out.println("number�� 1�̳� 2�� �ƴϴ�");
			break; // ��� �����ص� �ǰ� ���ص� ��
		}
		
		
		sc.close();
	}

}

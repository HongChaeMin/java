package condition_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��ϼ��� : ");
		switch (sc.nextInt()) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		}
	}

}
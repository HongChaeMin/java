package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner robot = new Scanner(System.in);

		//ctrl+Shift+f
		
		int gift = 0, q = 0;
		try {
			System.out.print("��ǰ ���� : ");
			gift = robot.nextInt();

			System.out.print("���� ���� : ");
			q = robot.nextInt();

			System.out.println("���� 1���� ��ǰ�� " + gift / q + "�� �� �� �ֽ��ϴ�");
			System.out.println("���� ��ǰ ������ " + gift % q + "�� �Դϴ�");
		} catch (Exception e) {
			System.out.println("���� �߻� !");
			System.out.println("���� : " + e.getMessage());
			//���߿� �ܼ� �α�(stacktrace)
			e.printStackTrace();
		}

	}

}

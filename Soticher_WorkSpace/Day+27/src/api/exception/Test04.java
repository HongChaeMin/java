package api.exception;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// �߰� ���� ��Ȳ : ��ǰ�� ������ ������ ������ �����
		// -> ���� �߰��� �˷�����մϴ� *( ���� ���� ) throw

		Scanner robot = new Scanner(System.in);

		// ctrl+Shift+f

		int gift = 0, q = 0;
		try {
			System.out.print("��ǰ ���� : ");
			gift = robot.nextInt();
			if (gift < 0) {
				throw new Exception("��ǰ�� ������ �� �����ϴ�");
			}

			System.out.print("���� ���� : ");
			q = robot.nextInt();
			if (q < 0) {
				throw new Exception("������ ������ �� �����ϴ�");
			}

			System.out.println("���� 1���� ��ǰ�� " + gift / q + "�� �� �� �ֽ��ϴ�");
			System.out.println("���� ��ǰ ������ " + gift % q + "�� �Դϴ�");
		} catch (Exception e) {
			System.out.println("���� �߻� !");
			System.out.println("���� : " + e.getMessage());
			// ���߿� �ܼ� �α�(stacktrace)
			//e.printStackTrace();
		}

	}

}

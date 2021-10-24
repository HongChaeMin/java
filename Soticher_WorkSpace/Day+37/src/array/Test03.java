package array;

import java.util.Scanner;

public class Test03 {

	Scanner sc = new Scanner(System.in);

	int seat[] = new int[7];
	int money = 0;
	boolean c = false;

	public void check() {

		for (int i = 0; i < seat.length; i++) {
			if (seat[i] != 1) {
				c = true;
			}
		}

		if (c) {
			System.out.print("�¼� ���� : ");
			int s = sc.nextInt();
			if (seat[s - 1] != 0) {
				System.out.println("�̹� ���Ű� �Ϸ�� �ڸ� �Դϴ�");
			} else {
				System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�");
				money += 12000;
				seat[s - 1] = 1;
			}
		} else {
			System.out.println("��� �¼��� ���Ű� �Ϸ�Ǿ����ϴ�");
		}
		c = false;
	}

	public void disp() {
		System.out.print("�¼� = ");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Test03 t = new Test03();

		boolean y = true;

		t.disp();

		while (y) {
			System.out.println("1. �����ϱ�\t2. �����ϱ�\t3. ����");
			switch (sc.nextInt()) {
			case 1:
				t.check();
				t.disp();
				break;
			case 2:
				System.out.println("�� ���� �ݾ��� " + t.money + "�� �Դϴ�");
				System.out.println("���� �Ϸ� !");
				t.money = 0;
				break;
			case 3:
				if (t.money != 0) {
					System.out.println("�� ������ !!! �����ϼ��� ;;;");
				} else {
					System.out.println("�����մϴ�");
					y = false;
				}
				break;
			}
		}

	}

}

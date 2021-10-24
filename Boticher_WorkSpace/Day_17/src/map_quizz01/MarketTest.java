package map_quizz01;

import java.util.Scanner;

public class MarketTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean check = true;

		Market market = new Market();

		while (check) {
			System.out.println("1. ���\t 2. ����\t3. ����\t4. ����\t5. ����");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("�̸�, ����, �ǸŻ��¸� �Է����ּ���");
				Goods goods = new Goods(sc.next(), sc.nextInt(), sc.next());
				market.create(goods);
				break;
			case 2:
				market.read();
				break;
			case 3:
				System.out.println("1. ��ǰ�� ���� ����\t 2. �Ǹ� ���� ����");
				int num = sc.nextInt();
				if (num == 1) {
					System.out.println("��ǰ��, ������ ������ �Է����ּ���");
					market.update(sc.next(), sc.nextInt());
				} else if (num == 2) {
					System.out.println("��ǰ��, ������ �Ǹ� ���¸� �Է����ּ���");
					market.update(sc.next(), sc.next());
				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�");
				}
				break;
			case 4:
				System.out.println("������ ��ǰ�� �Է����ּ���");
				market.delete(sc.next());
				break;
			case 5:
				System.out.println("�ý����� �����մϴ�");
				check = false;
				break;
			}
		}

	}

}

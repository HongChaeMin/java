package api.util.collention.set;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Info> set = new HashSet<>();
		Iterator<Info> it = set.iterator();

		String name = null;
		String num = null;

		boolean check = true;

		while (check) {
			System.out.println("��� �� �޴���ȣ�� �Է����ּ���");
			System.out.println("1. ��ȭ��ȣ ����     2. ��ȭ��ȣ ����      3. ��ȭ��ȣ��Ϻ���");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("�̸��� �Է����ּ��� : ");
				name = sc.next();

				for (Info in : set) {
					if (in.getName().equals(name)) {
						System.out.println("���� �̸��� �����մϴ�");
						check = false;
						break;
					}
				}

				if (check) {
					System.out.print("��ȭ��ȣ�� �Է����ּ��� : ");
					num = sc.next();
					set.add(new Info(name, num));
					System.out.println("������ �Ϸ�Ǿ����ϴ�");
				}
				break;
			case 2:
				System.out.print("������ ��ȣ �̸��� �Է����ּ��� : ");
				name = sc.next();
				it = set.iterator();
				while(it.hasNext()) {
					if (it.next().getName().equals(name)) {
						it.remove();
						System.out.println("���� �Ǿ����ϴ�");
						check = false;
						break;
					}
					if (check) {
						System.out.println("�̸��� �������� �ʽ��ϴ�");
					}
				}
				break;
			case 3:
				for (Info in : set) {
					in.disp();
				}
				break;
			}
			check = true;
		}

	}

}

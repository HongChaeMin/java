package api.util.collection.map;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();
		String name = null;
		int dollor = 0;
		boolean c = true;

		while (c) {
			System.out.println("����Ͻ� �޴� ��ȣ�� �Է����ּ���.\n1. ��ǰ���\t2. ��ǰ����\t3. ��ǰ���\t4. ����");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("��ǰ �̸� : ");
				name = sc.next();
				System.out.print("��ǰ ���� : ");
				dollor = sc.nextInt();
				if (map.containsKey(name)) {
					System.out.print("�̹� ��ϵ� ��ǰ�Դϴ�. ������ �����Ͻðڽ��ϱ�? ( Y / N )  :  ");
					String check = sc.next();
					if (check.toLowerCase().equals("y")) {
						map.replace(name, dollor);
						System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
					} else {
						System.out.println("����� ��� �Ǿ����ϴ�.");
					}
				} else {
					map.put(name, dollor);
					System.out.println("��ǰ�� ��ϵǾ����ϴ�. ���� " + map.size() + "���� ��ϵǾ� �ֽ��ϴ�.");
				}
				break;
			case 2:
				System.out.print("�����Ͻ� ��ǰ �̸��� �Է����ּ��� : ");
				name = sc.next();
				if (map.containsKey(name)) {
					map.remove(name);
					System.out.println("������ �Ϸ�Ǿ����ϴ�. ���� " + map.size() + "���� ��ϵǾ� �ֽ��ϴ�.");
				} else {
					System.out.println("��ǰ�� ��ϵǾ� ���� �ʽ��ϴ�.");
				}
				break;
			case 3:
				Set<String> set = map.keySet();
				for (String key : set) {
					Integer value = map.get(key);
					System.out.println("��ǰ : " + key + "\t���� : " + value);
				}
				break;
			case 4:
				System.out.println("�ý����� �����մϴ�");
				c = false;
				break;
			}
		}

	}

}

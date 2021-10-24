package api.util.collection.map;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		Scanner ggu = new Scanner(System.in);

		int c = 1;

		while (c == 1) {
			System.out.println("��� �� �޴���ȣ�� �Է����ּ���");
			System.out.println("1. ��ȭ��ȣ ����     2. ��ȭ��ȣ ����     3. ��ȭ��ȣ ����     4. ��ȭ��ȣ��Ϻ���     5. ����");
			switch (ggu.nextInt()) {
			case 1:
				ggu.nextLine();
				System.out.print("������ ��ȣ�� �̸��� �Է����ּ��� : ");
				String name = ggu.nextLine();
				if (map.containsKey(name)) {
					System.out.println("�ߺ��� �̸��Դϴ�");
				} else {
					System.out.print("������ ��ȣ�� �Է����ּ��� : ");
					String num = ggu.nextLine();
					map.put(name, num);
					System.out.println("������ �Ϸ�Ǿ����ϴ�");
				}
				break;
			case 2:
				ggu.nextLine();
				System.out.print("������ ��ȣ �̸��� �Է����ּ��� : ");
				String name1 = ggu.nextLine();
				if (map.containsKey(name1)) {
					map.remove(name1);
				} else {
					System.out.println("�̸��� �������� �ʽ��ϴ�");
				}
				break;
			case 3:
				ggu.nextLine();
				System.out.print("������ ��ȣ�� �̸��� �Է����ּ��� : ");
				String name2 = ggu.nextLine();
				if (map.containsKey(name2)) {
					System.out.print("������ ��ȣ�� �Է����ּ��� : ");
					String num1 = ggu.nextLine();
					map.replace(name2, num1);
					System.out.println("������ �Ϸ�Ǿ����ϴ�");
				} else {
					System.out.println("��ȣ�� �������� �ʽ��ϴ�");
				}
				break;
			case 4:
				Set<String> set = map.keySet();
				for(String key : set) {
					String value = map.get(key);
					System.out.println("�̸� : "+key+"\t��ȭ��ȣ : "+value);
				}
				
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�");
				c--;
				break;
			}
		}

	}

}

package map_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();

		boolean check = true;

		while (check) {
			System.out.println("1.�Է� 2.��� 3.���� 4.����");
			switch (sc.nextInt()) {
			case 1:
				boolean on1 = true;
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("������� (yyyyddmm) : ");
				int brith = sc.nextInt();
				for (Person person : list) {
					if (person.getName().equals(name)) {
						System.out.println("�̸��� �ߺ��Ǿ� �ֽ��ϴ�");
						on1 = false;
						break;
					}
				}
				if (on1) {
					list.add(new Person(name, brith));
					System.out.println("�����Ͽ����ϴ�");
				}
				break;
			case 2:
				if (list.isEmpty()) {
					System.out.println("����ֽ��ϴ�");
					break;
				}
				for (Person person : list) {
					person.disp();
				}
				break;
			case 3:
				System.out.print("������ ��� �̸��� �Է��ϼ��� : ");
				String removeName = sc.next();
				Iterator<Person> iter = list.iterator();
				boolean on = true;
				while (iter.hasNext()) {
					Person person = iter.next();
					if (removeName.equals(person.getName())) {
						iter.remove();
						System.out.println("�����Ǿ����ϴ�");
						on = false;
						break;
					}
				}
				if (on) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�");
				}
				break;
			case 4:
				System.out.println("�ý����� �����մϴ�");
				check = false;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				break;
			}
		}

	}

}
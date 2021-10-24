package map_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();

		boolean check = true;

		/// CRUD : create, read, update, delete
		
		while (check) {
			System.out.println("1. �Է�\t 2. ���\t 3. ����\t 4. ����");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("���� �̸��� �Է��ϼ��� : ");
				String furit = sc.next();
				if (list.contains(furit)) {
					System.out.println("�̹� ��ϵǾ� �ִ� �����Դϴ�");
				} else {
					list.add(furit);
					System.out.println("�Է� ����");
				}
				break;
			case 2:
				if (list.isEmpty()) {
					System.out.println("���Ϲٱ��ϰ� ��� �ֽ��ϴ�");
					break;
				}
				System.out.println(list);
				break;
			case 3:
				System.out.print("������ ���� �̸��� �Է��ϼ��� : ");
				String remove = sc.next();
				System.out.println(list.remove(remove) ? "������ �Ϸ�Ǿ����ϴ�" : "�߸� �Է��ϼ̽��ϴ�");
				break;
			case 4:
				System.out.println("�ý����� �����մϴ�");
				check = false;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		}

	}

}
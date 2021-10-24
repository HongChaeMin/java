package api.util.cellection.list;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// List - �������� �ߺ��� ���ǰ� �������� ������ �����Ǵ� �������� ����� �����ϴ� �÷���

		// - Ȯ���� �迭

		List<String> list = new ArrayList<String>();
		// <���� �߰��ϰ��� �ϴ� �ڷ���>

		// �����Ͱ� ����ִ��� Ȯ��
		System.out.println(list.isEmpty());

		// ������ �߰� - .add
		list.add("Black");// 0
		list.add("Red");// 1
		list.add("White");// 2 -> 3
		list.add("Green");// 3 -> 4
		list.add("Gray");// 4 -> 5
		list.add("Black");// 5 -> 6

		list.add(2, "Pink");// 2 ������ ���� �ڷ� �з���

		// ������ ����
		System.out.println(list.size());

		// ������ ���� �˻�(��ҹ��ڱ���) - .contains(E)
		System.out.println(list.contains("Black"));
		System.out.println(list.contains("black"));

		System.out.println("==========================");

		// ������ ����
		// .get(i)
		String color = list.get(2);
		System.out.println(color);

		System.out.println("==========================");

		// ��ü ������ ����
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==========================");

		System.out.println(list.indexOf("Black")); // ó�� ������ �ε��� ��ȣ
		System.out.println(list.lastIndexOf("Black")); // ���������� ������ �ε��� ��ȣ

		System.out.println("==========================");

		// ������ ����
		list.remove(0);// Black
		list.remove("Pink");// 2��° index -> 1��° index
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==========================");

		List<String> sub = (List<String>) list.subList(0, 2);

		// 0, 1
		// ��ü ������ ����
		for (int i = 0; i < sub.size(); i++) {
			System.out.println(sub.get(i));
		}

	}

}

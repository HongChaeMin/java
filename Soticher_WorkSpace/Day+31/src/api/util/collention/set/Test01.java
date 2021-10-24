package api.util.collention.set;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {

		// Set
		// - �������� �ߺ��� ������� �ʰ� �������� ��������� ���� �÷���
		// - �������� ��ü�� �����ϴ� �뵵�� ���� ���ȴ�

		// ���ʸ�
		// - ���� ���ϴ� Ÿ������ ������ִ� ����
		// - ������α׷������� ���� ������ �ʿ��� ����

		// HashSet
		Set<String> set = new HashSet<>();
		// ���� ��Ȳ���� ���ʸ��� ������ HashSet�ȿ� ����� ����� Ÿ���� �����ϴ� ����

		// set�� �����Ͱ� �ִ��� ������ �Ǵ��ϴ� �޼ҵ� - .isEmpty()
		System.out.println(set.isEmpty()); // set�� ��Ұ� ������ true

		// ������ �߰� = .add
		set.add("��?");
		set.add("fuck");
		set.add("you");
		set.add("love");
		set.add("��?");

		// set.add(1); //String �� ���밡��

		// ������ ���� - .size()
		System.out.println(set.size()); // ��?�� �ߺ��̱� ������ 4���� �߰�

		// ������ ���� �˻� - .contains(E)
		System.out.println(set.contains(12)); // ������ �� �� ���� ���� �ƴ� ��
		System.out.println(set.contains("��?"));

		// .iterator()
		// - ������ �������� �ʴ� ��� ��ü���� ������ �ִ� ���·� ��ȯ���ִ� Ŭ����
		// - �ݺ��Ͽ� �����͸� ���� �� �� �ְ� ������ִ� Ŭ����

		// - set�� �ڷ����� �����͸� ������ �� �ִ� ����� ����
		// - Iterator��ü�� ���� �����ϰ� �ȴ�
		// - set���� remove�� �ϸ� Iterator�� ������ ����ȭ�� ���� �ʱ� ������ error�߻�
		// iterator���� remove�� ���־�� �Ѵ�

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {// ���� �����Ͱ� ������ true ������ false
			String color = it.next();
			System.out.println(color);
		}

		System.out.println("==========================");

		// set.remove("fuck"); ���� x
		it = set.iterator();

		it.next();
		it.remove();

		while (it.hasNext()) {
			String color = it.next();
			System.out.println(color);
		}

		for (String color : set) {
			System.out.println(color);
		}
	}

}

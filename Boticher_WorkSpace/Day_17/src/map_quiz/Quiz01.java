package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> subject = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			System.out.print("���� : ");
			String su = sc.next();
			System.out.print("���� : ");
			int score = sc.nextInt();
			subject.put(su, score);
		}

		System.out.println(subject);

		Set<String> set = subject.keySet();
		Iterator<String> iter = set.iterator();

		if (subject.containsKey("��ȸ")) {
			subject.put("��ȸ", subject.get("��ȸ") + 5);
		} else {
			System.out.println("\' ��ȸ \' ������ �����ϴ�");
		}

//		for (String key : set) {
//			Integer value = subject.get(key);
//			if (key.equals("��ȸ")) {
//				subject.put(key, value + 5);
//			}
//		}

		System.out.println(subject);

		System.out.print("��ȸ�� ������� �Է��ϼ��� : ");
		String name = sc.next();

		if (subject.containsKey(name)) {
			System.out.println(name + " : " + subject.get(name));
		} else {
			System.out.println("���� ����");
		}

		System.out.println("90�� �̻��� �����");
		while (iter.hasNext()) {
			String su = iter.next();
			int score = subject.get(su);
			if (score >= 90) {
				System.out.print(su + " ");
			}
		}

		System.out.println();

		if (subject.containsValue(100)) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� �� �ؿ� �Ф�");
		}

//		boolean on = true;
//		for (String key : set) {
//			int score = subject.get(key);
//			if (score == 100) {
//				System.out.println("���� ����");
//				on = false;
//				continue;
//			}
//		}
//		if (on) {
//			System.out.println("���� ���ؿ� �� ����ϼ��� ^^");
//		}

	}

}
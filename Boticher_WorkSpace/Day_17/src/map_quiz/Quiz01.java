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
			System.out.print("과목 : ");
			String su = sc.next();
			System.out.print("성적 : ");
			int score = sc.nextInt();
			subject.put(su, score);
		}

		System.out.println(subject);

		Set<String> set = subject.keySet();
		Iterator<String> iter = set.iterator();

		if (subject.containsKey("사회")) {
			subject.put("사회", subject.get("사회") + 5);
		} else {
			System.out.println("\' 사회 \' 과목이 없습니다");
		}

//		for (String key : set) {
//			Integer value = subject.get(key);
//			if (key.equals("사회")) {
//				subject.put(key, value + 5);
//			}
//		}

		System.out.println(subject);

		System.out.print("조회할 과목명을 입력하세요 : ");
		String name = sc.next();

		if (subject.containsKey(name)) {
			System.out.println(name + " : " + subject.get(name));
		} else {
			System.out.println("과목 없음");
		}

		System.out.println("90점 이상의 과목들");
		while (iter.hasNext()) {
			String su = iter.next();
			int score = subject.get(su);
			if (score >= 90) {
				System.out.print(su + " ");
			}
		}

		System.out.println();

		if (subject.containsValue(100)) {
			System.out.println("수상 가능");
		} else {
			System.out.println("수상 못 해요 ㅠㅜ");
		}

//		boolean on = true;
//		for (String key : set) {
//			int score = subject.get(key);
//			if (score == 100) {
//				System.out.println("수상 가능");
//				on = false;
//				continue;
//			}
//		}
//		if (on) {
//			System.out.println("수상 못해요 더 노력하세요 ^^");
//		}

	}

}

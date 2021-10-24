package list_quiz01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));

		list.sort(null);

		double avg = 0.0;

		for (int i = 1; i < list.size() - 1; i++) {
			avg += list.get(i);
		}

		avg /= list.size() - 2;

		System.out.println("최고점과 최저점을 제외한 평균 점수는 " + avg);

		ArrayList<String> member1 = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));

		ArrayList<String> member2 = new ArrayList<>(Arrays.asList("채민", "루피", "쵸파", "로빈", "루피"));

		
		// 쌤코드
		int count = 1;
		for(int i=0; i< member2.size(); i++) {
			if (member1.contains(member2.get(i))) { // 동명이인 있는 경우
				String name = member2.get(i) + count; // 숫자가 붙은 이름
				if (member1.contains(name)) { // 숫자가 붙은 이름도 동명이인인지 확인
					i--; // 이름 + 번호 이름응로 다시 한 번 검사하기 위해 같은 이름으로 반복문을 다시 돌린다
					count++;
					continue;
				}
				member1.add(name);
				count = 1;
			} else {
				member1.add(member2.get(i));
			}
		}

		System.out.println(member1);
		
//		for (int i = 0; i < member1.size(); i++) {
//			int num = 1;
//			for (int j = 0; j < member2.size(); j++) {
//				if (member1.get(i).equals(member2.get(j))) {
//					member2.set(j, member2.get(j) + num);
//					num++;
//				}
//			}
//		}
//
//		member1.addAll(member2);
//
//		System.out.println(member1.toString());

	}

}

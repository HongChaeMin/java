package api.util.cellection.list;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// List - 데이터의 중복이 허용되고 데이터의 순서가 유지되는 데이터의 목록을 관리하는 컬렉션

		// - 확장형 배열

		List<String> list = new ArrayList<String>();
		// <내가 추가하고자 하는 자료형>

		// 데이터가 비어있는지 확인
		System.out.println(list.isEmpty());

		// 데이터 추가 - .add
		list.add("Black");// 0
		list.add("Red");// 1
		list.add("White");// 2 -> 3
		list.add("Green");// 3 -> 4
		list.add("Gray");// 4 -> 5
		list.add("Black");// 5 -> 6

		list.add(2, "Pink");// 2 나머지 값은 뒤로 밀려남

		// 데이터 개수
		System.out.println(list.size());

		// 데어터 유무 검색(대소문자구분) - .contains(E)
		System.out.println(list.contains("Black"));
		System.out.println(list.contains("black"));

		System.out.println("==========================");

		// 데이터 추출
		// .get(i)
		String color = list.get(2);
		System.out.println(color);

		System.out.println("==========================");

		// 전체 데이터 추출
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==========================");

		System.out.println(list.indexOf("Black")); // 처음 나오는 인덱스 번호
		System.out.println(list.lastIndexOf("Black")); // 마지막으로 나오는 인덱스 번호

		System.out.println("==========================");

		// 데이터 삭제
		list.remove(0);// Black
		list.remove("Pink");// 2번째 index -> 1번째 index
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==========================");

		List<String> sub = (List<String>) list.subList(0, 2);

		// 0, 1
		// 전체 데이터 추출
		for (int i = 0; i < sub.size(); i++) {
			System.out.println(sub.get(i));
		}

	}

}

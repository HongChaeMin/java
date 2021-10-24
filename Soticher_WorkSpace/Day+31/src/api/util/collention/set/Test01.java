package api.util.collention.set;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {

		// Set
		// - 데이터의 중복을 허용하지 않고 데이터의 저장순서가 없는 컬렉션
		// - 데이터의 전체를 관리하는 용도로 많이 사용된다

		// 제너릭
		// - 내가 원하는 타입으로 만들어주는 문법
		// - 고급프로그래밍으로 가면 갈수록 필요한 문법

		// HashSet
		Set<String> set = new HashSet<>();
		// 현재 상황으로 제너릭의 역할은 HashSet안에 저장될 요소의 타입을 지정하는 형태

		// set에 데이터가 있는지 없는지 판단하는 메소드 - .isEmpty()
		System.out.println(set.isEmpty()); // set에 요소가 없으면 true

		// 데이터 추가 = .add
		set.add("뀨?");
		set.add("fuck");
		set.add("you");
		set.add("love");
		set.add("뀨?");

		// set.add(1); //String 만 적용가능

		// 데이터 개수 - .size()
		System.out.println(set.size()); // 뀨?는 중복이기 때문에 4개만 추가

		// 데이터 유무 검색 - .contains(E)
		System.out.println(set.contains(12)); // 어차피 들어갈 수 없는 값을 아는 것
		System.out.println(set.contains("뀨?"));

		// .iterator()
		// - 순서가 존재하지 않는 어떠한 객체에서 순서가 있는 형태로 변환해주는 클래스
		// - 반복하여 데이터를 추출 할 수 있게 만들어주는 클래스

		// - set은 자력으로 데이터를 추출할 수 있는 방법이 없다
		// - Iterator객체를 통해 추출하게 된다
		// - set에서 remove를 하면 Iterator와 데이터 동기화가 되지 않기 때문에 error발생
		// iterator에서 remove를 해주어야 한다

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {// 다음 데이터가 있으면 true 없으면 false
			String color = it.next();
			System.out.println(color);
		}

		System.out.println("==========================");

		// set.remove("fuck"); 권장 x
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

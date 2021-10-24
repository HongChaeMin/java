package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		// 배열 (Array)
		// 1. 크기를 미리 알고 있어야 한다 / 크기가 고정되어 있다
		// 2. 중간에 있는 값을 빼내면 비어있는 채로 유지된다
		// 3. index기반으로 접근한다
		// 4. 기본 자료형, 클래스 자료형도 담을 수 있다
		
		// 리스트 (List)
		// 1. 크기가 고정되어 있지 않고, 동적으로 할당된다
		// 2. 중간에 있는 값을 빼내면 앞으로 당겨진다 (메모리 낭비가 없다)
		// 3. 여러 방법으로 데이터를 다룰 수 있다
		// 4. 클래스 자료형만 담을 수 있다
		// 5. 타입 안정성을 보장하는 Generic 문법을 쓸 수 있다
		
		// List Interface의 실제 구현체인 ArrayList 사용
		// 처음 만들어질 때 10개가 만들어져서 나중에 더 추가되면 총 길이의 반만큼 더 늘어단다고 함
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println("list1 : " + list1);
		System.out.println("list1 toSting() : " + list1.toString());
		
		// List Interface의 실제 구현체인 LinkedList 사용
		List<Integer> list2 = new LinkedList<>();
		list2.add(10);
		list2.addAll(list1);
		System.out.println("list2 : " + list2);
		
		// 요소 수정하기
		// 첫 번 째 요소인 10 -> 200으로 변경
		System.out.println(list2.set(0, 200)); // 기존에 있던 값을 리턴해줌
		System.out.println(list2.get(0));
		
		// 요소 삭제하기
		Integer deletedValue = list2.remove(1); // index 1 위치의 요소 값 제거
		System.out.println(deletedValue);
		System.out.println("list2 : " + list2);
		Integer dValue = 200;
		list2.remove(dValue);
		System.out.println("list2 : " + list2);
		
		// 두 가지의 특징
		int a = 0; // null 안들어감
		Integer b = null; // 얘는 됨
		
		List<String> strList1 = new ArrayList<>();
		
		strList1.add("fuck");
		strList1.add("you");
		System.out.println(strList1.remove("fuck"));
		System.out.println("strList1 : " + strList1);
		
		// 모든 요소 삭제하기
		strList1.clear();
		System.out.println("strList1 : " + strList1);
		
	}

}

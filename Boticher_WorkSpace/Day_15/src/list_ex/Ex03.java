package list_ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(3);
		list.add(9);
		list.add(1);
		
		// List에 숫자 5가 들어있는가?
		boolean contatnValue = list.contains(5);
		System.out.println(contatnValue);
		System.out.println(list.contains(7));
		
		// 오름차순 정렬하기
		list.sort(Comparator.naturalOrder()); // return 받지 않아도 정렬되어 저장된다
		System.out.println(list);
		
		// 내림차순 정렬하기
		list.sort(Comparator.reverseOrder()); // 역순
		System.out.println(list);
		 
		// List에 값이 비어있는가 ?
		System.out.println("리스트가 비어있는가 ? : " + list.isEmpty());
		
		list.clear();
		System.out.println("리스트가 비어있는가 ? : " + list.isEmpty());
		System.out.println(list);
	}

}

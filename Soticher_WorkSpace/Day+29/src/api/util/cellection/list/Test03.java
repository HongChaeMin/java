package api.util.cellection.list;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();

		//Integer - int : 정수형
		
		for(int i=1; i<=10; i++) {
			list.add(i);// 추가는 int/Integer 무관(auto - boxing)
		}
		
		System.out.println(list);
		//List의 경우 Collections라는 보조 클래스의 도움을 받아 다양한 처리를 구현할 수 있다
		//ex) Arrays 클래스
		
		//[1] 무작위 섞기 기능		.shuffle()
		Collections.shuffle(list);
		System.out.println(list);
		
		//[2] 뒤집기 기능		.reverse()
		Collections.reverse(list);
		System.out.println(list);
		
		//[3] 정렬 기능		.sort()
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}

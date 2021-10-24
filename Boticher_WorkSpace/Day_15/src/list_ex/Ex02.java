package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();
		strList.add("apple");
		strList.add("banana");
		strList.add("grape");

		// 1. index 기반으로 출력
		// 문제점 : 요소를 중간에 제거하면 문제가 생긴다 (사이즈가 변경이 되기 때문에)
		System.out.println("-----for-----");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
			
			// 만약에 b로 시작하면 요소제거
			String fruit = strList.get(i);
			if(fruit.startsWith("b")) {
				strList.remove(i);
				i--; // 삭제 될 때 한 번 더 돌리기 위해 
			}
		}

		// 2. Iterator 사용하기
		System.out.println("-----iterator-----");
		
		Iterator<String> iter = strList.iterator();
		
		while(iter.hasNext()) {
			String frit = iter.next(); // next() 호출할 때 마다 소비가 되므로 반복문에서 한 번 만 수행하는 것
			System.out.println(frit);
			
			if(frit.startsWith("b")) {
				iter.remove(); // 리스트에서 삭제가 아니라 반드시 iterator의 remove로 삭제헤야 한다
			}
		}
		
		// 3. 향상된 for문으로 돌리기
		System.out.println("-----향상된 for-----");
		for(String fruit : strList) {
			System.out.println(fruit);
			
			if(fruit.startsWith("b")) {
				strList.remove(fruit);
			}
		}
		
	}

}

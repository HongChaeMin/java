package list_quiz01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {

		// 한 번에 넣기 
		// 이렇게 만들면 수정, 추가할 수 없다
		List<Integer> list = Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5);
		
		// 이렇게 만들면 수정, 추가할 수 있다
		List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5));
		
		System.out.println(list.toString());

		System.out.println("----------------------");
		
		list.set(3, 6);
		
		System.out.println(list.toString());
		
		System.out.println("-----------------------");
		
		Integer e = 8;
		Integer s = 7;
		list.remove(e);
		list.remove(s);
		
		System.out.println(list.toString());
		
	}

}

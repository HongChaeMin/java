package list_quiz01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(10, 3, 5, 84, 27));

//		list.sort(null);
//		
//		System.out.println(list.get(0));

		int min = Integer.MAX_VALUE; // int min = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}

		System.out.println(min);

		int sum = 0;

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			sum += iterator.next();
		}

		System.out.println(sum);

	}

}

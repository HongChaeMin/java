package api.util.cellection.list;

import java.util.*;

public class Test04 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++) {
			int su = (int) ((Math.random()*50)+1);
			if(list.contains(su)) {
				i--;
			}
			else {
				list.add(su);
			}
		}
		Collections.sort(list);
		System.out.println(list);

		System.out.println("===========================");

		for (int i = 1; i <= 50; i++) {
			list1.add(i);
		}
		Collections.shuffle(list1);
		Collections.sort(list1);
		System.out.print("[");
		for (int i = 0; i < 6; i++) {
			System.out.print(list1.get(i) + ", ");
		}
		System.out.println("]");

		System.out.println("===========================");

		list.clear();
		list1.clear();
		
		for (int i=1; i<=50; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		for(int i=0; i<6; i++) {
			list1.add(list.get(i));
		}
		Collections.sort(list1);
		System.out.println(list1);
		
	}

}

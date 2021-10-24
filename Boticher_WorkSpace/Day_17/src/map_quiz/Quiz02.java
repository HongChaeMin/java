package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, String> names = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			names.put(sc.next(), "X");
		}

		Set<String> key = names.keySet();

//		for(String name : key) {
//			if(name.startsWith("ÀÌ")) {
//				names.put(name, "O");
//			}
//		}
//		
//		System.out.println(names);

		Iterator<String> iter = key.iterator();

		while (iter.hasNext()) {
			String name = iter.next();
			if (name.startsWith("ÀÌ")) {
				names.put(name, "O");
			}
		}

		System.out.println(names);
	}

}

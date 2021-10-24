package api.util.cellection.list;

import java.util.*;

public class Test05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("경품에 참여할 인원 수를 입력해주세요 : ");
		
		int size = sc.nextInt();
		
		List<String> person = new ArrayList<>(size);
		List<String> what = new ArrayList<>(size);

		sc.nextLine();
		System.out.println("참여하는 사람의 이름을 적어주세요");
		for(int i=0; i<size; i++) {
			person.add(sc.nextLine());
		}
		System.out.println("인원 수 만큼 경품을 적어주세요");
		for(int i=0; i<size; i++) {
			what.add(sc.nextLine());
		}
		
		Collections.shuffle(what);
		
		for(int i=0; i<size; i++) {
			System.out.println(person.get(i)+"님의 상품은 "+what.get(i)+"입니다 축하드려요~!~!");
		}
		
	}

}

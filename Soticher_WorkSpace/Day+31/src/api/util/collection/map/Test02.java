package api.util.collection.map;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		Scanner ggu = new Scanner(System.in);

		int c = 1;

		while (c == 1) {
			System.out.println("사용 할 메뉴번호를 입력해주세요");
			System.out.println("1. 전화번호 저장     2. 전화번호 삭제     3. 전화번호 수정     4. 전화번호목록보기     5. 종료");
			switch (ggu.nextInt()) {
			case 1:
				ggu.nextLine();
				System.out.print("저장할 번호의 이름을 입력해주세요 : ");
				String name = ggu.nextLine();
				if (map.containsKey(name)) {
					System.out.println("중복된 이름입니다");
				} else {
					System.out.print("저장할 번호를 입력해주세요 : ");
					String num = ggu.nextLine();
					map.put(name, num);
					System.out.println("저장이 완료되었습니다");
				}
				break;
			case 2:
				ggu.nextLine();
				System.out.print("삭제할 번호 이름을 입력해주세요 : ");
				String name1 = ggu.nextLine();
				if (map.containsKey(name1)) {
					map.remove(name1);
				} else {
					System.out.println("이름이 존재하지 않습니다");
				}
				break;
			case 3:
				ggu.nextLine();
				System.out.print("수정할 번호의 이름을 입력해주세요 : ");
				String name2 = ggu.nextLine();
				if (map.containsKey(name2)) {
					System.out.print("수정할 번호를 입력해주세요 : ");
					String num1 = ggu.nextLine();
					map.replace(name2, num1);
					System.out.println("수정이 완료되었습니다");
				} else {
					System.out.println("번호가 존재하지 않습니다");
				}
				break;
			case 4:
				Set<String> set = map.keySet();
				for(String key : set) {
					String value = map.get(key);
					System.out.println("이름 : "+key+"\t전화번호 : "+value);
				}
				
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				c--;
				break;
			}
		}

	}

}

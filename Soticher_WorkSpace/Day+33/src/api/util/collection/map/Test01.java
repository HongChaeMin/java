package api.util.collection.map;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();
		String name = null;
		int dollor = 0;
		boolean c = true;

		while (c) {
			System.out.println("사용하실 메뉴 번호를 입력해주세요.\n1. 상품등록\t2. 상품삭제\t3. 상품목록\t4. 종료");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("상품 이름 : ");
				name = sc.next();
				System.out.print("상품 가격 : ");
				dollor = sc.nextInt();
				if (map.containsKey(name)) {
					System.out.print("이미 등록된 상품입니다. 가격을 변경하시겠습니까? ( Y / N )  :  ");
					String check = sc.next();
					if (check.toLowerCase().equals("y")) {
						map.replace(name, dollor);
						System.out.println("가격 변경이 완료되었습니다.");
					} else {
						System.out.println("등록이 취소 되었습니다.");
					}
				} else {
					map.put(name, dollor);
					System.out.println("상품이 등록되었습니다. 현재 " + map.size() + "개가 등록되어 있습니다.");
				}
				break;
			case 2:
				System.out.print("삭제하실 상품 이름을 입력해주세요 : ");
				name = sc.next();
				if (map.containsKey(name)) {
					map.remove(name);
					System.out.println("삭제가 완료되었습니다. 현재 " + map.size() + "개가 등록되어 있습니다.");
				} else {
					System.out.println("상품이 등록되어 있지 않습니다.");
				}
				break;
			case 3:
				Set<String> set = map.keySet();
				for (String key : set) {
					Integer value = map.get(key);
					System.out.println("상품 : " + key + "\t가격 : " + value);
				}
				break;
			case 4:
				System.out.println("시스템을 종료합니다");
				c = false;
				break;
			}
		}

	}

}

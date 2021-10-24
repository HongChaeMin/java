package api.util.collention.set;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Info> set = new HashSet<>();
		Iterator<Info> it = set.iterator();

		String name = null;
		String num = null;

		boolean check = true;

		while (check) {
			System.out.println("사용 할 메뉴번호를 입력해주세요");
			System.out.println("1. 전화번호 저장     2. 전화번호 삭제      3. 전화번호목록보기");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("이름을 입력해주세요 : ");
				name = sc.next();

				for (Info in : set) {
					if (in.getName().equals(name)) {
						System.out.println("같은 이름이 존재합니다");
						check = false;
						break;
					}
				}

				if (check) {
					System.out.print("전화번호를 입력해주세요 : ");
					num = sc.next();
					set.add(new Info(name, num));
					System.out.println("저장이 완료되었습니다");
				}
				break;
			case 2:
				System.out.print("삭제할 번호 이름을 입력해주세요 : ");
				name = sc.next();
				it = set.iterator();
				while(it.hasNext()) {
					if (it.next().getName().equals(name)) {
						it.remove();
						System.out.println("삭제 되었습니다");
						check = false;
						break;
					}
					if (check) {
						System.out.println("이름이 존재하지 않습니다");
					}
				}
				break;
			case 3:
				for (Info in : set) {
					in.disp();
				}
				break;
			}
			check = true;
		}

	}

}

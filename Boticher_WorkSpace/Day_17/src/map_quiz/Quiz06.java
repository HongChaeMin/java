package map_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();

		boolean check = true;

		/// CRUD : create, read, update, delete
		
		while (check) {
			System.out.println("1. 입력\t 2. 출력\t 3. 삭제\t 4. 종료");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("과일 이름을 입력하세요 : ");
				String furit = sc.next();
				if (list.contains(furit)) {
					System.out.println("이미 등록되어 있는 과일입니다");
				} else {
					list.add(furit);
					System.out.println("입력 성공");
				}
				break;
			case 2:
				if (list.isEmpty()) {
					System.out.println("과일바구니가 비어 있습니다");
					break;
				}
				System.out.println(list);
				break;
			case 3:
				System.out.print("삭제할 과일 이름을 입력하세요 : ");
				String remove = sc.next();
				System.out.println(list.remove(remove) ? "삭제가 완료되었습니다" : "잘못 입력하셨습니다");
				break;
			case 4:
				System.out.println("시스템을 종료합니다");
				check = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
			}
		}

	}

}

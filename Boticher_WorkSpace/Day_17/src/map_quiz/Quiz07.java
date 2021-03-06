package map_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();

		boolean check = true;

		while (check) {
			System.out.println("1.입력 2.출력 3.삭제 4.종료");
			switch (sc.nextInt()) {
			case 1:
				boolean on1 = true;
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("생년월일 (yyyyddmm) : ");
				int brith = sc.nextInt();
				for (Person person : list) {
					if (person.getName().equals(name)) {
						System.out.println("이름이 중복되어 있습니다");
						on1 = false;
						break;
					}
				}
				if (on1) {
					list.add(new Person(name, brith));
					System.out.println("성공하였습니다");
				}
				break;
			case 2:
				if (list.isEmpty()) {
					System.out.println("비어있습니다");
					break;
				}
				for (Person person : list) {
					person.disp();
				}
				break;
			case 3:
				System.out.print("삭제할 사람 이름을 입력하세요 : ");
				String removeName = sc.next();
				Iterator<Person> iter = list.iterator();
				boolean on = true;
				while (iter.hasNext()) {
					Person person = iter.next();
					if (removeName.equals(person.getName())) {
						iter.remove();
						System.out.println("삭제되었습니다");
						on = false;
						break;
					}
				}
				if (on) {
					System.out.println("잘못 입력하셨습니다");
				}
				break;
			case 4:
				System.out.println("시스템을 종료합니다");
				check = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		}

	}

}

package util.colletion;

import java.util.*;

public class Main {

	private static double max = 0.0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Score> list = new ArrayList<>();
		
		list.add(new Student("코난", 12, 45.6, 45.9, 12.1));
		list.add(new Student("남도일", 19, 34.2, 12.6, 99.9));
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).disp();
		}
		
		for(int i=0; i<list.size(); i++) {
			if(max < list.get(i).getSum()) {
				max = list.get(i).getSum();
			}
		}
		for(int i=0; i<list.size(); i++) {
			if(max == list.get(i).getSum()) {
				System.out.println("총점 이 가장 높은 학생");
				list.get(i).disp();
			}
		}
		
		System.out.println("=================================");
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("비둘기", 3, 4, 5, 6));
		set.add(new Student("참새", 4, 5.5, 5.4, 2.1));
		
		for(Score user : set) {
			user.disp();
		}
		
		String name;
		boolean check =  true;
		boolean c = true;
		Iterator<Student> it = null;
		
		while(c) {
			check = true;
			System.out.println("1. 입력  2. 전체 보기  3. 선택 보기  4. 종료");
			int n = sc.nextInt();
			switch(n) {
			case 1: 
				System.out.print("추가할 학생 이름을 적어주세요 : ");
				name = sc.next();
				for(Student user : set) {
					if(user.getName().equals(name)) {
						System.out.println("같은 이름이 존재합니다");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("나이, 국어성적, 수학성적, 영어성적을 적어주세요");
					set.add(new Student(name, sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
					System.out.println("학생 등록이 완료되었습니다");
				}
				break;
			case 2:
				for(Score student : set) {
					student.disp();
				}
				break;
			case 3 : 
				it = set.iterator();
				System.out.print("찾을 학생 이륾 입력 : ");
				name = sc.next();
				while(it.hasNext()) {
					Student s = it.next();
					if(s.getName().equals(name)) {
						s.disp();
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("입력한 학생의 정보가 없습니다");
				}
				break;
			case 4:
				System.out.println("프로그램으르 종료합니다");
				c = false;
				break;
			}
		}
		
	}

}

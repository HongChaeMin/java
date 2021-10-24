package api.util.collection.list.test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int students[] = new int[5];
		
//		for(int i=0; i<students.length; i++) {
//			System.out.println("학생의 이름, 나이, 수학성적, 국어성적, 영어성적, 키, 몸무게를 입력해주세요");
//			Student students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//		}
		
		//Student s1 = new Student("코난", 13, 30, 40, 50, 160, 55);
		//Student s2 = new Student("남도일", 19, 77, 88, 99, 180, 70);
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Body("코난", 13, 30, 40, 50, 160, 55));
		list.add(new Body("남도일", 19, 77, 88, 99, 180, 70));
		
		list.get(0).disp();
		System.out.println();
		list.get(1).disp();
		
	}

}

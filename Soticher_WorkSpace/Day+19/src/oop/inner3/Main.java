package oop.inner3;

import java.util.Scanner;

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
		
		Body st = new Body("코난", 14, 30, 40, 50, 160, 55);
		
		st.disp();
		
	}

}

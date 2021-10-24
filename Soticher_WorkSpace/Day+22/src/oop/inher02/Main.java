package oop.inher02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 수를 입력하세요");
		int a = sc.nextInt();
		
		Student students[] = new Student[a];
		StudentEx newstudents[] = new StudentEx[students.length];
		
		for(int i=0; i<students.length; i++) {
			System.out.println("학생의 이름, java 성적, c 성적을 입력하세요");
			students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		}

		System.out.println("\tname\tjava\tc\t함계\t평균");
		for(int i=0; i<students.length; i++) {
			System.out.print("["+(i+1)+"]\t");
			students[i].disp();
			System.out.println(students[i].tot+"\t"+students[i].p);
		}
		
		System.out.println("python이 추가되었습니다 이름에 맞는 점수를 입력해주세요");
		for(int i=0; i<newstudents.length; i++) {
			System.out.print(students[i].getName()+"의 python 성적 : ");
			newstudents[i] = new StudentEx(students[i].getName(), students[i].getJava(), students[i].getC(), sc.nextInt());
		}
		
		System.out.println("\tname\tjava\tc\tpython\t함계\t평균");
		for(int i=0; i<newstudents.length; i++) {
			System.out.print("["+(i+1)+"]\t");
			newstudents[i].disp();
			System.out.println();
		}
		
	}

}

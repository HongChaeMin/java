package oop.inner3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int students[] = new int[5];
		
//		for(int i=0; i<students.length; i++) {
//			System.out.println("�л��� �̸�, ����, ���м���, �����, �����, Ű, �����Ը� �Է����ּ���");
//			Student students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//		}
		
		//Student s1 = new Student("�ڳ�", 13, 30, 40, 50, 160, 55);
		//Student s2 = new Student("������", 19, 77, 88, 99, 180, 70);
		
		Body st = new Body("�ڳ�", 14, 30, 40, 50, 160, 55);
		
		st.disp();
		
	}

}

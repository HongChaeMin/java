package oop.inher02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л��� ���� �Է��ϼ���");
		int a = sc.nextInt();
		
		Student students[] = new Student[a];
		StudentEx newstudents[] = new StudentEx[students.length];
		
		for(int i=0; i<students.length; i++) {
			System.out.println("�л��� �̸�, java ����, c ������ �Է��ϼ���");
			students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		}

		System.out.println("\tname\tjava\tc\t�԰�\t���");
		for(int i=0; i<students.length; i++) {
			System.out.print("["+(i+1)+"]\t");
			students[i].disp();
			System.out.println(students[i].tot+"\t"+students[i].p);
		}
		
		System.out.println("python�� �߰��Ǿ����ϴ� �̸��� �´� ������ �Է����ּ���");
		for(int i=0; i<newstudents.length; i++) {
			System.out.print(students[i].getName()+"�� python ���� : ");
			newstudents[i] = new StudentEx(students[i].getName(), students[i].getJava(), students[i].getC(), sc.nextInt());
		}
		
		System.out.println("\tname\tjava\tc\tpython\t�԰�\t���");
		for(int i=0; i<newstudents.length; i++) {
			System.out.print("["+(i+1)+"]\t");
			newstudents[i].disp();
			System.out.println();
		}
		
	}

}

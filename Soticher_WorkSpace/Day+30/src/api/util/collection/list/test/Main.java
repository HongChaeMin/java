package api.util.collection.list.test;

import java.util.*;

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
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Body("�ڳ�", 13, 30, 40, 50, 160, 55));
		list.add(new Body("������", 19, 77, 88, 99, 180, 70));
		
		list.get(0).disp();
		System.out.println();
		list.get(1).disp();
		
	}

}

package class_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л��� �̸�, ����, ��, ��ȭ��ȣ�� �Է����ּ���");
		StudentTest st1 = new StudentTest(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
		
		st1.disp();
		
        System.out.println("�л��� �̸�, ����, ��, ��ȭ��ȣ�� �Է����ּ���");
		StudentTest st2 = new StudentTest(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
		
		st2.disp();
		        
	}

}

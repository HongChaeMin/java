package oop_test02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Info in = new Info();
		
		System.out.println("�̸�, ����, �����, �����, ���м����� �Է��ϼ���");
		
		in.setData(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

		in.disp();
		
	}

}

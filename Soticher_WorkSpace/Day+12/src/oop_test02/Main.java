package oop_test02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Info in = new Info();
		
		System.out.println("이름, 나이, 국어성적, 영어성적, 수학성적을 입력하세요");
		
		in.setData(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

		in.disp();
		
	}

}

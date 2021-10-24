package string_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();
		System.out.println("Welcome! " + id);

		System.out.print("단어를 입력하세요 : ");
		String dan = sc.next();
		
		int num = 0 ;
		String[] ch = dan.split("");
		for(int i=0; i<ch.length; i++) {
			if(ch[i].equals("e")) {
				num ++;
			}
		}
		System.out.println("e의 개수는 " + num + "개 입니다");
	}

}

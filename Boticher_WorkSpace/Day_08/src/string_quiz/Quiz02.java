package string_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ID�� �Է��ϼ��� : ");
		String id = sc.next();
		System.out.println("Welcome! " + id);

		System.out.print("�ܾ �Է��ϼ��� : ");
		String dan = sc.next();
		
		int num = 0 ;
		String[] ch = dan.split("");
		for(int i=0; i<ch.length; i++) {
			if(ch[i].equals("e")) {
				num ++;
			}
		}
		System.out.println("e�� ������ " + num + "�� �Դϴ�");
	}

}

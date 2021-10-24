package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		boolean ing = true;
		
		while (ing) {
			System.out.println("원하시는 사용자를 선택해주세요");
			System.out.println("1.admin   2.client   3.exit");

			switch (sc.nextInt()) {
			case 1:
				Admin admin = new Admin();
				break;
			case 2:
				Client client = new Client();
				break;
			case 3:
				System.out.println("시스템을 종료합니다");
				ing = false;
				break;
			}

		}
	}

}

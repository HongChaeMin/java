package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
//
//		// if - else if = else문
//		if (num == 1) {
//			System.out.println("number는 1이다");
//		} else if (num == 2) {
//			System.out.println("number는 2이다");
//		} else {
//			System.out.println("number는 1이나 2가 아니다");
//		}

		// switch 문 : 조건 - '같다' | if 문 대신 사용할 수 있다
		// break문 : break가 써진 가장 가까운 스위치문을 빠져나온다
		switch(num) {
		case 1:
			System.out.println("number는 1이다");
			break;
		case 2:
			System.out.println("number는 2이다");
			break;
		default : // 얘는 처음 알았다 소름...
			System.out.println("number는 1이나 2가 아니다");
			break; // 얘는 생략해도 되고 안해도 됨
		}
		
		
		sc.close();
	}

}

package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();

		// num가 10 이상이고 40 이하이다 / 10 <= num <= 40 (그리고 AND)
		if (num >= 10 && num <= 40) {
			System.out.println("num가 10 이상이고 40 이하이다");
		}

		// 또는 OR		
		if (num < 10 || num > 40) {
			System.out.println("num이 10 이상이거나 40 이하이다");
		}

	}

}

package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("¸ö¹«°Ô¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		int weight = sc.nextInt();

		if (weight <= 70) {
			System.out.println("Ä¡ÀÌÀÌÀÌÅ°¤ÓÀÌÀÌÀÌÀÎ");
		} else {
			System.out.println("»ø·¯µå ¸Ô¾û");
		}

		// if - else if - else¹®

		if (weight <= 70) { // 70kg ÀÌÇÏ
			System.out.println("¶±ººÀÌ ¸ÔÀå");
		} else if (weight <= 75) { // 71 ~ 75
			System.out.println();
		} else if (weight <= 80) { // 76 ~ 80
			System.out.println();
		} else { // 80 ~
			System.out.println("µÅÁö »õ³¢");
		}

	}

}

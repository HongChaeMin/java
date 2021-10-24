package vaiable_ex;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {

		// 입력하기
		Scanner sc = new Scanner(System.in); // ctrl + shift + o <- 단축키

		System.out.print("육개장 가격을 입력하세요 : ");
		int price = sc.nextInt();
		System.out.println("육개장 가격 : " + price);

		System.out.print("구입할 육개장의 개수를 입력하세요 : ");
		int count = sc.nextInt();
		System.out.println("육개장 : " + count + "개, 가격 : " + (price * count));

		sc.close();

	}

}

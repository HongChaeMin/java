package array_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nums[] = { 3, 5, 2, 10, 39 };

		System.out.println("변경할 index와 값을 입력하세요");
		int index = sc.nextInt();
		int n = sc.nextInt();

		nums[index] = n;

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		String scores[] = { "X", "O", "O", "X", "X", "O", "O", "O", "O", "X" };

		int s = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i].toLowerCase().equals("o")) {
				s += 10;
			}
		}
		System.out.println(s + "점");

		int works[] = { 3, 5, 5, 3, 5, 3, 5 };

		int money = 0;
		for (int i = 1; i <= works.length; i++) {
			if (i <= 5) {
				money += (8500 * works[i-1]);
			} else {
				money += (9500 * works[i-1]);
			}
		}
		System.out.println("일주일간 총 임금은 " + money + "원");

		int evens[] = new int[5];
		for(int i=0; i<5;) {
			System.out.print("수를 입력하세요 : ");
			if(sc.nextInt() % 2 == 0) {
				i++;
			}
		}
		for(int i=0; i<evens.length; i++) {
			System.out.print(evens[i]+" ");
		}
		
	}

}

package array_quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numbers = { 3, 5, 2, 10, 39 };

		System.out.println("두 개의 index를 입력하세요");
		int in1 = sc.nextInt();
		int in2 = sc.nextInt();

		int in = numbers[in1];
		numbers[in1] = numbers[in2];
		numbers[in2] = in;

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		int[] numbers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Random rand = new Random();
		
		for(int i=0; i<100; i++) {
			int randNumber = rand.nextInt(10);
			int n = numbers2[randNumber];
			numbers2[randNumber] = numbers2[0];
			numbers2[0] = n;
		}
		
		for(int i=0; i<numbers2.length; i++) {
			System.out.print(numbers2[i]+" ");
		}
		System.out.println();
		
		int[] numbers3 = { 5, 3, 2, 1, 2, 4, 3, 3, 2, 1 };
		int[] su = new int[6];

		for (int i = 0; i < numbers3.length; i++) {
			su[numbers3[i]]++;
		}

		for (int i = 1; i < su.length; i++) {
			System.out.println((i) + " : " + su[i]+"개");
		}

	}

}

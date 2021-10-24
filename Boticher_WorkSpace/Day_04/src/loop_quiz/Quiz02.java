package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			System.out.print("수를 입력하세요 : ");
			int n = sc.nextInt();
			if(n == 0) {
				System.out.println("끝");
				break;
			}
		}
		
		int sum = 0;
		
		for(int i=3; i<=50; i++) {
			if(i%3!=0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
		
		
	}

}

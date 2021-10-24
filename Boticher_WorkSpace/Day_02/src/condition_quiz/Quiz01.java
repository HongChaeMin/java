package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------문제 1-----------");
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<10) System.out.println("10보다 작습니다");
		else System.out.println("10보다 큽니다");
		
		System.out.println("-----------문제 2-----------");
		
		System.out.print("두 개의 수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a<b) System.out.println("b가 더 큽니다");
		else System.out.println("a가 더 큽니다");
		
		System.out.println("-----------문제 3-----------");
		
		System.out.print("성적을 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score>70) System.out.println("합격입니다");
		else System.out.println("불합격입니다");
		
		System.out.println("-----------문제 4-----------");
		
		System.out.print("num : ");
		num = sc.nextInt();
		
		if(num%2==0) System.out.println("짝수");
		else System.out.println("홀수");
		
		
	}

}

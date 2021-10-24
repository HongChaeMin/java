package function_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
		int pow = sc.nextInt();
		System.out.println(pow + "의 제곱근은 " + pow(pow) + "이다");

		System.out.println("점수를 입력하세요");
		double avg = avg(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("평균은 " + avg + "이다");

		System.out.println("숫자와 나눌 수를 입력하세요");
		printQuotentRemainder(sc.nextInt(), sc.nextInt());
		
		System.out.println("숫자를 입력하세요 : ");
		System.out.println(jjack(sc.nextInt()));

	}

	public static int pow(int n) {
		return n * n;
	}

	public static double avg(int a, int b, int c, int d) {
		return (a + b + c + d) / 4.0;
	}

	public static void printQuotentRemainder(int n, int m) {
		System.out.println("목 : " + n / m);
		System.out.println("나머지 : " + n % m);
	}

	public static int jjack(int n) {
		if(n%2==0) {
			return 0;
		}else {
			return 1;
		}
	}
	
}

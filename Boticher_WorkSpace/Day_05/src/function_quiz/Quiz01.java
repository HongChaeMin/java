package function_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ���� ���ڸ� �Է��ϼ��� : ");
		int pow = sc.nextInt();
		System.out.println(pow + "�� �������� " + pow(pow) + "�̴�");

		System.out.println("������ �Է��ϼ���");
		double avg = avg(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("����� " + avg + "�̴�");

		System.out.println("���ڿ� ���� ���� �Է��ϼ���");
		printQuotentRemainder(sc.nextInt(), sc.nextInt());
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		System.out.println(jjack(sc.nextInt()));

	}

	public static int pow(int n) {
		return n * n;
	}

	public static double avg(int a, int b, int c, int d) {
		return (a + b + c + d) / 4.0;
	}

	public static void printQuotentRemainder(int n, int m) {
		System.out.println("�� : " + n / m);
		System.out.println("������ : " + n % m);
	}

	public static int jjack(int n) {
		if(n%2==0) {
			return 0;
		}else {
			return 1;
		}
	}
	
}

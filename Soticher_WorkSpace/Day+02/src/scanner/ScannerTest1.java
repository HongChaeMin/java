package scanner;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----문제 1-----");
		
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("합 : "+(num1+num2));
		
		System.out.println("-----문제 2-----");
		
		System.out.print("숫자 = ");
		int num3 = sc.nextInt();
		System.out.println(num3%2!=0);
		
		System.out.println("-----문제 3-----");
		
		System.out.print("성적 = ");
		int num4 = sc.nextInt();
		System.out.println(num4>=60&&num4<=100);
		
		System.out.println("-----문제 4-----");
		
		System.out.println("자바 시험 점수를 입력하세요");
		int java = sc.nextInt();
		System.out.println("파이썬 시험 점수를 입력하세요");
		int py = sc.nextInt();
		System.out.println("이름을 입력하세요");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("===================================");
		System.out.println(name+"님의 성적 합계 = "+(java+py)+", 평균 = "+(((double)java+py)/2));
		System.out.println("===================================");
		
		System.out.println("-----문제 5-----");
		
		System.out.println("숫자 2개 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(y+" "+x);
		
		System.out.println("-----문제 6-----");
		
		System.out.print("초 : ");
		
		int secend = sc.nextInt();
		int hour = secend/3600;
		int bun = (secend-(hour*3600))/60;
		int se = (secend-(hour*3600)+(bun*60))%60;
				
		System.out.println(hour+"시간 "+bun+"분 "+se+"초");
		
		System.out.println("-----문제 7-----");
		
		System.out.print("숫자 = ");
		int a = sc.nextInt();
		System.out.print(a%2==0);
		
	}

}

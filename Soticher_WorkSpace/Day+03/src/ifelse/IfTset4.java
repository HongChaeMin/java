package ifelse;

import java.util.Scanner;

public class IfTset4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----문제1-----");
		
		System.out.print("자장면 : ");
		int ja = sc.nextInt();
		System.out.print("짬뽕 : ");
		int jjam = sc.nextInt();
		
		int jaw = ja*5000;
		int jjamw = jjam*6000;
		
		System.out.println("결재 금액");
		if(ja+jjam>=5) {
			System.out.println(jaw+jjamw-3000+"원");
		}else if(ja+jjam>=10) {
			System.out.println((jaw+jjamw*0.9)+"원");
		}else {
			System.out.println(jaw+jjamw+"원");
		}
		
		System.out.println("-----문제2-----");
		
		System.out.println("숫자 3개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		
		if(a<b && b<c) {
			max = c;
		}else if(a<c && c<b) {
			max = b;
		}else if(b<a && a<c) {
			max = c;
		}else if(b<c && c<a) {
			max = a;
		}else if(c<a && a<b) {
			max = b;
		}else if(c<b && b<a){
			max = a;
		}
		
		System.out.println("가장 큰 수 : "+max);
		
		System.out.println("-----문제3-----");
		
		System.out.println("숫자 2개 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x+"X"+y+"는?");
		
		int z = sc.nextInt();
		
		if(z==x*z) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
		System.out.println("-----문제4-----");
		
		int n = 4359;
		int mymoney = 10000;
		
		System.out.print("계좌 번호 : ");
		
		int m = sc.nextInt();
		
		if(n==m) {
			System.out.println("이체할 금액 : ");
			int money = sc.nextInt();
			if(money <= mymoney) {
				System.out.print("이체 가능");
			}else {
				System.out.print("이체 불가");
			}
		}
	}
}

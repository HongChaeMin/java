package forwhile;

import java.util.Scanner;

public class ForTest01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//sysout + Ctrl + sp
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1 ;i<=100 ;i++) {
			if(i/100 == 0 && i/10 != 0) {
				System.out.println(i);
			}
		}
		
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		for(char c='A' ;c<='Z' ;c++) {
			System.out.print(c+" ");
		}
		
		for(int i=1; i<=1000; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		
		for(int i=1; i<=1000; i*=2) {
			System.out.println(i+" ");
		}
		
		for(int i=1;i<=1000;i++) {
			if(i%9==0 && i%10==6) {
				System.out.println("답 : "+i);
				break;
			}
		}
		
		for(int i=1;i<=1000;i++) {
			if(i%9==0 && i/10==6) {
				System.out.println("답 : "+i);
				break;
			}
		}
		
		for(int i=1;i<=1000; i++) {
			if(i%8==0 && 150<i) {
				System.out.println("답 : "+(i-8));
				break;
			}
		}
		
		System.out.print("분 입력 : ");
		int a = sc.nextInt();
		
		System.out.println(a+"분 "+"0초");
		
		for(int i=a; i>=1; i--) {
			for(int j=59; j>=0; j--) {
				System.out.println((i-1)+"분 "+j+"초");
				Thread.sleep(1000);
				//내가 원하는 시간만큼 코드를 멈추는 메소드
				//밀리언초 단위로 지정하여 시간을 설정한다.
				//1000ms == 1s
			}
		}
		System.out.println("시간 땡 !");

	}

}

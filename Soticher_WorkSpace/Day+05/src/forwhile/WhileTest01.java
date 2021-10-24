package forwhile;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int score = 0;
		
		System.out.println("-----문제 1-----");
		
		while(i<6) {
			int su1 = (int)(Math.random()*8)+2;
			int su2 = (int)(Math.random()*9)+1;
			
			int yes = su1 * su2;
			
			System.out.println(su1+ " X " +su2 +" = ?");
			
			int u = sc.nextInt();
			
			if(u == yes) {
				score += 20;
			}
			i++;
		}
		System.out.println("게임 종료...");
		System.out.println("성적 : "+ score);
		
		i = 1;
		int count = 0;
		score = 0;
		
		System.out.println("-----문제 2-----");
		
		while(count<4) {
			int su1 = (int)(Math.random()*19)+2;
			int su2 = (int)(Math.random()*9)+1;
			int suhap = su1*su2;
			
			System.out.println(su1+" X "+su2+" = ?");
			
			int yes = sc.nextInt();
			
			if(count == 2) {
				System.out.println("땡 땡 땡 ~~~ 게임오버!");
				System.out.println("총 점수 : "+score);
				break;
			}
			
			if(yes == suhap) {
				score += 10;
				if(su1 >= 11) {
					score += 15;
				}
			}else{
				count++;
			}
			
		}
		
		System.out.println("-----문제 3-----");
		
		int com = (int)(Math.random()*100)+1;
		
		while(true) {
			
			int me = sc.nextInt();
			
			if(com<me) {
				System.out.println("작다");
			}else if(me<com) {
				System.out.println("크다");
			}else if(me==com) {
				System.out.println("정다아압~~!!");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		System.out.println("-----문제 4-----");
		
		int num = sc.nextInt();
		i = 2;
		count = 0;
		
		while(i <= num) {
			if(num % i == 0) {
				count++;
			}
			i++;
		}
		
		if(count>1) {
			System.out.println("소수가 아닙니다.");
		}else {
			System.out.println("소수가 맞습니다.");
		}
		
		System.out.println("-----문제 5-----");
		
		int num1 = (int)(Math.random()*50)+1;
		
		i = 1;
		
		while(i<=num1) {
			
			int ten = i/10;
			int one = i%10;
			
			if(ten == 3 || ten == 6 || ten == 9) {
 				System.out.print("짝 ");
 			}else if(one ==3 || one == 6 || one == 9) {
 				System.out.print("짝  ");
 			}else {
 				System.out.print(i+" ");
 			}
			i++;
		}
		System.out.print("\n");
		
		System.out.println("-----문제 6-----");
		
		int money = 0;
		int item = 0;
		int h = 0;
		
		while(true) {
			
			double p = (Math.random());
			
			if(p<=0.35) {
				item++;
				if(item == 10) {
					break;
				}
			}else if(0.35<=p && p<=0.65) {
				item--;
			}
			money++;
			h++;
		}
		
		System.out.println("강화 횟수 : "+h+"회");
		System.out.println("총 비용 : "+money*1000+"원");
		
		//# 보조제어문
		//continue : 반복문의 조건식으로 바로 이동. 아래식을 실행시키고 싶지 않을때 사용
		//continue는 else를 이용해 충분히 사용하지 않고도 식을 만들 수 있다
		//continue는 굳이 사용하지 않아도 된다.
		
		//break : 반복문 1개를 즉시 종료
		
	}
}

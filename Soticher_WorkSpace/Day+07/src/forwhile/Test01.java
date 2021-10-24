package forwhile;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[11];
		int h = 0;
		int sum = 0;
		
		
		for(int i=1; i<=10; i++) {
			score[i] = (int)(Math.random()*100)+1;
			if(score[i]>=60) {
				h++;
			}
			sum += score[i];
		}
		
		int p = sum/10;
		int max = 0;
		int num = 0;
		
		for(int i=1; i<=10; i++) {
			if(score[i]>max) {
				max = score[i];
				num = i;
			}
		}
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+p);
		System.out.println("합격자 수 : "+h);
		System.out.println("1등 : "+num+"번 "+max+"점");
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int log1 = -1;
		int log2 = -1;
		int on = -1;
		
		while(on<0) {
			System.out.print("사용할 메뉴 : ");
			int a = sc.nextInt();
			
			switch(a) {
			case 1:
				System.out.print("아이디 : ");
				
				System.out.print("비밀번호 :");
				if(log1 == -1 && log2 == -1) {
					
					int id = sc.nextInt();
					
					int pw = sc.nextInt();
					
					if(log1!=0 || log2!=0) {
						if(id == dbAcc1 && pw == dbPw1) {
							System.out.println("로그인 성공");
							log1 ++;
						}else if(id == dbAcc2 && pw == dbPw2){
							System.out.println("로그인 성공");
							log2 ++;
						}else {
							System.out.println("로그인 실패");
						}
					}else {
						System.out.println("이미 로그인 하였습니다");
					}
				}
				break;
			case 2:
				if(log1 == 0 && log2 != 0) {
					System.out.println("로그아웃 하셨습니다");
					log1--;
				}else if(log1 != 0 && log2 == 0) {
					System.out.println("로그아웃 하셨습니다");
					log2--;
				}else {
					System.out.println("로그인 후 이용하세요");
				}
				break;
			case 3:
					
					if(log1 == 0 && log2 !=0) {
						System.out.print("입금할 금액을 입력하여 주세요 : ");
						int money = sc.nextInt();
						
						System.out.println("입금 완료");
						dbMoney1 += money;
						
					}else if(log2 == 0 && log1 !=0) {
						System.out.print("입금할 금액을 입력하여 주세요 : ");
						int money = sc.nextInt();
						
						System.out.println("입금 완료");
						dbMoney2 += money;
		
					}else {
						System.out.println("로그인 후 이용하세요");
					}
					
					
					break;
			case 4:	
				if(log1 == 0 && log2 !=0) {
					System.out.println("출금할 금액을 입력하세요");
					int atm = sc.nextInt();
					
					if(atm <= dbMoney1) {
						System.out.println("출금 완료");
						dbMoney1 -= atm;
					}else if(atm >= dbMoney1){
						System.out.println("잔액이 부족합니다");
					}
				}else if(log1 == 0 && log2 !=0) {
					System.out.println("출금할 금액을 입력하세요");
					int atm = sc.nextInt();
					
					if(atm <= dbMoney1) {
						System.out.println("출금 완료");
						dbMoney1 -= atm;
					}else if(atm >= dbMoney1){
						System.out.println("잔액이 부족합니다");
					}
				}else {
					System.out.println("로그인 후 이용하세요");
				}
				break;
			case 5:
					
				if(log1 == 0 && log2 != 0) {
					System.out.println("이체할 금액을 입력하세요");
					int toss = sc.nextInt();
					
					if(toss <= dbMoney1) {
						System.out.println("이체 완료");
						dbMoney1 -= toss;
					}else if(toss >= dbMoney1){
						System.out.println("잔액이 부족합니다");
					}
				}else if(log1 != 0 && log2 ==0) {
					System.out.println("이체할 금액을 입력하세요");
					int toss = sc.nextInt();
					
					if(toss <= dbMoney1) {
						System.out.println("이체 완료");
						dbMoney1 -= toss;
					}else if(toss >= dbMoney1){
						System.out.println("잔액이 부족합니다");
					}
				}else {
					System.out.println("로그인 후 이용하세요");
				}
				break;
			case 6:
				if(log1 == 0 && log2 != 0) {
					System.out.println("잔액 : "+dbMoney1+"원");
				}
				if(log1 != 0 && log2 == 0) {
					System.out.println("잔액 : "+dbMoney2+"원");
				}
				break;
			case 7:
				System.out.println("시스템을 종료합니다");
				on ++;
				break;
			}
		}
		
		int z = sc.nextInt();
		int x = 0;
		int y = 0;
		int o = 0;
		int x1 = 0;
		
		int sum1 = 1;
		
		if(z>=10) {
			x = z/10;
			y = z%10;
		}else {
			x = 0;
			y = z%10;
		}
		
		while (true) {
			if(z != (x*10+y)) {
				x1 = y;
				o = x+y;
				
				x = x1;
				y = o%10;

				sum1 ++;
			}else {
				break;
			}
		}
		
		System.out.println("사이클의 길이 : "+sum1);
		
	}

}

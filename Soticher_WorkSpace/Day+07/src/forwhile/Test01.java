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
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+p);
		System.out.println("�հ��� �� : "+h);
		System.out.println("1�� : "+num+"�� "+max+"��");
		
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
			System.out.print("����� �޴� : ");
			int a = sc.nextInt();
			
			switch(a) {
			case 1:
				System.out.print("���̵� : ");
				
				System.out.print("��й�ȣ :");
				if(log1 == -1 && log2 == -1) {
					
					int id = sc.nextInt();
					
					int pw = sc.nextInt();
					
					if(log1!=0 || log2!=0) {
						if(id == dbAcc1 && pw == dbPw1) {
							System.out.println("�α��� ����");
							log1 ++;
						}else if(id == dbAcc2 && pw == dbPw2){
							System.out.println("�α��� ����");
							log2 ++;
						}else {
							System.out.println("�α��� ����");
						}
					}else {
						System.out.println("�̹� �α��� �Ͽ����ϴ�");
					}
				}
				break;
			case 2:
				if(log1 == 0 && log2 != 0) {
					System.out.println("�α׾ƿ� �ϼ̽��ϴ�");
					log1--;
				}else if(log1 != 0 && log2 == 0) {
					System.out.println("�α׾ƿ� �ϼ̽��ϴ�");
					log2--;
				}else {
					System.out.println("�α��� �� �̿��ϼ���");
				}
				break;
			case 3:
					
					if(log1 == 0 && log2 !=0) {
						System.out.print("�Ա��� �ݾ��� �Է��Ͽ� �ּ��� : ");
						int money = sc.nextInt();
						
						System.out.println("�Ա� �Ϸ�");
						dbMoney1 += money;
						
					}else if(log2 == 0 && log1 !=0) {
						System.out.print("�Ա��� �ݾ��� �Է��Ͽ� �ּ��� : ");
						int money = sc.nextInt();
						
						System.out.println("�Ա� �Ϸ�");
						dbMoney2 += money;
		
					}else {
						System.out.println("�α��� �� �̿��ϼ���");
					}
					
					
					break;
			case 4:	
				if(log1 == 0 && log2 !=0) {
					System.out.println("����� �ݾ��� �Է��ϼ���");
					int atm = sc.nextInt();
					
					if(atm <= dbMoney1) {
						System.out.println("��� �Ϸ�");
						dbMoney1 -= atm;
					}else if(atm >= dbMoney1){
						System.out.println("�ܾ��� �����մϴ�");
					}
				}else if(log1 == 0 && log2 !=0) {
					System.out.println("����� �ݾ��� �Է��ϼ���");
					int atm = sc.nextInt();
					
					if(atm <= dbMoney1) {
						System.out.println("��� �Ϸ�");
						dbMoney1 -= atm;
					}else if(atm >= dbMoney1){
						System.out.println("�ܾ��� �����մϴ�");
					}
				}else {
					System.out.println("�α��� �� �̿��ϼ���");
				}
				break;
			case 5:
					
				if(log1 == 0 && log2 != 0) {
					System.out.println("��ü�� �ݾ��� �Է��ϼ���");
					int toss = sc.nextInt();
					
					if(toss <= dbMoney1) {
						System.out.println("��ü �Ϸ�");
						dbMoney1 -= toss;
					}else if(toss >= dbMoney1){
						System.out.println("�ܾ��� �����մϴ�");
					}
				}else if(log1 != 0 && log2 ==0) {
					System.out.println("��ü�� �ݾ��� �Է��ϼ���");
					int toss = sc.nextInt();
					
					if(toss <= dbMoney1) {
						System.out.println("��ü �Ϸ�");
						dbMoney1 -= toss;
					}else if(toss >= dbMoney1){
						System.out.println("�ܾ��� �����մϴ�");
					}
				}else {
					System.out.println("�α��� �� �̿��ϼ���");
				}
				break;
			case 6:
				if(log1 == 0 && log2 != 0) {
					System.out.println("�ܾ� : "+dbMoney1+"��");
				}
				if(log1 != 0 && log2 == 0) {
					System.out.println("�ܾ� : "+dbMoney2+"��");
				}
				break;
			case 7:
				System.out.println("�ý����� �����մϴ�");
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
		
		System.out.println("����Ŭ�� ���� : "+sum1);
		
	}

}

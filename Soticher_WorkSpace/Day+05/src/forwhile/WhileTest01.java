package forwhile;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int score = 0;
		
		System.out.println("-----���� 1-----");
		
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
		System.out.println("���� ����...");
		System.out.println("���� : "+ score);
		
		i = 1;
		int count = 0;
		score = 0;
		
		System.out.println("-----���� 2-----");
		
		while(count<4) {
			int su1 = (int)(Math.random()*19)+2;
			int su2 = (int)(Math.random()*9)+1;
			int suhap = su1*su2;
			
			System.out.println(su1+" X "+su2+" = ?");
			
			int yes = sc.nextInt();
			
			if(count == 2) {
				System.out.println("�� �� �� ~~~ ���ӿ���!");
				System.out.println("�� ���� : "+score);
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
		
		System.out.println("-----���� 3-----");
		
		int com = (int)(Math.random()*100)+1;
		
		while(true) {
			
			int me = sc.nextInt();
			
			if(com<me) {
				System.out.println("�۴�");
			}else if(me<com) {
				System.out.println("ũ��");
			}else if(me==com) {
				System.out.println("���پƾ�~~!!");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
		System.out.println("-----���� 4-----");
		
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
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}else {
			System.out.println("�Ҽ��� �½��ϴ�.");
		}
		
		System.out.println("-----���� 5-----");
		
		int num1 = (int)(Math.random()*50)+1;
		
		i = 1;
		
		while(i<=num1) {
			
			int ten = i/10;
			int one = i%10;
			
			if(ten == 3 || ten == 6 || ten == 9) {
 				System.out.print("¦ ");
 			}else if(one ==3 || one == 6 || one == 9) {
 				System.out.print("¦  ");
 			}else {
 				System.out.print(i+" ");
 			}
			i++;
		}
		System.out.print("\n");
		
		System.out.println("-----���� 6-----");
		
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
		
		System.out.println("��ȭ Ƚ�� : "+h+"ȸ");
		System.out.println("�� ��� : "+money*1000+"��");
		
		//# �������
		//continue : �ݺ����� ���ǽ����� �ٷ� �̵�. �Ʒ����� �����Ű�� ���� ������ ���
		//continue�� else�� �̿��� ����� ������� �ʰ� ���� ���� �� �ִ�
		//continue�� ���� ������� �ʾƵ� �ȴ�.
		
		//break : �ݺ��� 1���� ��� ����
		
	}
}

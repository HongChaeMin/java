package ifelse;

import java.util.Scanner;

public class IfTset4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----����1-----");
		
		System.out.print("����� : ");
		int ja = sc.nextInt();
		System.out.print("«�� : ");
		int jjam = sc.nextInt();
		
		int jaw = ja*5000;
		int jjamw = jjam*6000;
		
		System.out.println("���� �ݾ�");
		if(ja+jjam>=5) {
			System.out.println(jaw+jjamw-3000+"��");
		}else if(ja+jjam>=10) {
			System.out.println((jaw+jjamw*0.9)+"��");
		}else {
			System.out.println(jaw+jjamw+"��");
		}
		
		System.out.println("-----����2-----");
		
		System.out.println("���� 3�� �Է� : ");
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
		
		System.out.println("���� ū �� : "+max);
		
		System.out.println("-----����3-----");
		
		System.out.println("���� 2�� �Է� : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x+"X"+y+"��?");
		
		int z = sc.nextInt();
		
		if(z==x*z) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		System.out.println("-----����4-----");
		
		int n = 4359;
		int mymoney = 10000;
		
		System.out.print("���� ��ȣ : ");
		
		int m = sc.nextInt();
		
		if(n==m) {
			System.out.println("��ü�� �ݾ� : ");
			int money = sc.nextInt();
			if(money <= mymoney) {
				System.out.print("��ü ����");
			}else {
				System.out.print("��ü �Ұ�");
			}
		}
	}
}

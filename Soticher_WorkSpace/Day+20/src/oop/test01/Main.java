package oop.test01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("���� ���̿� ���� ���̸� �Է��ϼ���");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("�˰� ���� ������ ��ȣ�� �Է��ϼ���");
		System.out.println("1. �ﰢ��	  2. �簢��     3. ������     4. ��");
		c = sc.nextInt();
		if(c == 1) {
			Triangle tr = new Triangle(a, b);
			tr.disp();
		}
		else if(c == 2) {
			Square sq = new Square(a, b);
			sq.disp();
		}
		else if(c == 3) {
			Pentagon pe = new Pentagon(a, b);
			pe.disp();
		}
		else if(c == 4) {
			Circle ci = new Circle(a, b);
			ci.disp();
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			return;
		}
		
	}

}


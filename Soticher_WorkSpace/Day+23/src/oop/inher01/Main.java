package oop.inher01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��ϰ� ���� ���� ��ȣ�� �Է��ϼ���\n1. �����潽     2. ����      3. ������");
		
		switch(sc.nextInt()) {
			
		case 1 : 
			System.out.println("�����潽�� ����� ���� ������ �Է����ּ���");
			SharpPencil sp = new SharpPencil(sc.nextFloat(), sc.nextInt());
			sp.disp();
			break;
			
		case 2 :
			System.out.println("������ ���� ������ ������ ���� �Է����ּ���");
			BallPen bp = new BallPen(sc.nextInt(), sc.next());
			bp.disp();
			break;
			
		case 3 : 
			System.out.println("�������� ���� �������� ���� ������ �Է����ּ���");
			FountainPen fp = new FountainPen(sc.next(), sc.nextInt());
			fp.disp();
			break;
		
		}

	}

}

package oop.inher01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("�Է��� �ڵ��� ������ ������ �Է����ּ��� : ");
		a = sc.nextInt();
		Moblie mo1[] = new Moblie[a];
		MoblieEx monew[] = new MoblieEx[mo1.length];
		
		for(int i=0; i < mo1.length; i++) {
			System.out.println("�ڵ����� �̸�, ��Ż�, ����(���� : ����)�� �Է����ּ���");
			mo1[i] = new Moblie(sc.next(), sc.next(), sc.nextInt());
		}
		
		System.out.println("\tname\ttelecom\tprice");
		for(int i=0; i<mo1.length; i++) {
			System.out.print("["+(i+1)+"]\t");
			mo1[i].disp();
			System.out.println();
		}
		
		System.out.println("�߰��� �׸��� �ֽ��ϴ� ��⿡ �´� ������ �Է����ּ���");
		for(int i=0; i<monew.length; i++) {
			System.out.println(mo1[i].getName()+"�� ��� ���� ī��� ���� �����Ⱓ");
			monew[i] = new MoblieEx(mo1[i].getName(), mo1[i].getTelecom(), mo1[i].getPrice(), sc.next(), sc.nextInt());
		}
		
		System.out.println("\tname\ttelecom\tprice\tcard\tmonth");
		for(int i=0; i<monew.length; i++) {
			System.out.print("["+(i+1)+"]\t");
			monew[i].disp();
		}
		
		
	}

}

package oop_test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int max = 0;
		
		Mobile mo[] = new Mobile[3];
		
		for(int i=0; i<mo.length; i++) {
			System.out.println("����, ��Ż�, ������ �Է����ּ���");
			mo[i] = new Mobile(sc.next(), sc.next(), sc.nextInt());
		}
		
		for(int i=0; i<mo.length; i++) {
			System.out.print("["+(++n)+"]\t");
			mo[i].disp();
		}
		
		for(int i=0; i<mo.length; i++) {
			if(mo[i].getPrice()>max) {
				max = mo[i].getPrice();
			}
		}
		
		for(int i=0; i<mo.length; i++) {
			if(mo[i].getPrice() == max) {
				System.out.println("���� ������ ���� ������ ����");
				mo[i].disp();
			}
		}
		//mo[0].compare(mo[2]);
		//for(int i=0; i<mo.length; i++) {
		//	mo[i].compare(mo[i]);
		//}
		
	}

}

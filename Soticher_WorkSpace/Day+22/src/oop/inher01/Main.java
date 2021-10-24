package oop.inher01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("입력할 핸드폰 종류의 개수를 입력해주세요 : ");
		a = sc.nextInt();
		Moblie mo1[] = new Moblie[a];
		MoblieEx monew[] = new MoblieEx[mo1.length];
		
		for(int i=0; i < mo1.length; i++) {
			System.out.println("핸드폰의 이름, 통신사, 가격(단위 : 만원)을 입력해주세요");
			mo1[i] = new Moblie(sc.next(), sc.next(), sc.nextInt());
		}
		
		System.out.println("\tname\ttelecom\tprice");
		for(int i=0; i<mo1.length; i++) {
			System.out.print("["+(i+1)+"]\t");
			mo1[i].disp();
			System.out.println();
		}
		
		System.out.println("추가된 항목이 있습니다 기기에 맞는 정보를 입력해주세요");
		for(int i=0; i<monew.length; i++) {
			System.out.println(mo1[i].getName()+"의 요금 결제 카드와 남은 약정기간");
			monew[i] = new MoblieEx(mo1[i].getName(), mo1[i].getTelecom(), mo1[i].getPrice(), sc.next(), sc.nextInt());
		}
		
		System.out.println("\tname\ttelecom\tprice\tcard\tmonth");
		for(int i=0; i<monew.length; i++) {
			System.out.print("["+(i+1)+"]\t");
			monew[i].disp();
		}
		
		
	}

}

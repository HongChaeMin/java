package oop.inher01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력하고 싶은 펜의 번호를 입력하세요\n1. 샤프펜슬     2. 볼펜      3. 만년필");
		
		switch(sc.nextInt()) {
			
		case 1 : 
			System.out.println("샤프펜슬의 굵기와 남은 수량을 입력해주세요");
			SharpPencil sp = new SharpPencil(sc.nextFloat(), sc.nextInt());
			sp.disp();
			break;
			
		case 2 :
			System.out.println("볼펜의 남은 수량과 볼펜의 색을 입력해주세요");
			BallPen bp = new BallPen(sc.nextInt(), sc.next());
			bp.disp();
			break;
			
		case 3 : 
			System.out.println("만년필의 색과 만년필의 남은 수량을 입력해주세요");
			FountainPen fp = new FountainPen(sc.next(), sc.nextInt());
			fp.disp();
			break;
		
		}

	}

}

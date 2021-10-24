package oop.test01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("가로 길이와 세로 길이를 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("알고 싶은 도형의 번호를 입력하세요");
		System.out.println("1. 삼각형	  2. 사각형     3. 오각형     4. 원");
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
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		
	}

}


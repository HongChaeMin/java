package oop.staticfinal;

import java.awt.Color;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//static final - 상수화 변수
		//	- 변수 선언시 사용
		//	- 공간의 이름이 있기 때문에 다시 불러올 수 있지만 데이터를 변경할 수 없는 공간
		//	- 프로그램상에서 의미를 가지고 있고 그 의미가 변경되지 않는 데이터를 보다 쉽게 
		//	   구분하여 사용하기 위해서
		
		System.out.println(Integer.MAX_VALUE); // int -> Integer
		System.out.println(Math.PI);
		System.out.println(Color.BLACK);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키 입력 : ");
		char key = sc.next().charAt(0);
		//Character.toLowerCase(key)
		switch(Character.toLowerCase(key)) {
		
		case Key.SKILL1:
			System.out.println("SKIILL 1");
			break;
		
		case Key.SKILL2:
			System.out.println("SKILL 2");
			break;
			
		case Key.SKILL3:
			System.out.println("SKILL 3");
			break;
			
		case Key.SKILL4:
			System.out.println("SKILL 4");
			break;
			
		default:
			System.out.println("잘못된 키 입력!");
			
		}
		//https://docs.oracle.com/javase/8/docs/api/overview-summary.html

	}

}

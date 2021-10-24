package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------문제 1-----------");
		
		System.out.print("반복 할 횟수를 입력하세요 : ");
		int n = sc.nextInt();
		
		while(n>0) {
			System.out.println("파이팅 !! ^^");
			n--;
		}
		
		System.out.println("-----------문제 2-----------");
		
		System.out.print("카운트 다운 수를 입력하세요  ");
		n = sc.nextInt();
		
		while(n>=0) {
			System.out.println(n--);
			if(n < 0) {
				System.out.println("발사~~!~!~!");
			}
		}
		
		System.out.println("-----------문제 3-----------");
		
		n = 5;
		
		while(n>0) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			System.out.println("출력 : "+ num);
			n--;
		}
		
	}

}

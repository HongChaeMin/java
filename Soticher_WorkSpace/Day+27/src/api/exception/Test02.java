package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner robot = new Scanner(System.in);
		
		while (true) {
			int gift = 0, q = 0;
			try {
				System.out.print("상품 개수 : ");
				gift = robot.nextInt();
				
				System.out.print("질문 개수 : ");
				q = robot.nextInt();
				
				System.out.println("질문 1개당 상품을 "+gift/q+"걔 줄 수 있습니다");
				System.out.println("남은 상품 개수는 "+gift%q+"개 입니다");
			}catch(InputMismatchException e) {
				robot.nextLine();
				System.out.println("정수를 입력하셔야 합니다");
			}catch(ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없습니다");
			}finally {//계속 실행되는 코드
				System.out.println("JAVA try catch");
			}
			
		}
		
		
		
		//System.out.print("상품 개수 : ");
		//int gift = robot.nextInt();
		
		//System.out.print("질문 개수 :");
		//int q = robot.nextInt();
		
		//System.out.println("질문 1개당 상품을 "+gift/q+"개 줄 수 있습니다");
		//System.out.println("남은 상품 개수는 "+gift%q+"개 입니다");

	}

}

package api.exception;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//프로그램의 예상 실행 시나리오
		//[1] 정상실행 : 숫자 2개를 정확히 입력한 경우
		//[2] 이상실헹 : 숫자가 아닌것을 입력하니 
		//java.util.InputMismatchException
		//[3] 이상실행 : 질문 개수가 0이면
		//java.lang.ArithmeticException
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 개수 : ");
		int gift = sc.nextInt();
		
		System.out.print("질문 개수 : ");
		int q = sc.nextInt();
				
		System.out.println("질문 1개당 상품을 "+gift/q+"개 줄 수 있습니다");
		System.out.println();
		
	}

}

package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner robot = new Scanner(System.in);

		//ctrl+Shift+f
		
		int gift = 0, q = 0;
		try {
			System.out.print("상품 개수 : ");
			gift = robot.nextInt();

			System.out.print("질문 개수 : ");
			q = robot.nextInt();

			System.out.println("질문 1개당 상품을 " + gift / q + "걔 줄 수 있습니다");
			System.out.println("남은 상품 개수는 " + gift % q + "개 입니다");
		} catch (Exception e) {
			System.out.println("오류 발생 !");
			System.out.println("오류 : " + e.getMessage());
			//개발용 콘솔 로그(stacktrace)
			e.printStackTrace();
		}

	}

}

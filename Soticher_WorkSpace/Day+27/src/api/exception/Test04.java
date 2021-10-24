package api.exception;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 추가 문제 상황 : 상품과 질문이 음수면 문제가 생긴다
		// -> 저희가 추가로 알려줘야합니다 *( 강제 예외 ) throw

		Scanner robot = new Scanner(System.in);

		// ctrl+Shift+f

		int gift = 0, q = 0;
		try {
			System.out.print("상품 개수 : ");
			gift = robot.nextInt();
			if (gift < 0) {
				throw new Exception("상품은 음수일 수 없습니다");
			}

			System.out.print("질문 개수 : ");
			q = robot.nextInt();
			if (q < 0) {
				throw new Exception("질문은 음수일 수 없습니다");
			}

			System.out.println("질문 1개당 상품을 " + gift / q + "걔 줄 수 있습니다");
			System.out.println("남은 상품 개수는 " + gift % q + "개 입니다");
		} catch (Exception e) {
			System.out.println("오류 발생 !");
			System.out.println("오류 : " + e.getMessage());
			// 개발용 콘솔 로그(stacktrace)
			//e.printStackTrace();
		}

	}

}

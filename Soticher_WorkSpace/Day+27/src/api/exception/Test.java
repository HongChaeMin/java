package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Exception - 예외
		// - 프로그램 실행 중에 외부적인 요인으로 인해 발생하는 에러
		// - 예외는 우리가 처리가 가능하다
		// - 자주 발생되는 예외들을 클래스화 시켜놓았다

		// 예외 처리
		// - 예외가 발생했을때 프로그램이 정상적으로 작동될 수 있도록 처리하는 것
		// - 방식이 2가지가 존재한다..
		// - 1. throws - JVM에게 처리를 맡기는 방식
		// - 메소드 뒤에 발생할 예외들을 throws라고 적고 뒤에 적어주면 된다

		// - 2. try ~catch - 내가 직접 예외를 처리하는 방식
		// - try : 감시 구역 설정 블록 : 필수
		// - catch : 예외 처리 블록 : 필수
		// - finally : 필수 코드를 적는 블록 : 선택

		// - 형식
		// try{
		// 코드정의
		// }catch(처리할 예외 클래스의 참조형 변수 선언){//- 매개변수처럼 정의하면 된다
		// 처리 코드 정의
		// }finally{
		// 필수 코드 정의
		// }

		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = 0, b = 1;

			try {// 에러 안날때
				System.out.print("정수 입력 :");
				a = sc.nextInt();

				System.out.print("정수 입력 :");
				b = sc.nextInt();
			} catch (InputMismatchException e) {// 에러 날때
				sc.nextLine();// 버퍼 비우기
				System.out.println("정수를 입력하셔야합니다.");
			}

			try {
				System.out.println(a + "+" + b + "=" + (a + b));
				System.out.println(a + "-" + b + "=" + (a - b));
				System.out.println(a + "*" + b + "=" + (a * b));
				System.out.println(a + "/" + b + "=" + (a / b));
				System.out.println(a + "%" + b + "=" + (a % b));
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없습니다");
			}

		}

	}
}

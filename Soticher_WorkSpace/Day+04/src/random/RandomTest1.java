package random;

import java.util.Scanner;

public class RandomTest1 {

	public static void main(String[] args) {
		//		주사위를 2개 던지는 코드를 구현하시고
		//		두개의 주사위 합계에 따라 아래와 같이 코드를 구현
		//
		//		(1) 합계가 짝수일 경우		짝! 출력
		//		(2) 합계가 홀수일 경우		홀! 출력
		//		(3) 두 주사위가 같은 값일 경우 		더블! 출력
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		
		int tot = a+b;
		
		if(tot % 2 ==0) {
			if(a==b) {
				System.out.println("더블");
			}else {
				System.out.println("짝!");
			}
		}else {
			System.out.println("홀!");
		}
		
		
		
//		화면에 무작위로 구구단 1문제를 출제(2단 ~ 15단)
			//	2 X 1 = 	부터 		15 X 9 = 		까지
			//	사용자가 정답을 입력할 수 있도록 프로그래밍 코드를 구현(Scanner)
			//	정답일 경우 아래와 같이 처리
			//
			//	[1] 맞춘 경우	정답! 10점 획득!
			//	[2] 틀린 경우	오답! 5점 감점!
			//
			//	추가적으로, 어려운 문제(11단 이상)을 맞추면 10점을 추가로 획득하도록 코드 구현
		
		Scanner sc = new Scanner(System.in);
		
		int su1 = (int)(Math.random()*14)+2;
		int su2 = (int)(Math.random()*9)+1;
		
		int com = su1 * su2;
		
		System.out.print(su1+"x"+su2+"=");
		int user = sc.nextInt();
		
		if(com == user) {
			System.out.println("정답 ! 10점 획득 !");
			if(su1>=11) {
				System.out.println("어려운 문제!10점 추가 획득");
			}
		}else {
			System.out.println("오답!5점 감점");
		}
		
		/*
		 * # 369게임[1단계]
		 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
		 * 2. 위 수에 369의 개수가
		 * 	1) 2개이면, 짝짝을 출력
		 *  2) 1개이면, 짝을 출력
		 *  3) 0개이면, 해당 숫자를 출력
		 * 예)
		 * 		33	 : 짝짝
		 * 		16	 : 짝
		 * 		 7	 : 7
		 */
		int ra = (int)(Math.random()*50)+1;
		
		int 십의자리 = ra/10;
		int 일의자리 = ra%10;
		int cnt = 0;
		if(일의자리 == 3 || 일의자리 == 6 || 일의자리 == 9) {
			cnt++;//cnt = cnt +1;
		}
		if(십의자리 == 3 || 십의자리 == 6 || 십의자리 == 9) {
			cnt++;
		}
		
		if(cnt == 2) {
			System.out.println("짝짝");
		}
		else if(cnt == 1) {
			System.out.println("짝");
		}
		else {
			System.out.println(ra);
		}
		
		/* # 연산자 기호 맞추기 게임
		 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
		 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
		 * 3. 위 숫자는 연산자 기호에 해당된다.
		 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
		 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
		 * 예) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) %
		 *    정답 : 1번
		 */
		int x = (int)(Math.random()*10)+1;
		int y = (int)(Math.random()*10)+1;
		int answer = (int)(Math.random()*4)+1;
		
		int z = 0;
		if(answer == 1) {
			z = x + y;
		}
		else if(answer == 2) {
			z = x - y;
		}
		else if(answer == 3) {
			z = x * y;
		}
		else if(answer == 4) {
			z = x % y;
		}
		
		System.out.println(x+" ? "+y+" = "+z);
		System.out.println("1)+ 2)- 3)* 4)%");
		System.out.print("번호를 입력하세요 :");
		int myAnswer = sc.nextInt();
		
		if(answer == myAnswer) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	}

}


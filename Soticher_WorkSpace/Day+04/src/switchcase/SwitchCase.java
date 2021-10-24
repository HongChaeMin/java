package switchcase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		//switch ~ case구문
		//빠르고 동일한 속도로 실행되는 조건문
		//선택지를 주고 고르는 형식
		
		/*
		 * 쓰는 방법
		 * switch(변수){
		 * case 상수:
		 * 		실행내용;
		 * 		break;
		 * case 상수:
		 * 		실행내용;
		 * 		break;
		 * default:
		 * 		break;
		 * }
		 */
		
		int ra = (int)(Math.random()*3)+1;
		//break; - 제어문 안에서 중괄호를 빠져나오는 역활.
		//switch~case,do~while,while,for 중에 실행 루프로 부터 벗어나려 할때
		//사용되는 흐름 제어문
		switch(ra) {
		case 1: // if(ra == 1)
			System.out.println(ra);
			break;
		case 2: // else if(ra == 2)
			System.out.println(ra);
			break;
		case 3: // else if(ra==3)
			System.out.println(ra);
			break;
		default: // else
			System.out.println("잘못된 수");
			break;
		}
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*10)+1;
		int y = (int)(Math.random()*10)+1;
		int answer = (int)(Math.random()*4)+1;
		int z = 0;
		switch(answer) {
		case 1:
			z = x+y;
			break;
		case 2:
			z = x - y;
			break;
		case 3:
			z = x * y;
			break;
		case 4:
			z = x % y;
			break;
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

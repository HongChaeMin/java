package ifelse;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----문제1-----");
		
		int me = sc.nextInt();
		int com = 8;
		
		if(me<com) {
			System.out.println("Up!");
		}else if(me==com) {
			System.out.println("Bingo!");
		}else {
			System.out.println("Down!");
		}
		
		System.out.println("-----문제2-----");
		
		int id = 1234;
		int pw = 1111;
		
		System.out.print("아이디를 입력하세요 : ");
		int uid = sc.nextInt();
		System.out.print("비밀번호를 입력하세요 : ");
		int upw = sc.nextInt();
		
		if(id==uid && pw==upw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		System.out.println("-----문제3-----");
		
		System.out.println("[회원가입]");
		System.out.print("아이디를 입력하세요 : ");
		int dbid = sc.nextInt();
		System.out.print("비밀번호를 입력하세요 : ");
		int dbpw = sc.nextInt();
		
		System.out.println("로그인을 하려면 아이디와 비밀번호를 입력하세요");
		System.out.print("아이디를 입력하세요 : ");
		int udbid = sc.nextInt();
		System.out.print("비밀번호를 입력하세요 : ");
		int udbpw = sc.nextInt();
		
		if(dbid==udbid && dbpw==udbpw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}

		System.out.println("-----문제4-----");
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(100>=score && score>=60) {
			System.out.println("합격");
		}else if(0<=score && score<60) {
			System.out.println("불합격");
		}else {
			System.out.println("점수를 잘못 입력하셨습니다");
		}
		
	}

}

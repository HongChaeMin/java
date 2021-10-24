package api.lang.string;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String dbId = "megait";
		String dbPw = "study";
		
		String id = sc.next();
		String pw = sc.next();
		
		if(id.equals(dbId) && pw.equals(dbPw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("아이디 또는 비밀번호를 잘못 입력하셨습니다");
		}
		
	}

}

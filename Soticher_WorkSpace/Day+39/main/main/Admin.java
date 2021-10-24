package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

import admin.AdminMain;

public class Admin {

	Scanner sc = new Scanner(System.in);

	Map<String, String> adminId = new HashMap<>();

	boolean check = true;

	public Admin() {

		check = true;
		while (check) {
			System.out.println("1. 로그인 하기\t2. 회원가입 하기\t3. 돌아가기");
			int n = sc.nextInt();
			if (n == 1) {
				boolean on = true;
				System.out.print("adminId : ");
				String id = sc.next();
				System.out.print("adminPw : ");
				String pw = sc.next();
				Set<String> set = adminId.keySet();
				for (String key : set) {
					String value = adminId.get(key);
					if (id.equals(key) && pw.equals(value)) {
						System.out.println("로그인 성공");
						on = false;
						try {
							AdminMain admin = new AdminMain();
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					}
				}
				if (on) {
					System.out.println("아이디 또는 비밀번호를 잘못 입력하셨습니다");
				}
			} else if (n == 2) {
				String idRegex = "^[a-zA-Z0-9]{1,12}$";
				System.out.print("ID / 영문, 숫자 포함 1 ~ 12자 이내로 입력해주세요 : ");
				String id = sc.next();
				if (adminId.containsKey(id)) {
					System.out.println("중복된 아이디 입니다");
					continue;
				} else if (Pattern.matches(idRegex, id)) {
					System.out.print("비밀번호를 입력해주세요 : ");
					String pw = sc.next();
					adminId.put(id, pw);
					System.out.println("아이디가 등록되었습니다");
				} else {
					System.out.println("아이디를 잘못 입력하셨습니다");
				}
			} else {
				System.out.println("시스템을 종료합니다");
				check = false;
			}
		}
	}

}

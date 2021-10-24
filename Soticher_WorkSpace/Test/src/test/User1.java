package test;

import java.io.*;
import java.util.*;
import java.util.concurrent.locks.Lock;
import test.*;
import test.User2;

public class User1 {

	Scanner sc = new Scanner(System.in);

	FileIo file = new FileIo();
	static List<String> list1 = new ArrayList<>();

	int m = 1;
	
	private boolean cheak = true;

	public User1() throws Exception {
				
		while (cheak) {
			if(User2.list2 != null) list1 = User2.list2;
			System.out.println("1. 보내기\t2. 종료");
			switch (sc.nextInt()) {
			case 1:
				sc.nextLine();
				
				System.out.print("보낼 문자 입력 : ");
				String text = sc.nextLine();
				list1.add("코난 : "+text);
				file.fileOutput(list1);
				break;
			case 2:
				System.out.println("시스템을 종료합니다");
				cheak = false;
				break;
			}
		}
	}

}

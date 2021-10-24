package test;

import java.io.*;
import java.util.*;

public class User2 {
		
	Scanner sc = new Scanner(System.in);

	FileIo file = new FileIo();
	static List<String> list2 = new ArrayList<>();

	int m = 2;
	
	private boolean cheak = true;

	public User2() throws Exception {
		
		while (cheak) {
			if(User1.list1 != null) list2 = User1.list1;
			System.out.println("1. 보내기\t2. 종료");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				sc.nextLine();
				System.out.print("보낼 문자 입력 : ");
				list2.add("남도일 : "+sc.nextLine());
				file.fileOutput(list2);
				break;
			case 2:
				cheak = false;
				break;
			}
		}
	}
		
}

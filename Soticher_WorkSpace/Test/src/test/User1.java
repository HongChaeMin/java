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
			System.out.println("1. ������\t2. ����");
			switch (sc.nextInt()) {
			case 1:
				sc.nextLine();
				
				System.out.print("���� ���� �Է� : ");
				String text = sc.nextLine();
				list1.add("�ڳ� : "+text);
				file.fileOutput(list1);
				break;
			case 2:
				System.out.println("�ý����� �����մϴ�");
				cheak = false;
				break;
			}
		}
	}

}

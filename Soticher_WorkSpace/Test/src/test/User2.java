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
			System.out.println("1. ������\t2. ����");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				sc.nextLine();
				System.out.print("���� ���� �Է� : ");
				list2.add("������ : "+sc.nextLine());
				file.fileOutput(list2);
				break;
			case 2:
				cheak = false;
				break;
			}
		}
	}
		
}

package api.lang.string;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] books = new String[]{
				"�̰��� �ڹٴ�",								//books[0]
				"Head first Java",							//books[1]
				"������Ʈ�� ���� �ڹ� ���α׷���",	//books[2]	books.length = 6
				"Java 8 in Action",							//books[3]
				"Do it! C��� �Թ�",							//books[4]
				"��ǰ C��� ���α׷���"					//books[5]
		};
		
		System.out.print("�˻�� �Է��� �ּ��� : ");
		String s = sc.next();
		
		for(int i=0; i<books.length; i++) {
			String c = s.toLowerCase();
			String b = books[i].toLowerCase();
			if(b.indexOf(c)!=-1) {
				System.out.println(books[i]);				
			}
		}

	}

}

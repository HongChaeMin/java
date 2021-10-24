package api.lang.string;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] books = new String[]{
				"이것이 자바다",								//books[0]
				"Head first Java",							//books[1]
				"프로젝트로 배우는 자바 프로그래밍",	//books[2]	books.length = 6
				"Java 8 in Action",							//books[3]
				"Do it! C언어 입문",							//books[4]
				"명품 C언어 프로그래밍"					//books[5]
		};
		
		System.out.print("검색어를 입력해 주세요 : ");
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

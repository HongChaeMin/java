package api.util.scanner;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//.next()는 띄어쓰기 기준으로 단어를 구별
		
		String text = "빨-주-노-초/파-남-보";
		Scanner s1 = new Scanner(text);
		while(s1.hasNext()) {//단어
			System.out.println(s1.next());
		}
		s1.close();

		// - 를 구별자(delimeter)로 지정
		Scanner s2 = new Scanner(text);
		//s2.useDelimiter("-");
		//s2.useDelimiter("/");
		s2.useDelimiter("[-/]");
		while(s2.hasNext()) {
			System.out.println(s2.next());
		}
		s2.close();
		
	}

}

package api.lang.string;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String word1 = null;
		String word2 = null;
		
		System.out.println("�����ձ� ����!!");

		while (true) {
			word1 = sc.next();
			if(word1.length() == 3) {
				word2 = sc.next();
				if(word2.length() == 3 && word2.charAt(0) == word1.charAt(2)) {
					word1 = word2;
				}else {
					System.out.println("�� �� �� ~~ Ʋ�Ⱦ�� ~~~");
					break;
				}
			}else {
				System.out.println("�� �� �� ~~ Ʋ�Ⱦ�� ~~~");
			}
		}
	}
}

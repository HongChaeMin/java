package api.util.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id = "mega_it12-";
		String pw = "java12";
		
		String idRegex = "^[a-zA-Z0-9][a-zA-Z0-9-_]{8,20}$";
		System.out.println(Pattern.matches(idRegex, id));

		String id1 = sc.next();
		System.out.println(Pattern.matches(idRegex, id1));
		
		String pwRegex = "^[a-zA-Z0-9]{8,20}&";
		System.out.println(Pattern.matches(pwRegex, pw));
	}

}

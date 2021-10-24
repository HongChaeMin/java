package api.util.regex;

import java.util.regex.Pattern;

public class Test01 {

	public static void main(String[] args) {

		String phone = "010-1212-3434";
		// phone이 올바른 전화번호 형식인지 검사
		String regex = "^010-?[1-9][0-9]{3}-?[0-9]{4}$";
		System.out.println(Pattern.matches(regex, phone));

		
		
	}

}

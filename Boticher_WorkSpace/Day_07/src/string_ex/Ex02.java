package string_ex;

public class Ex02 {

	public static void main(String[] args) {

		//자료형 변환
		
		// 1. 숫자 -> 문자열
		int num = 3; // "3"
		String str = num + ""; // 헐... 첨 알았다 숫자 + 문자 = 문자	StringBuilder, StringBuffer (문제나올수도 있대 꼰대 새끼들때메)
		
		String str2 = String.valueOf(num);
		System.out.println(str);
		System.out.println(str2);
		
		// 2. 문자열 -> 숫자
		String str3 = "5";
		int num2 = Integer.valueOf(str3);
		int num3 = Integer.parseInt(str3);
		
	}

}

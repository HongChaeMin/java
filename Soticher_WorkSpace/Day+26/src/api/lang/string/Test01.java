package api.lang.string;

public class Test01 {

	public static void main(String[] args) {
		//String 			자바 문자열 총괄 클래스
		//char가 여러개 모여서 생긴 형태가 String, 파일/네트워크 에서는 byte 여러 조각으로 분할 가능
		
		String a = "hello";
		String b = new String("Hello");
		char[] ch = new char[] {'h', 'e', 'l', 'l', 'o'};
		String c = new String(ch);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a == c);
		System.out.println(a.equals(c));
		
		System.out.println(a.equals(b));//대소문자 구별
		
		System.out.println(b.toLowerCase());
		System.out.println(b.toUpperCase());
		
		//대소문자 무시한 비교
		System.out.println(a.toLowerCase().equals(b.toLowerCase()));
		
		//검사
		String email = "master@megait.co.kr";
		
		System.out.println(email.startsWith("master"));//master로 시작하는지
		System.out.println(email.endsWith("co.kr"));//co.kr로 종료하는지
		System.out.println(email.indexOf("megait"));
		System.out.println(email.length());
		
		//특정 위치의 글자 추출 : 추출하면 char
		char t = email.charAt(6);
		System.out.println(t);
		
	}

}

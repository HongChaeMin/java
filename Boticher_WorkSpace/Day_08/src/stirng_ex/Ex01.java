package stirng_ex;

public class Ex01 {

	public static void main(String[] args) {

		String s1 = "eclipse";

		// charAt : n 번째 index에 무슨 문자가 있는지 확인
		char index4 = s1.charAt(4);
		System.out.println("charAt : " + index4);
		
		// contains : 특정 문자열이 문자열에 포함 되어있는지 확인
		System.out.println("contains : " + s1.contains("lip"));
		System.out.println("contains : " + s1.contains("a"));
		
		// startsWith : 특정 문자열로 시작하는지 확인
		System.out.println("startsWith : " + s1.startsWith("ecl"));
		System.out.println("startsWith : " + s1.startsWith("b"));
		
		// endsWith : 특정 문자열로 끝나는지 확인
		System.out.println("endsWith : " + s1.endsWith("se"));
		System.out.println("endsWith : " + s1.endsWith("aaa"));
		
		// length : 문자열의 길이 확인 (알파벳이 몇 개 인지)
		System.out.println("length : " + s1.length());
		
		// replace : 포함된 문자열 부분을 교체 (치환)
		String s2 = "I say hungry.";
		s2 = s2.replace("I", "You"); // 꼭 다시 저장해야 한다
		System.out.println("replace : " + s2);
		
		// split : 특정 스트링을 기준으로 잘라서 배열에 넣는다
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		System.out.println("split : " + fruits[0] + " " + fruits[1] + " " + fruits[2]);
		
		// substring : 문자열을 자른다
		String s4 = "javastudy";
		
		System.out.println("substring : " + s4.substring(4)); // study
		
		// begin index : 시작 인덱스
		// end index : 자르고 싶은 끝 인덱스 + 1
		System.out.println("substring : " + s4.substring(0, 4)); // java
		System.out.println("substring : " + s4.substring(4, 8)); // study
		
	}

}

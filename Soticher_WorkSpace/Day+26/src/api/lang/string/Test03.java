package api.lang.string;

public class Test03 {

	public static void main(String[] args) {
		
		String url = "http://www.naver.com";
		
		//문자열 편집 subString
		System.out.println(url.substring(7, 10));//지정한 위치 인덱스부터 끝 인덱스 전 까지
		System.out.println(url.substring(7));//지정한 위치 부터 끝까지
		//잘라서 반환
		
		//.replace
		System.out.println(url.replace('/','+'));
		System.out.println(url.replace("com", "org"));
		
		url = "                http://www.naver.com";
		
		//.trim - 공백 제거
		System.out.println(url+url.length());
		System.out.println(url.trim()+url.trim().length());
		
	}

}

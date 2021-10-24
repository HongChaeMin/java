package api.lang.etc;

public class Test02 {

	public static void main(String[] args) {
		//System 클래스		운영체제 관련한 정보를 가진 클래스
		//생성자가 없다
		
//		System.out.println("프로그램 종료");
//		System.exit(0);
		
		System.err.println("안녕"); //표준 오류 통로
		System.out.println("안녕"); //표준 출력 통로
		
		//시스템의 정보 불러오기
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.runtime.version"));
		System.out.println(System.getProperty("user.home"));

	}

}

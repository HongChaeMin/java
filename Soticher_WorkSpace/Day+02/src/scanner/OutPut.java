package scanner;

public class OutPut {

	public static void main(String[] args) {
		//System.out - 표준 출력 객체
		
		//.println() - 내용 출력 후 엔터
		//.print - 내용만 출력
		//.printf - X
		
		System.out.print(true);
		System.out.println(false);
		
		//제어문자
		// - 특수한 기능을 하는 문자들
		// - 주로 콘솔창을 제어하는 문자
		// - 실행하고자 하는 위치에 적는다
		// - \뒤에 기능에 맞는 문자를 적으면 된다
		
		System.out.println((int)'\t');
		
		//\n (NewLine, Line Feed)
		// - 커서를 다음줄로 이동시킴
		
		System.out.println("가\n나");
		
		//\t(tab)
		// - 커서를 탭 크기 만큼 이동시킴
		
		System.out.println("이름\t:홍채민");
		System.out.println("전화번호\t:01066674359");
		
		
		
	}

}

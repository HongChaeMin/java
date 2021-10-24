package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		// String 변수에 값 저장하기
		String a = "안녕하세요";
		String b = new String("안녕하세요");
		String c = new String("안녕하세요");
		String d = "안녕하세요"; // heap 영역에 constant pool에 저장되고 재활용된다 (new로 생성 안할 때 )

		System.out.println(a);
		System.out.println(b);

		// String 끼리 값 비교하기
		// == 으로 비교를 하는 것은 stack영역에 저장된 주소값을 비교한 것이다
		// String에서 값을 비교하려면 .equals() 사용해야한다
		System.out.println(a == d);
		System.out.println(b == c);
		System.out.println(a == b);
		System.out.println(a.equals(b));

	}

}

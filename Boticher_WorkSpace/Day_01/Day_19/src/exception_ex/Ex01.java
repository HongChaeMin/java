package exception_ex;

public class Ex01 {

	public static void main(String[] args) throws Exception {

		// 에외처리 : 예상치 못한 상황에 대한 처리를 하는 것
		// try - catch - finally

		// NPE
		try {
			String str = null;
//			System.out.println(str.isEmpty());

			int[] arr = { 1, 2, 3 };
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}

			// 캐스팅 예외
			Object x = new Integer(0);
			System.out.println((String) x);

		} catch (NullPointerException e) {
			System.err.println("NPF가 발생했다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 참조 오류가 발생했다");
		} catch (Exception e) {
			System.err.println("모든 예외를 다 잡는다");
		} finally {
			System.out.println("예외든 아니든 무조건 불려진다");
		}

		System.out.println("수행완료");

		a();
		
	}
	
	public static void a() throws Exception {
		b();
	}
	
	public static void b() throws Exception {
		// 예외 발생 시키기
		
		// checked exception : Exception	- try - catch 에외처리
		// unchecked exception : RuntimeException	- 바로 프로그램이 중지된다
		
		// 바로 프로그램이 종료됨 throw new RuntimeException();
		
		// 처리 방법 2가지
		// 1. 내가 처리한다 (try - catch)
		// 2. 회피한다 (throws)
		throw new Exception();
	}

}

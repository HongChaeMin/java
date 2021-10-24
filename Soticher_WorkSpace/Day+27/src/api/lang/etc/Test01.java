package api.lang.etc;

public class Test01 {
	public static void main(String[] args) {
		
		//Math		수학 계산 도우미
		// - 생성자가 없는 클래스(추 클래스 또는 싱글톤 클래스)
		
		//Math a = new Math();
		System.out.println(Math.random());//0.xxx를 추첨
		
		double a = 1.5;
		System.out.println(Math.floor(a));//버림
		System.out.println(Math.round(a));//반올림
		System.out.println(Math.ceil(a));//올림
		
		int b = 3;
		int c = 4;
		
		System.out.println(Math.pow(b, 2));//제곱
		System.out.println(Math.pow(c, 2));
		double d = Math.pow(b, 2) + Math.pow(c, 2);
		double e = Math.sqrt(d);
		System.out.println(e);
		
	}

}

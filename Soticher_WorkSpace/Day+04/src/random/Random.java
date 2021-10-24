package random;

public class Random {

	public static void main(String[] args) {
		
		//Math.random();
		// - 0부터 1미만의 임의의 실수를 구하는 명령
		// - 0.0000000 ~ 0.9999999
		
		//내가 원하는 범위의 임의의 수 구하기
		// -(int)(Math.random * 개수) + 시작수
		
		int su = (int)(Math.random() * 3)+9;
		System.out.println("su ="+su);
		
		double a = Math.random();//0.0000~0.9999
		double b = a *3;//0.0000 ~ 2.9999;
		int c = (int)b; // 0~ 2
		int d = c+9; // 9~ 11
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}

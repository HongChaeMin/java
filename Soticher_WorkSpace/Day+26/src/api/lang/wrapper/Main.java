package api.lang.wrapper;

public class Main {

	public static void main(String[] args) {
		//wrapper클래스
		// - 기본자료형을 클래스화 시킨 자료형
		// - 기본 자료형을 객체로 포장했다
		
		boolean bol = true;	
		Boolean a = new Boolean(true);//1은 안됨 해봤음
		Boolean b = new Boolean(false);
		
		Boolean c = new Boolean("TRUE1");//생성자를 통해 예외처리를 해줬기 때문에  false
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("=================================");
		
		//객체끼리의 비교에서는 equals를 사용한다
		System.out.println(b == c);
		System.out.println(b.equals(c));
		
		System.out.println("=================================");
		System.out.println(Boolean.logicalXor(c, b));
		System.out.println(Boolean.logicalAnd(c, b));
		//or - 하나라도 참일 경우  : 참
		//and - 둘 다 참이여야 참
		
		System.out.println("=================================");
		System.out.println(Boolean.valueOf("true"));//근데 1은 안됨 해봄 
		//valueOf - 입력받은 인자의 값을 지정된 앞의 객체형으로 반환하여 반환
		String.valueOf(5);// -> "5"
		//valueOf - String은 어떤것을 넣든 String형으로 다 반환
		
		System.out.println("=================================");
		//auto-boxing - 참조형변수에 일반 데이터를 넣으면 자동으로 객체화 시키는것
		Boolean d = true;
		System.out.println(d.toString());
		
		//auto-unboxing - 일반 변수에 참조형 데이터를 넣으면 자동으로 일반 데이터로 변환 시키는것
		boolean e = new Boolean("dfdf");
		
		System.out.println(e);
		//e.toString()이 안되는 이유는 참조형이 아니기 때문에
		
		
	}

}

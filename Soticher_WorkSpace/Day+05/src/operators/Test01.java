package operators;

public class Test01 {

	public static void main(String[] args) {

		//복합대입연산자
		//- 기존 공간에 연산을 진행하여 기존 공간에 다시 대입하는 연산자
		//- 복합대입연산자 - 누적. 대입연산자 - 덮어쓰기
		//종류 : += -= *= /= %=
		
		//증감연산자 , 감소연산자 : ++ , --
		//1씩 더해주거나 1씩 감소
		
		int a = 1;
		a = a+1;
		a += 1; 
		a +=2;
		
		a++;a--;
		
		System.out.println(a);

	}

}

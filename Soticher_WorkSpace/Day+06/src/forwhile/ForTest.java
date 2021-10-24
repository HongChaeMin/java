package forwhile;

public class ForTest {

	public static void main(String[] args) {
		
		//for
		//- 반복할 횟수가 정해져있을때
		//- 반복할 횟수가 일정할때
		//- 반복할 횟수를 알고있을때
		//- 괄호안에 반드시 ;이 두개 있어야한다.각 식들을 구분하기 위해서
		
		//형식
		//for(초기문;조건식;증감식){
		//		종속문장;
		//}
		
		//초기식
		//-초기식은 일반적으로 변수를 적는다
		//- 변수를 선언해도 되고 외부에서 사용되는 변수를 가져와서 사용해도 된다
		//- 시작을 알리는 식
		//ex) int i = 0; int i=1;
		
		//조건식
		//- 끝을 알리는 식
		//- 단순한 조건이 사용된다.
		//ex) i<10 i<=10
		
		//증감식
		//- 일정하기 증가 또는 감소하는 식
		//- 일반적으로 증감연산자를 사용한다
		//- 반드시 반복할 변수의 값을 변화 시켜야 한다
		// i+=1 i++ i=i+1 : O	i+1 : X
		int i = 0;
		for(;true;) {
			System.out.println(i);
			if(i==6) {
				break;
			}
			i++;
		}
		
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}

	}

}

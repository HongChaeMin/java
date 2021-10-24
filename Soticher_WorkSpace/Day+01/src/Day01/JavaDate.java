package Day01;

public class JavaDate {
	
	public static void main(String[] args) {
		
		//데이터 종류 (자바)
		
		//1.숫자 3,1.5,0,...
		//	정수 : byte, short, [int], long, char
		//	실수 : float, [double]
		
		int num = 10;
		System.out.println(num);
		
		double  num1 = 3.14;
		System.out.println(num1);
		
		char ch = 'A';
		System.out.println(ch);
		
		//2.숫자 X
		//	논리 : true/false
		//		  boolean
		//	문자열 : ""로 감싸진 글자
		//			String
		
		boolean boo = true;
		System.out.println(boo);
		boo = false;
		System.out.println(boo);
		
		String st = "안녕하세용ㅎㅎㅎ";
		System.out.println(st);
		
		//	기타 : 나중에 배우게 될것(Class)
		
		//3.변수(variable)
		//	 데이터 유형에 맞는 저장 공간
		//	공간을 준비한 뒤 데이터를 집어넣고 계속 확인 + 계산
		
		//상수
		// - 리터널상수, 심볼릭상수
		
		//리터널상수
		//-데이터 그 자체
		//-자동으로 공간이 생성되고 메모리에 저장된다.
		//-공간을 구분할 수 있는 방법이 없기 떄문에 공간을 다시 사용할 수 없다
		//-단발성 데이터
		
		//데이터를 다루는 공간들(변수, 배열, 객체...)
		//-데이터를 저장하는 공간
		//-용도에 맞는 공간을 만들고 데이터를 저장시켜야한다.
		//-공간을 구불할 수 있는 이름이 있기 때문에 공간을 다시 이용한 수 있다.
		//-지속성 데이터
		
		//선언
		//메모리에 공간을 할당 받고 그 공간에 이름을 붙이는 작업
		//초기화
		//-할당받은 공간에 값을 처음 넣는 작업
		//-할당받은 공간은 항상 쓰레기값으로 채워져 있다.
		// 자신이 원하는 값으로 처음 설정을 하는것
		//-JAVA는 변수를 제외하면 모두 자동 초기화 된다.
		
		//호출
		//-할당받은 공간을 불러오는 작업
		
		//변수
		//-데이터 하나를 저장하는 공간
		//-용도에 맞는 공간을 만들고 데이터를 저장시켜야함
		//-공간을 구분 할 수 있는 이름이 있기 때문에 공간을 다시 이용할 수 있다
		//-지속성 데이터
		
		//변수의 선언
		//-메모리에 변수 공간을 할당받고 그 공간에 변수명을 붙이는 작업
		// ex) int a = 10;
		//-용도에 맞는 공간을 만들어주어야한다.
		//*형식*
		//	자료형 변수명;
		//	-변수명 : 할당받은 변수 공간을 구분하는 이름
		//			변수 공간을 호출할때 사용한다
		//	-데이터 성격이 연상되는 단어로 이름을 지어준다
		//	-변수명은 소문자를 권장
		
		//작명규칙
		//-영문자, 숫자, _로 구성
		//-대소문자 구별가능
		//-숫자로 시작할 수 없
		//-공백이나 특수기호 안됨
		//-예약어 안됨
		
		//자료형
		//-데이터의 형태를 구분하고 데이터의 범위나 부호의 사용여부를 결정하는 키워드
		
		//원시형(기본형) - 데이터를 저장하고 관리하는 용도의 공간
		//-정수형 : byte,short,int,long
		//-실수형 : float,double
		//-문자형 : char
		//-논리형 : boolean - 참과 거짓을 저장하고 관리하는 자료형
		//참조형(객체형) - 실제 데이터 공간이 만들어지고 그 공간의 정보를
		// 저장하는 공간이 함께 만들어지는 형태 [기능도 함께 같이]
		// - 기본형을 제외한 모든 자료형
		// - 문자열 : String
		// - 배열
				
		//변수의 초기화
		// - 할당받은 변수공간에 값을 처음 넣는 작업
		// - 할당받은 공간은 항상 쓰레기값 (자신이 원하는 데이터로 처음값설정)
		// - 초기화를 진행하지 않으면 공간의 데이터를 사용하려할때 error
				
		//- 형식
		// 1. 선언과 동시에 초기화
		//		자료형 변수명 = 값;
		// 2. 선언 후 초기화
		//		자료형 변수명;
		//		변수명 = 값;
				
		//*대입연산자*
		//@ = (대입연산자) - 우측 공간의 데이터를 좌측 공간에 대입하는연산자
		
		num = 10;
				
		//정수형 자료형
		//byte		1byte	-2^7~2^7-1		-128~127
		//short		2byte	-2^15~2^15-1	-32768~32767
		//int		4byte	-2^31~2^31-1
		//long		8byte	-2^63~2^63-1
				
		//1bit - 0 or 1 둘중 하나를 저장할 수 있는 컴퓨터의 최소 데이터 단위
		//1bit * 8 = 1byte
				
		int a = 20;
		System.out.println(a);
		int c = 10;
		System.out.println(c);
		a = c;//대입연산자
		System.out.println(a);
				
		//증감연산자 : 1증가 또는 1감소
				
		c++;//c = c+1;
		System.out.println(c);
		c--;
		System.out.println(c);
		//정수끼리의 연산에서는 정수값이 나온다
		int d = 5,e=3;
				
		System.out.println(d+e);//더하기
		System.out.println(d-e);//빼기
		System.out.println(d*e);//곱하기
		System.out.println(d/e);//나누기-정수끼리의 연산에서는 나누기 몫이 나온다
		System.out.println(d%e);//나머지
		
		//실수형 자료형
		//double 	8byte	15자리
		//float 	4byte	7자리
				
		double z = 123.456f;
		//실수형 상수는 기본적으로 double형
		//float로 인식시키려면은 상수뒤에 f를 적어주면 된다
				
		//1. 자료형이 큰쪽에서 작은쪽으로 이동할때는 Error발생
		// - 같은 크기라면 정수보다 실수가 더 크다
		// double > long > float > int > short == char > byte
		
		//CAST 연산자
		//(자료형)상수,변수,(연산식)
		// - 내가 원하는 데이터 타입으로 데이터를 일시적으로 변환시키는 연산자
				
		a = 20;
				
		int m = (int)a;
		
		//2.실수가 한개라도 포함된 연산자는 실수값이 나온다.
			
		int kor = 60;
		int eng = 13;
		int math = 98;
				
		int sub = 3;
				
		System.out.println((kor+eng)/2);
		System.out.println((kor+eng)/2.0);
		System.out.println((double)(kor+eng+math)/sub);
				
		//3.정밀한 계산에서는 실수를 사용하지 x
		System.out.println(1.3%0.2);
				
		//논리형 - boolean	1byte	true/false
		//참과 거짓을 관리하는 자료형
		// - true / false
		// - 어떤 대상을 표현할 때 상태값이 두가지인 경우
				
		boolean bo = true;
				
		System.out.println(bo);
		bo = !(10<5);
		System.out.println(bo);
			
		// 관계연산자 - 데이터의 관계를 연산하는 연산자
		// <> <= >= == !=
				
		// 논리연산자
		// - 조건식에 대한 참과 거짓을 판별하는 연산자
		// && - and(논리곱) - 양쪽이 모두 참일때 참을 발생 (true)
		System.out.println(10>5 && 10==5);
		// || - or(논리합) - 둘중 하나라도 참이면 참을 발생
		System.out.println(10>5 || 10==5);
		//조건식	연산자 조건식	and				or
		//true				true	true	true
		//false				true	false	true
		//true				false	false	true
		//false				false	false	false
				
		//! - not(부정) - 참이면 거짓 , 거짓이면 참
		System.out.println(!(10>5));		
		
		//문자
		//- ''(외따움표)안에 적어야 문자형 데이터로 인식된다.
		//char	2byte	0~65535
				
		//컴퓨터에는 정수만 처리할 수 있다.
		//컴퓨터에서 문자를 처리하기 위해 고유한 약속을 정해놨다
		//문자마다 고유한 정수값을 정해놓고 문자 사용시 정수값으로 읽는다.
				
		//1. 아스키코드 -1byte
		// - 가장 처음 만들어진 문자 체계
		// - 총 128가지의 문자들을 처리했다.
		// - 키보드 위에 있는 문자들
		// - 키보드의 키값으로도 사용된다.
		// - C계열의 언어는 기본 문자 체계가 아스키코드이다.
				
		//2.유니코드 - 2byte
		// - 아스키코드 + 이세상의 모든 문자 = 약 6만개
		// - 자바는 기본 문자형식을 유니코드로 만들어 놓았다..
		// - 오늘날에 가장 널리 쓰이는 문자 체계(UTF-8)
				
		char cha = 'A';
		System.out.println(cha);
		System.out.println((int)cha);
				
		cha = '가';
		System.out.println(cha);
		System.out.println((int)cha);
		
		//String - 문자열
		// - 참조형
		// - ???byte -가변형
		// - 지금은 일반 변수처럼 사용되는중
		// - 문자열을 구분하기 위해서 ""(쌍따옴표)안에 저장한다.
				
		String name ="안소연";
		System.out.println(name);
				
		//문자열은 연산이 불가능하다.
		//단 , 문자열 더하기는 가능하다
		//문자열 더하기는 문자열 뒤에 문자열을 붙여준다.
		System.out.println(name+"더하기");
		System.out.println(name+10);
		System.out.println(name+(10+20));
		
	}

}

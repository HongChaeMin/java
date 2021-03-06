package oop_test;
//코드의 재사용

//.(멤버 참조 연산자)
//- 클래스의 멤버를 참조(호출)하는 연산자
//- 클래스의 멤버를 사용하려 할 때 사용하는  연산자
public class Info {
	
	//멤버 변수
	//- 클래스의 ㅣ저장될 데이터 공간들
	//- 공간을 선언 하듯이 정의하면 된다

	String name;
	int age;
	
	//생성자 - 나중에
	//멤버메소드
	//메소드 - 한가지의 기능을 수행하고자 만드는 코드의 집합
	//- 형식
	//	반환 자료형		메소드명(매개변수){코드 정의}
	//void : 반환 자료형 메소드명 : setData 매개변수 : (String _name, int _age)
	void setData(String _name, int _age) {
		name = _name;
		age = _age;
	}
	
	void disp() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	int getAge() {
		return age;	//리턴하는 자료형과 반환 자료형은 일치 하여야한다
	}
	
	String getName() {
		return name;
	}
	
	//메소드명 - 메소드를 호출 할 때 사용하는 이름
	// - 첫글자는 소문자 달라지는 단어의 첫글자는 대문자로
	// - 메소드의 기능이 연상되는 단어로
	
	//반환 자료형
	// - 메소드가 실행하고 나서 종료될 때 돌려주는 값의 형태를 적는 부분
	// - 메소드가 실행하고 난 후에 나오느 결과물
	// - 반환값이 없으면 void 반환값이 있으면 값의 형태에 따라 자료형을 적으면 된다
	// - 반환값은 반환 자료형과 일치 되어야한다.
	
	//return
	// - 메소드 종료
	// - 반환값이 있으면 return 뒤에 적으면 값이 반환된다
	
	//매개변수
	// - 매개변수는 메소드를 실행할 때 가지고 시작해야 할 값의 형태를 적는 부분
	// - 메소드의 실행 재료
	// - 매개변수의 개수 자료형 순서는 상관없다
	
	// - 형식
	// 	- 반드시 자료형과 매개변수명은 한세트여야한다
	//	- 여러개일 경우는 , 를 통해 구분지어주면 된다
	//		(자료형 매겨변수면, 자료형 매개변수명)
	
	//----------------------------------------------------------
	//접근지정자 (접근제한자)
	// - 정보 은닉을 사용하기 위해서 사용되는 키워드
	// - 내가 원하든 원하지 않든 자동으로 적용된다
	
	//종류
	//	- private
	//		:클래스 내부에서만 접근 가능하고 외부에서는 접근 불가
	//		:일반적으로 별다른 제약 없으면 멤버 변수는 private으로 설정
	
	//	- protected
	//		: 상속받은 클래스에서는 접근 간으하고 그 외 외부에서는 모두 접근 불가
	//		: 같은 패키지라면 접근 가능
	//		: 상속에서 다시...
	
	//	- package(default)
	//		: 접근 지정자의 디폴트 값
	//		: 내가 접근 지정자를 적지 않으면 자동으로 적용되는 지정자
	//		: 패키지 내부에서만 접근이 가능하도록 하는 지정자
	
	//	- public
	//		: 클래스 내부와 외부에서 모두 접근 허용
	//		: 다른 패키지애서 클래스를 import를 통하여 접근 가능
	//		: 일반적으로 별 다른 제약 없으면 멤버 메소드는 public으로 설정한다
	
	
	//----------------------------------------------------------
	
	//setter
	//	- 멤버 변수의 값을 세팅하는 메소드 ex)setData()메소드
	//	- 일반정으로 매개변수명은 멤버변수명과 동일하게 작성한다 ex) int getAge()
	//	- 상황에 따라서는 멤버 변수명의 앞에 _를 붙이거나 줄임말을 사용하기도 한다
	
	//- 형식
	//	:void set멤버변수명(매개변수){코드정의} //멤버변수 : ex) String name, int age
	

	//getter
	//	- 멤버 변수의 값을 반환하는 메소드
	
	//- 형식
	//	: 자료형 get멤버변수명(){코드정의 return멤버변수;}
	
	
	//-----------------------------------------------------------
	
	//객체 생성과정
	// - 공간 할당 -> 생성자 호출
	
	//생성자
	// - 객체를 생성시 호출하는 메소드
	// - 객체를 준비할 때 사용된다 주로 멤버 변수 초기화를 할 때 이용한다.
	// - 생성자는 객체 생성시에만 단 한 번만 호출 할 수 있다
	// - 우리가 생성자를 정의하지 않으면 자동으로 생성자가 만들어진다 - 디폴트 생성자
	// - 생성자 안에서 다른 생성자를 호출 할 수 있다. this
	
	//형식
	// 1. 반환 자료형은 존재하지 않는다. 반환값이 없다
	// 2. 메소드명은 반드시 클래스명과 동일하여야한다.
	// 3. 매개변수를 가질 수 있다, 오버로드가 가능하다, 여러개가 존재한 수 있다
	//		- 객체 생성시 상황에 따른 객체를 생성하기 위해 여러개를 정의한다.
	
	//클래스명(매개변수){
	//		코드정의;
	//}
	
	//---------------------------------------------------------
	
	//디폴트 생성자
	// - 객체 생성 과정의 순서 유지를 위해서 자동으로 만들어진다
	// - 코드가 존재하지않는다, 기능이 없다
	// - 생성자를 하나라도 정의하면 디폴트 생성자는 만들어지지 않는다
	// 클래스명(){
	//
	//}
	
}

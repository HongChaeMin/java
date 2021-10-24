package oop.mobile;

public class Main {

	public static void main(String[] args) {
		
		/*
		[문제] oop.mobile01 패키지를 만들고 문제를 푸세요

		Main.java	main() 메소드를 가지는 클래스
		Mobile		휴대전화 클래스
			(항목) 이름, 통신사, 가격
			(메소드) disp(출력)

		클래스를 만들고 아래의 객체를 생성한 뒤 정보를 화면에 출력
			name		telecom		price
		[1]	G6		LG		70만원
		[2]	아이폰7		KT		95만원
		[3]	Galaxy S8	SKT		90만원
		*/

		Mobile in = new Mobile();
		Mobile in2 = new Mobile();
		Mobile in3 = new Mobile();
		
		in.setDate("G6", "LG", 70);
		in2.setDate("아이폰7", "KT", 95);
		in3.setDate("Galaxy S8", "SKT", 90);
		
		in.disp();
		in2.disp();
		in3.disp();
		
	}

}

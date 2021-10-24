package scanner;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		//System.in - 표준입력객체
		//Scanner - 데이터를 읽어오기 위한 도구
		// - 파일, 문자열, 입력스트림, URL
		
		//Scannner 만들기
		
		Scanner sc = new Scanner(System.in);
		
		//.next() 한 단어를 읽어오는 명령 - 다음 데이터를 문자열 형태로 읽어오는 명령
		System.out.print("이름입력 : ");//new line X
		String name = sc.next();
		System.out.println("이름 : "+name);//ln = new line
		
		//nextLine() - 한줄을 읽어오는 명령
		//- 공백문자 기준으로 데이터를 읽어오는 것이 아니라 \n 기준으로 데이터를 읽어온다
		//- 무엇인가 입력받은 후에 nextLine을 사용하면 버퍼에 \n이 남아있기 때문에 
		//	데이터를 입력받은걸로 인식한다 버퍼안에 엔터값을 제거해줘야한다
		//.nextLine()을 한 번 더 써준다
		
		//buffer
		//- 데이터의 단위, 데이터의 처리 속도, 형ㅇ식 등이 서로 다른 두 장치나 프로그램 사이에 
		//	데이터를 주고 받기 위한 목적으로 사용되는 임시 기억 장치
		//- 컴퓨터에서 키보드 입력시에는 데이터를 공백문자를 기준으로 데이터를 구분 짓는다
		
		sc.nextLine();
		System.out.println("쓰고싶은 말을 써보세요");
		String str = sc.nextLine();
		System.out.println("str = "+ str);
		
		//.next자료형()
		System.out.print("나이입력 : ");
		int age = sc.nextInt();
		System.out.println("나이 : "+age);
		
		System.out.print("평균입력 : ");
		double t = sc.nextDouble();
		System.out.println("평균 : "+t);

	}

}

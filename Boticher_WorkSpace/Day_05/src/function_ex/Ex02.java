package function_ex;

// static 영역  - static
// stack 영역 - int, double
// heap 영역 - int[], String

public class Ex02 {

	public static void main(String[] args) {

		// 메소드 만들기
		// 1. 어떤 함수를 만들지 메소드 명을 짓는다
		// 2. input을 무엇을 받을지 생각한다
		// 3. output을 무엇으로 돌려줄지 생각한다
		// 4. 구현한다

		// 메소드를 사용하는 곳
		int x = 30;
		int y = 50;
		int result = sum(x, y); // 전달 인자값, argument
		System.out.println("합계 : " + result);

		printHelloWorld(); // 함수를 사용한다, 함수를 부른다, 함수를 call한다
		
	}

	// 메소드 만드는 곳 
	public static int sum(int x, int y) { // 매개 변수, parameter
		return x + y; // return을 만나면 메소드가 종료된다
	}

	public static void printHelloWorld() {
		System.out.println("Hello World ~!~!");
	}
	
}

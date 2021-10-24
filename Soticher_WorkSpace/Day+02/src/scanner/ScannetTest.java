package scanner;
//package - import - class
import java.util.Scanner;

public class ScannetTest {
	public static void main(String[] args) {
		
		//입출력(input/output)
		//데이터가 나가거나 들어오는 것
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		
		int num = sc.nextInt();
		System.out.println(num);
		
		
	}
}

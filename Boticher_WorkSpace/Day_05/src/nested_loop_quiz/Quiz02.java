package nested_loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 1. 행을 반으로 나눈다.
		// 2. 열을 구성하는 요소를 분리한다
		//   2-1) - 를 출력하는 규칙을 찾는다 => 삼각형
		//   2-2) *+ 를 출력하는 규칙을 찾는다 => row / 2 몫에서부터 행마다 하나씩 감소
		//	 2-3) * 를 출력하는 규칙을 찾는다 => 무조건 하나씩 출력
		// 	 2-4) - 를 출력하는 규칙을 찾는다 => 삼각형 (2-1과 같음)

		for (int i = 0; i <= n / 2; i++) {
			// 2-1
			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}
			// 2-2
			for (int j = 0; j < (n / 2) - i; j++) {
				System.out.print("*+");
			}
			// 2-3
			System.out.print("*");
			// 2-4
			for (int j = i; j > 0; j--) {
				System.out.print("-");
			}
			System.out.println();
		}
		for (int i = n / 2; i >= 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("-");
			}
			for (int j = (n / 2) - i + 1; j > 0; j--) {
				System.out.print("*+");
			}
			System.out.print("*");
			for (int j = i-1; j > 0; j--) {
				System.out.print("-");
			}
			System.out.println();
		}

		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int num = i;
			for(int j = 0; j < i; j++) { // 첫 번 째 열은 i(num)값을 그대로 출력한다
				System.out.print(num + " "); 
				// 그 다음 열의 값은 n-1 더한 값으로 시작하고, 그 다음 열로 계속 추가될 수록 -1 씩 감소해야하므로 1씩 증가하는 j를 뺀다
				num = num + (n - 1 - j);
			}
			System.out.println();
		}
		
	}

}

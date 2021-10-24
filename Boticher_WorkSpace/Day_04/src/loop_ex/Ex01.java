package loop_ex;

public class Ex01 {

	public static void main(String[] args) {

		// 0~3: 4번
		int i = 0;
		do {
			System.out.println("커피 " + i);
			i++;
		} while (i <= 3); // 참일 때는 while문과 동일하게 수행되고, 거짓일 때는 무조건 한 번은 수행된다

		// 0 ~ 4 : 5번
		// for (초기식; 조건; 증감식) {}
		for (int j = 0; j < 4; j++) {
			System.out.println("카페인 " + j);
		}

		// 1 ~ 5 : 5번
		for (int j = 1; j <= 5; j++) {
			System.out.println("알코올 " + j);
		}

		// 5 ~ 1 : 5번
		for (int j = 5; j >= 1; j--) {
			System.out.println("니코틴 " + j);
		}

	}

}

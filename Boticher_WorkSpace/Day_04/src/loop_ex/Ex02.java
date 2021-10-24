package loop_ex;

public class Ex02 {

	public static void main(String[] args) {

		int i = 0;
		while (i < 3) { // 0 1 2 => 3
			i++;
		}

		// 무한 루프

		int j = 0;
		while (true) {
			if (j == 3) {
				break; // break가 써진 가장 가까운 반복문에서 빠져나온다
			}
			System.out.println("무한 루프 " + j);
			j++;
		}

		// 가운데가 비어있으면 무한루프
		for (; true;) {
			break;
		}

		// continue : skip 아래 코드들을 수행하지 않고 즉시 조건을 본다
		// 1 ~ 10까지의 수에서 4의 배수일 때 숫자를 출력하지 않기 1 2 3 5 6 7 9 10
		
		for(int k = 1; k<=10; k++) {
			if ( k % 4 == 0) {
				continue;
			}
			System.out.println(k + " ");
		}
		System.out.println();
		
		// alt + shift + r

	}

}

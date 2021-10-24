package demensional_array_quiz;

public class Quiz02 {

	public static void main(String[] args) {

		System.out.println("------------문제 1-----------");

		int[][] arr = new int[2][3];

		int n = 10;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		System.out.println("------------문제 2-----------");

		arr = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("------------문제 3-----------");

		arr = new int[3][3];
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("------------문제 4-----------");

		arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((arr.length / 2) == j) {
					arr[i][j] = 1;
				}
				if ((arr.length / 2) == i) {
					arr[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("------------문제 5-----------");

		arr = new int[3][3];
		n = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
		
		System.out.println("다른 방법");
		
		for (int i = 1; i < 10; i = i + 3) {
			for (int j = i; j < i + 3; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("------------문제 6-----------");
		
		n = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = n;
				n++;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	// 쌤은 출력 함수 만들어서 씀

}

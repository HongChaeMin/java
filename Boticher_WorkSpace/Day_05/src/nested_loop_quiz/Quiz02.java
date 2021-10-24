package nested_loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 1. ���� ������ ������.
		// 2. ���� �����ϴ� ��Ҹ� �и��Ѵ�
		//   2-1) - �� ����ϴ� ��Ģ�� ã�´� => �ﰢ��
		//   2-2) *+ �� ����ϴ� ��Ģ�� ã�´� => row / 2 �򿡼����� �ึ�� �ϳ��� ����
		//	 2-3) * �� ����ϴ� ��Ģ�� ã�´� => ������ �ϳ��� ���
		// 	 2-4) - �� ����ϴ� ��Ģ�� ã�´� => �ﰢ�� (2-1�� ����)

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
			for(int j = 0; j < i; j++) { // ù �� ° ���� i(num)���� �״�� ����Ѵ�
				System.out.print(num + " "); 
				// �� ���� ���� ���� n-1 ���� ������ �����ϰ�, �� ���� ���� ��� �߰��� ���� -1 �� �����ؾ��ϹǷ� 1�� �����ϴ� j�� ����
				num = num + (n - 1 - j);
			}
			System.out.println();
		}
		
	}

}

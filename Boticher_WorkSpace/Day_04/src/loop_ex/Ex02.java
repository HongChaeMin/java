package loop_ex;

public class Ex02 {

	public static void main(String[] args) {

		int i = 0;
		while (i < 3) { // 0 1 2 => 3
			i++;
		}

		// ���� ����

		int j = 0;
		while (true) {
			if (j == 3) {
				break; // break�� ���� ���� ����� �ݺ������� �������´�
			}
			System.out.println("���� ���� " + j);
			j++;
		}

		// ����� ��������� ���ѷ���
		for (; true;) {
			break;
		}

		// continue : skip �Ʒ� �ڵ���� �������� �ʰ� ��� ������ ����
		// 1 ~ 10������ ������ 4�� ����� �� ���ڸ� ������� �ʱ� 1 2 3 5 6 7 9 10
		
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

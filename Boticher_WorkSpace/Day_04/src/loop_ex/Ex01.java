package loop_ex;

public class Ex01 {

	public static void main(String[] args) {

		// 0~3: 4��
		int i = 0;
		do {
			System.out.println("Ŀ�� " + i);
			i++;
		} while (i <= 3); // ���� ���� while���� �����ϰ� ����ǰ�, ������ ���� ������ �� ���� ����ȴ�

		// 0 ~ 4 : 5��
		// for (�ʱ��; ����; ������) {}
		for (int j = 0; j < 4; j++) {
			System.out.println("ī���� " + j);
		}

		// 1 ~ 5 : 5��
		for (int j = 1; j <= 5; j++) {
			System.out.println("���ڿ� " + j);
		}

		// 5 ~ 1 : 5��
		for (int j = 5; j >= 1; j--) {
			System.out.println("����ƾ " + j);
		}

	}

}

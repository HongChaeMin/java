package demensional_array_ex;

public class Ex01 {

	public static void main(String[] args) {

		// 2���� �迭
		// �ٱ��� : ��, ���� : ��
		int[][] scores = { { 89, 93, 91 }, { 91, 100, 72 }, { 98, 93, 94 }, { 65, 63, 75 } };

		System.out.println("�� �� ° �л��� �� �� ° ������ " + scores[2][1]);

		System.out.println("�� �� ° �л��� ù �� ° ������ " + scores[3][0]);

		System.out.println("�� �� ° �л��� �� �� ° ������ " + scores[1][2]);

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				System.out.println((i + 1) + "�� ° �л��� " + (j + 1) + "������ " + scores[i][j]);
			}
		}

		// �л����� ��� ���� ���ϱ�
		for (int i = 0; i < scores.length; i++) { // �л� �� 0 1 2 3
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) { // ���� �� - �� �л� �� ������
				sum += scores[i][j];
			}
			double avg = sum / scores[i].length;
			System.out.println((++i) + "�� ° �л��� ��� ������ " + avg);
			i--;
		}

	}

}

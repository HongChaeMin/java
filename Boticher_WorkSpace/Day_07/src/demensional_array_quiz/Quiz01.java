package demensional_array_quiz;

public class Quiz01 {

	public static void main(String[] args) {

		System.out.println("------------���� 1-----------");

		int[][] scores = { { 89, 93, 91, 93, 92, 78, 90, 90, 93, 90 }, { 91, 82, 72, 98, 92, 87, 77, 87, 74, 88 },
				{ 98, 93, 94, 91, 97, 94, 91, 96, 98, 90 }, { 65, 63, 57, 87, 88, 92, 78, 85, 100, 68 },
				{ 45, 50, 48, 63, 67, 58, 40, 66, 47, 64 } };

		for (int i = 0; i < scores.length; i++) {
			double avg = 0.0;
			for (int j = 0; j < scores[i].length; j++) {
				avg += scores[i][j];
			}
			avg /= 10.0;
			System.out.println((++i) + "�� ° �л��� ����� " + avg + "��");
			i--;
		}

		System.out.println("------------���� 2-----------");

		for (int i = 0; i < scores.length; i++) {
			int max = 0;
			for (int j = 0; j < scores[i].length; j++) {
				if (max < scores[i][j]) {
					max = scores[i][j];
				}
			}
			System.out.println((++i) + "�� ° �л��� �ְ����� " + max + "��");
			i--;
		}

		System.out.println("------------���� 3-----------");

		double[] avgs = new double[5];
		double total = 0.0;

		for (int i = 0; i < scores.length; i++) {
			double avg = 0.0;
			for (int j = 0; j < scores[i].length; j++) {
				avg += scores[i][j];
			}
			avgs[i] = avg / 10.0;
			if (total < avgs[i]) {
				total = avgs[i];
			}
		}

		for (int i = 0; i < avgs.length; i++) {
			if (avgs[i] == total) {
				System.out.println("����� ���� ���� �л��� " + (++i) + "�� ° �л��̰�, ��� ������ " + total + "��");
				break;
			}
		}

		System.out.println("------------���� 4-----------");

		int maxScore = 0;
		int maxIndex = 0;

		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i][3]) {
				maxScore = scores[i][3];
				maxIndex = i;
			}
		}
		System.out.println("4�� ° ������ �ְ� �����ڴ� " + (++maxIndex) + "�� ° �л��̰�, ������ " + maxScore);

		maxIndex = 0;
		double maxAverager = 0;
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=3; j<=7; j++) {
				sum+= scores[i][j];
			}
			double average = sum /5.0;
			if(maxAverager<average) {
				maxAverager = average;
				maxIndex = i;
			}
		}
		
	}

}

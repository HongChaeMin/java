package demensional_array_ex;

public class Ex01 {

	public static void main(String[] args) {

		// 2차원 배열
		// 바깥쪽 : 행, 안쪽 : 열
		int[][] scores = { { 89, 93, 91 }, { 91, 100, 72 }, { 98, 93, 94 }, { 65, 63, 75 } };

		System.out.println("세 번 째 학생의 두 번 째 점수는 " + scores[2][1]);

		System.out.println("네 번 째 학생의 첫 번 째 점수는 " + scores[3][0]);

		System.out.println("두 번 째 학생의 세 번 째 점수는 " + scores[1][2]);

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				System.out.println((i + 1) + "번 째 학생의 " + (j + 1) + "점수는 " + scores[i][j]);
			}
		}

		// 학생들의 평균 점수 구하기
		for (int i = 0; i < scores.length; i++) { // 학생 수 0 1 2 3
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) { // 과목 수 - 한 학생 당 점수들
				sum += scores[i][j];
			}
			double avg = sum / scores[i].length;
			System.out.println((++i) + "번 째 학생의 평균 점수는 " + avg);
			i--;
		}

	}

}

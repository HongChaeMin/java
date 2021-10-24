package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {

		int numbers[] = { 3, 8, 9, 4, 2, 1, 7, 5 };

		numbers[3] = 6;

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 != 0)
				System.out.print(numbers[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2�� ����ִ� index�� " + i);
				break;
			}
		}

		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("���� ū ���� " + max);

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (min == numbers[i]) {
				System.out.println("�ּҰ��� index�� " + i);
				break;
			}
		}

		double avg = 0;
		for (int i = 0; i < numbers.length; i++) {
			avg += numbers[i];
		}
		avg = avg / (numbers.length * 1.0);
		System.out.println("����� " + avg);

	}

}

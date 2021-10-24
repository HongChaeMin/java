package forwhile;

public class WhileTest {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		while (i < 6) {
			sum += i;
			i++;
		}

		System.out.println("정답 1) " + sum);

		i = 1;

		System.out.println("정답 2)");

		while (i < 11) {
			if (i < 3) {
				System.out.println("i = " + i);
			} else if (7 <= i) {
				System.out.println("i = " + i);
			}
			i++;
		}

		i = 1;
		sum = 0;

		System.out.println("정답 3)");

		while (i < 11) {
			if (i < 3) {
				System.out.println("i = " + i);
				sum += i;
			} else if (7 <= i) {
				System.out.println("i = " + i);
				sum += i;
			}
			i++;
		}

		i = 1;
		sum = 0;

		System.out.println("정답 4)");

		while (i < 11) {
			if (i < 3) {
				sum++;
			} else if (7 <= i) {
				sum++;
			}
			i++;
		}

		System.out.println(sum);

	}

}

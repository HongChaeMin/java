package array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// �迭 (Array) : ���� �ڷ����� ����

		// �迭�� �ʱ�ȭ (1)
		int[] scores = { 89, 100, 99, 91, 82 };
		System.out.println("ù �� ° �� : " + scores[0]); // alt + shift + r �̸� �ٲٴ� ����Ű
		System.out.println("�� �� ° �� : " + scores[1]);
		System.out.println("�� �� ° �� : " + scores[2]);
		System.out.println("�� �� ° �� : " + scores[3]);
		System.out.println("�ټ� �� ° �� : " + scores[4]);
		// index (����)

		// �迭�� �ʱ�ȭ (2)
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);

		// �迭�� �� ����
		numbers[0] = 1000;
		System.out.println(numbers[0]);
		System.out.println(numbers); // hash �� (c�� ġ�� �ּҰ�)
		
		// �ݺ����� �̿��� �迭�� ���
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// �հ� ���ϱ�
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
	}

}

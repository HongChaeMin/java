package variable_ex;

public class Ex01 {

	public static void main(String[] args) {

		// ������ ���� (Integer)
		int number = 10; // �� ó�� ������ ���� �ִ� �� : '�ʱ�ȭ', ������ ���� �ִ°� : �Ҵ��Ѵ�. assign
		System.out.println(number);

		number = 100; // �����̹Ƿ� ���� ������ �� �ִ�. ������ ���� �ڷ��� ����
		System.out.println(number);

		int number2 = 5;
		int sum = number + number2;
		System.out.println(sum);

		// �Ǽ��� ���� (float)
		float f = 1.55555555555555555f;
		System.out.println(f);

		// ���� ����(character) : ���� �� ��, ���� ����ǥ�� ���Ѵ�
		char c = 65;
		System.out.println(c);

		// boolean ���� : true, false
		boolean isReal = true; // camel case (��Ÿ) is_real : snake case(��)
		boolean isFalse = false;
		System.out.println("�� : " + isReal);
		System.out.println("���� : " + isFalse);

		
		
	}

}

package vaiable_ex;

public class Ex02 {

	public static void main(String[] args) {
		// �ڷ��� ��ȯ => casting

		// double -> int int -> double

		double pi = 3.14;

		int intPi = (int) pi; // double -> int�� ĳ���� : �Ҽ�������

		System.out.println(intPi);

		System.out.println((double) intPi); // int -> double : .0�� �ٴ´�

		int num = 7;
		double result = num / 2; // ���� : 3.5
		System.out.println(result); // 3.0 // int / int = int

		// 1. �� �� �ϳ��� ���� �Ǽ��� casting �Ѵ�
		result = (double) num / 2;

		// 2. �Ǽ��� ������
		result = num / 2.0;
		System.out.println(result);

		// �ݿø� �ϴ� ��
		// Math.round(�Ǽ�); => 3.14 => 3 / 3.8 => 4
		pi = 3.141592653;
		System.out.println(Math.round(pi));
		
		// �� ° �ڸ����� �ݿø��ؼ� ��Ÿ���� ���
		// 1. pi�� 100�� ���ؼ� 314.1592653 �����
		// 2. Math.round() ȣ�� : �Ҽ��� ù° �ڸ����� �ݿø��ؼ� ����� => 314
		// 3. 3.14�� ����� ���ؼ� 100�� ������
		
	}

}
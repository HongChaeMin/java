package variable_ex;

public class Ex02 {

	public static void main(String[] args) {

		int noodleCup = 850;

		System.out.println("������ ���� : " + noodleCup);

		// 3�� ���� ���
		// ������ ���� : 850, 3���� ���� : 00
		int noodleCup3 = noodleCup * 3;
		System.out.println("������ ���� : " + noodleCup + ", 3���� ���� : " + noodleCup3);

		// 10000���� ������ 3�� �� �� �Ž����� ���ϱ�
		int money = 10000;
		int change = money - noodleCup;
		System.out.println("�Ž����� : " + change + "��");

		// 5000������ �������� �� �� �� �� �ְ�, �Ž������� �󸶳� ���°�

		money = 5000;
		int price = 0;

		System.out.println("�� �� �ִ� ���� : " + money / noodleCup);

		System.out.println("�Ž����� : " + money % noodleCup);

	}

}

package variable_quiz;

public class Qize02 {

	public static void main(String[] args) {

//		���� ������ 90�� �̻��̸� 'A'�����̰� ������ 4.0 �Դϴ�.
//		���� ������ 80�� �̻��̸� 'B'�����̰� ������ 3.0 �Դϴ�.

		int num = 90;
		char sum = 65;
		double avg = 4.0;

		System.out.println("���� ������ " + num + "�� �̻��̸� \'" + sum + "\'�����̰� ������ " + avg + " �Դϴ�");

		num = 80;
		sum = 66;
		avg = 3.0;

		System.out.println("���� ������ " + num + "�� �̻��̸� \'" + sum + "\'�����̰� ������ " + avg + " �Դϴ�");

//		�� ���� �� : 1165.7250000000001

		int number1 = 33;
		double number2 = 35.325;

		System.out.println("�� ���� �� : "+(number1*1.0*number2));
		
//		943�ð��� 39�� 7�ð� �Դϴ�.
		
		int hour = 943;
		int day = hour / 24;
		hour %= 24;
		
		System.out.println(hour+"�ð��� "+day+"�� "+hour+"�ð� �Դϴ�");
		
//		�簢���� ����: 72
//		�ﰢ���� ����: 36

		int x = 8, y = 9;
		
		System.out.println("�簢���� ���� : "+(x*y));
		System.out.println("�ﰢ���� ���� : "+(x*y/2));
		
	}

}

package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {

		int ko = 93, math = 88, eg = 94;

		System.out.println("���� " + ko + "��, ���� " + math + "��, ���� " + eg + "��");

		System.out.println("��� : " + ((Math.round((ko + math + eg) / 3.0 * 100) / 100.0)));

		int celsius = 30;

		System.out.println("���� " + celsius + "���� ȭ�� " + (int)(1.8 * celsius + 32) + "�� �Դϴ�");

	}

}

package string_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] files = { "cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg" };

		int num = 0;

		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith(".jpg")) {
				num++;
			}
		}
		System.out.println("jpg ���� ���� : " + num);

		int score = 0;

		String[] quiz = { "�¸�", "���", "��ǻ��", "��Ʈ��" };
		String[] answerWord = { "victory", "love", "computer", "notebook" };

		for (int i = 0; i < quiz.length; i++) {
			System.out.print(quiz[i] + " �� ����� �Է��ϼ��� : ");
			String answer = sc.next();
			if (answer.equals(answerWord[i])) {
				score += 25;
			}
		}

//		System.out.print("1. �¸��� ����� �Է��ϼ��� : ");
//		String victory = sc.next();
//		if (victory.toLowerCase().equals("victory"))
//			score += 25;
//		System.out.print("2. ����� ����� �Է��ϼ��� : ");
//		String love = sc.next();
//		if (love.toLowerCase().equals("love"))
//			score += 25;
//		System.out.print("3. ��ǻ�͸� ����� �Է��ϼ��� : ");
//		String computer = sc.next();
//		if (computer.toLowerCase().equals("computer"))
//			score += 25;
//		System.out.print("4. ��Ʈ���� ����� �Է��ϼ��� : ");
//		String notebook = sc.next();
//		if (notebook.toLowerCase().equals("notebook"))
//			score += 25;

		System.out.println("������ " + score + "�� �Դϴ�");

		String memberStr = "������:�۰�ȣ:���켺:�̹���:�۰�ȣ:�̹���:�̹���:������:�̺���:������";

		String[] actor = memberStr.split(":");
		String[] check = new String[actor.length];
		int n = 0;

		for (int i = 0; i < actor.length; i++) {
			String name = actor[i];
			boolean isSame = false;
			if(name.equals("")) {
				continue;
			}
			for (int j = i + 1; j < actor.length; j++) {
				if (name.equals(actor[j])) {
					check[j] = "";
					isSame = true;
					break;
				}
			}
			if(isSame) {
				n++;
			}
		}
		System.out.println(n);
		
		
	}

}

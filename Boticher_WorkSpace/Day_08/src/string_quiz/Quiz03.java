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
		System.out.println("jpg 파일 개수 : " + num);

		int score = 0;

		String[] quiz = { "승리", "사랑", "컴퓨터", "노트북" };
		String[] answerWord = { "victory", "love", "computer", "notebook" };

		for (int i = 0; i < quiz.length; i++) {
			System.out.print(quiz[i] + " 를 영어로 입력하세요 : ");
			String answer = sc.next();
			if (answer.equals(answerWord[i])) {
				score += 25;
			}
		}

//		System.out.print("1. 승리를 영어로 입력하세요 : ");
//		String victory = sc.next();
//		if (victory.toLowerCase().equals("victory"))
//			score += 25;
//		System.out.print("2. 사랑을 영어로 입력하세요 : ");
//		String love = sc.next();
//		if (love.toLowerCase().equals("love"))
//			score += 25;
//		System.out.print("3. 컴퓨터를 영어로 입력하세요 : ");
//		String computer = sc.next();
//		if (computer.toLowerCase().equals("computer"))
//			score += 25;
//		System.out.print("4. 노트북을 영어로 입력하세요 : ");
//		String notebook = sc.next();
//		if (notebook.toLowerCase().equals("notebook"))
//			score += 25;

		System.out.println("점수는 " + score + "점 입니다");

		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";

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

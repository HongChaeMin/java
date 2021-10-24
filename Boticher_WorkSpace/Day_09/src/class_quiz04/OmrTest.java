package class_quiz04;

import java.util.Scanner;

public class OmrTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] stuAnswer = new int[5];
		
		System.out.print("학생 이름 : ");
		String name = sc.next();
		System.out.print("학번 : ");
		int studentId = sc.nextInt();
		
		for (int i = 0; i < stuAnswer.length; i++) {
			System.out.print("학생의 답 : ");
			int num = sc.nextInt();
			if (num <= 5 && num >= 1) {
				stuAnswer[i] = num;
			} else {
				System.out.println("답을 잘못 입력하셨습니다");
				i--;
			}
		}
		
		OmrCard st1 = new OmrCard(name, studentId, stuAnswer);
		
		int[] answer = new int[5];
		for(int i=0; i<answer.length; i++) {
			System.out.print((++i)+"번 문제의 답 : ");
			i--;
			answer[i] = sc.nextInt();
		}
		OmrCardReader st1Reader = new OmrCardReader(st1, answer);
		st1Reader.disp();
		
		
	}

}

package class_quiz04;

import java.util.Scanner;

public class OmrTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] stuAnswer = new int[5];
		
		System.out.print("�л� �̸� : ");
		String name = sc.next();
		System.out.print("�й� : ");
		int studentId = sc.nextInt();
		
		for (int i = 0; i < stuAnswer.length; i++) {
			System.out.print("�л��� �� : ");
			int num = sc.nextInt();
			if (num <= 5 && num >= 1) {
				stuAnswer[i] = num;
			} else {
				System.out.println("���� �߸� �Է��ϼ̽��ϴ�");
				i--;
			}
		}
		
		OmrCard st1 = new OmrCard(name, studentId, stuAnswer);
		
		int[] answer = new int[5];
		for(int i=0; i<answer.length; i++) {
			System.out.print((++i)+"�� ������ �� : ");
			i--;
			answer[i] = sc.nextInt();
		}
		OmrCardReader st1Reader = new OmrCardReader(st1, answer);
		st1Reader.disp();
		
		
	}

}

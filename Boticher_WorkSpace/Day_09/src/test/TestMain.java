package test;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		MemoryGame memoryGame = new MemoryGame();
		memoryGame.shuffle(); // ī�� ����

		Scanner scan = new Scanner(System.in);
		
		while (memoryGame.getFlag() == false) {
			System.out.println("������ ī���� index �� ���� �Է��ϼ���.(0~5) ��) 3 5");
			int index1 = scan.nextInt();
			int index2 = scan.nextInt();

			memoryGame.flip(index1, index2);
		}
		System.out.println("��� ���߼̾��! �����մϴ�!!!");

		scan.close();
		
	}
}

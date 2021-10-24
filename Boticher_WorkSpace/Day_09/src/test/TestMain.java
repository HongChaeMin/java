package test;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		MemoryGame memoryGame = new MemoryGame();
		memoryGame.shuffle(); // 카드 섞기

		Scanner scan = new Scanner(System.in);
		
		while (memoryGame.getFlag() == false) {
			System.out.println("뒤집을 카드의 index 두 개를 입력하세요.(0~5) 예) 3 5");
			int index1 = scan.nextInt();
			int index2 = scan.nextInt();

			memoryGame.flip(index1, index2);
		}
		System.out.println("모두 맞추셨어요! 축하합니다!!!");

		scan.close();
		
	}
}

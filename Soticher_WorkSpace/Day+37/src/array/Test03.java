package array;

import java.util.Scanner;

public class Test03 {

	Scanner sc = new Scanner(System.in);

	int seat[] = new int[7];
	int money = 0;
	boolean c = false;

	public void check() {

		for (int i = 0; i < seat.length; i++) {
			if (seat[i] != 1) {
				c = true;
			}
		}

		if (c) {
			System.out.print("좌석 선택 : ");
			int s = sc.nextInt();
			if (seat[s - 1] != 0) {
				System.out.println("이미 예매가 완료된 자리 입니다");
			} else {
				System.out.println("예매가 완료 되었습니다");
				money += 12000;
				seat[s - 1] = 1;
			}
		} else {
			System.out.println("모든 좌석이 예매가 완료되었습니다");
		}
		c = false;
	}

	public void disp() {
		System.out.print("좌석 = ");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Test03 t = new Test03();

		boolean y = true;

		t.disp();

		while (y) {
			System.out.println("1. 예매하기\t2. 결제하기\t3. 종료");
			switch (sc.nextInt()) {
			case 1:
				t.check();
				t.disp();
				break;
			case 2:
				System.out.println("총 결제 금액은 " + t.money + "원 입니다");
				System.out.println("결제 완료 !");
				t.money = 0;
				break;
			case 3:
				if (t.money != 0) {
					System.out.println("돈 내야죠 !!! 결제하세요 ;;;");
				} else {
					System.out.println("종료합니다");
					y = false;
				}
				break;
			}
		}

	}

}

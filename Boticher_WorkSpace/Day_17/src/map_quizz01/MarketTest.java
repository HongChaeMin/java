package map_quizz01;

import java.util.Scanner;

public class MarketTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean check = true;

		Market market = new Market();

		while (check) {
			System.out.println("1. 등록\t 2. 보기\t3. 수정\t4. 삭제\t5. 종료");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("이름, 가격, 판매상태를 입력해주세요");
				Goods goods = new Goods(sc.next(), sc.nextInt(), sc.next());
				market.create(goods);
				break;
			case 2:
				market.read();
				break;
			case 3:
				System.out.println("1. 물품의 가격 수정\t 2. 판매 상태 수정");
				int num = sc.nextInt();
				if (num == 1) {
					System.out.println("상품명, 수정할 가격을 입력해주세요");
					market.update(sc.next(), sc.nextInt());
				} else if (num == 2) {
					System.out.println("상품명, 수정할 판매 상태를 입력해주세요");
					market.update(sc.next(), sc.next());
				} else {
					System.out.println("잘못입력하셨습니다");
				}
				break;
			case 4:
				System.out.println("삭제할 상품을 입력해주세요");
				market.delete(sc.next());
				break;
			case 5:
				System.out.println("시스템을 종료합니다");
				check = false;
				break;
			}
		}

	}

}

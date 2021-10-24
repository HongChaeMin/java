package variable_ex;

public class Ex02 {

	public static void main(String[] args) {

		int noodleCup = 850;

		System.out.println("육개장 가격 : " + noodleCup);

		// 3개 가격 계산
		// 육개장 가격 : 850, 3개의 가격 : 00
		int noodleCup3 = noodleCup * 3;
		System.out.println("육개장 가격 : " + noodleCup + ", 3개의 가격 : " + noodleCup3);

		// 10000으로 육개장 3개 산 후 거스름돈 구하기
		int money = 10000;
		int change = money - noodleCup;
		System.out.println("거스름돈 : " + change + "원");

		// 5000원으로 육개장을 몇 개 살 수 있고, 거스름돈이 얼마나 남는가

		money = 5000;
		int price = 0;

		System.out.println("살 수 있는 개수 : " + money / noodleCup);

		System.out.println("거스름돈 : " + money % noodleCup);

	}

}

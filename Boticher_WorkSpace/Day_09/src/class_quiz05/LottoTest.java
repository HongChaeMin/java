package class_quiz05;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// LottoChecker 객체 생성 시 당첨번호가 생성된다.
		LottoChecker lottoChecker = new LottoChecker();

		Lotto lotto1 = new Lotto();

		// 수동
		System.out.println("숫자 6개를 입력하세요 ");
		lotto1.manual(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		String lottoResult1 = lottoChecker.check(lotto1);
		// 출력
		System.out.println(lottoResult1);

		Lotto lotto2 = new Lotto();
		// 자동
		lotto2.auto();
		lotto2.disp();
		String lottoResult2 = lottoChecker.check(lotto2);
		// 출력
		System.out.println(lottoResult2);

		sc.close();
		
	}

}

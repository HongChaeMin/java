package class_quiz05;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// LottoChecker ��ü ���� �� ��÷��ȣ�� �����ȴ�.
		LottoChecker lottoChecker = new LottoChecker();

		Lotto lotto1 = new Lotto();

		// ����
		System.out.println("���� 6���� �Է��ϼ��� ");
		lotto1.manual(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		String lottoResult1 = lottoChecker.check(lotto1);
		// ���
		System.out.println(lottoResult1);

		Lotto lotto2 = new Lotto();
		// �ڵ�
		lotto2.auto();
		lotto2.disp();
		String lottoResult2 = lottoChecker.check(lotto2);
		// ���
		System.out.println(lottoResult2);

		sc.close();
		
	}

}

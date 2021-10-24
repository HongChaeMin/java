package class_quiz05;

public class LottoChecker {

	private int[] lotto = new int[6];

	public LottoChecker() {
		for (int i = 0; i < this.lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			boolean isDuplication = false;
			for (int j = 0; j < this.lotto.length; j++) {
				if (this.lotto[j] == random) {
					i--;
					isDuplication = true;
					break;
				}
			}
			if (!isDuplication) {
				this.lotto[i] = random;
			}
		}
	}

	public int[] getLotto() {
		return lotto;
	}

	public String check(Lotto lotto1) {
		int check = 0;
		int[] chlotto = lotto1.getManual();
		for (int i = 0; i < this.lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[i] == chlotto[j]) {
					check++;
				}
			}
		}
		if (check == 6) {
			return "1�� �Դϴ� ������ ���￡ �� �����!!!!";
		} else if (check == 5) {
			return "2���Դϴ� ���ϵ帳�ϴ� !!!!";
		} else if (check == 4) {
			return "3���Դϴ� ���� ���ҳ׿�^__^";
		} else if (check == 3) {
			return "4���Դϴ� ^^";
		} else {
			return "���Դϴ� ������ ���� ���׿�...��";
		}
	}

}

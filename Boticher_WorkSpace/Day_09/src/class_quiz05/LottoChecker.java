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
			return "1등 입니다 어차피 서울에 집 못사요!!!!";
		} else if (check == 5) {
			return "2등입니다 축하드립니다 !!!!";
		} else if (check == 4) {
			return "3등입니다 운이 좋았네요^__^";
		} else if (check == 3) {
			return "4등입니다 ^^";
		} else {
			return "꽝입니다 오늘은 운이 없네요...ㅠ";
		}
	}

}

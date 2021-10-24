package class_quiz05;

public class Lotto {

	private int[] lottonumbers = new int[6];

	// 수동
	public void manual(int a, int b, int c, int d, int e, int f) {
		if (a >= 45 || b >= 45 || c >= 45 || d >= 45 || e >= 45 || f >= 45) {
			System.out.println("숫자를 잘못입력하셨습니다");
			return;
		}
		this.lottonumbers[0] = a;
		this.lottonumbers[1] = b;
		this.lottonumbers[2] = c;
		this.lottonumbers[3] = d;
		this.lottonumbers[4] = e;
		this.lottonumbers[5] = f;
	}

	public int[] getManual() {
		return lottonumbers;
	}
	
	// 자동
	public void auto() {
		for (int i = 0; i < this.lottonumbers.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			boolean isDuplication = false;
			for (int j = 0; j < this.lottonumbers.length; j++) {
				if (this.lottonumbers[j] == random) {
					i--;
					isDuplication = true;
					break;
				}
			}
			if (!isDuplication) {
				this.lottonumbers[i] = random;
			}
		}
	}

	public void disp() {
		for(int i=0; i<this.lottonumbers.length; i++) {
			System.out.println(this.lottonumbers[i]+" ");
		}
		System.out.println();
	}
	
}

package class_quiz06;

public class Trump {

	private int pattern;
	private int number;

	// ����Ʈ ������
	public Trump() {

	}

	// getter, setter
	public int getPattern() {
		return pattern;
	}

	public void setPattern(int pattern) {
		this.pattern = pattern;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// ��ȯ
	public String trump() {

		if (this.pattern == 1) {
			return this.number + "��";
		} else if (this.pattern == 2) {
			return this.number + "��";
		} else if (this.pattern == 3) {
			return this.number + "��";
		} else {
			return this.number + "��";
		}
	}

}

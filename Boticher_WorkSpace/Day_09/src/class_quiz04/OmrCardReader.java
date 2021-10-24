package class_quiz04;

public class OmrCardReader {

	private OmrCard omrCard = new OmrCard();
	private int[] answer = new int[5];
	private int score;

	public OmrCardReader(OmrCard omrCard, int[] answer) {
		this.omrCard = omrCard;
		this.answer = answer;
		setScore(this.omrCard.getStuAnswer());
	}

	public OmrCard getOmrCard() {
		return omrCard;
	}

	public void setOmrCard(OmrCard omrCard) {
		this.omrCard = omrCard;
	}

	public int[] getAnswer() {
		return answer;
	}

	public void setAnswer(int[] answer) {
		this.answer = answer;
	}

	public void setScore(int[] stuAnswer) {
		int score = 0;
		for (int i = 0; i < this.answer.length; i++) {
			if (this.answer[i] == stuAnswer[i]) {
				score += 100 / this.answer.length;
			}
		}
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void disp() {
		System.out.println("이름 : " + omrCard.getName());
		System.out.println("학번 : " + omrCard.getStudentId());
		System.out.println("점수 : " + score);
	}

}

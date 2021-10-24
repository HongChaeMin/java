package abstaract_quiz01;

public class DollerToWon extends Converter {

	public DollerToWon(int ratio) {
		super(ratio);
	}

	@Override
	protected void printConverted() {
		System.out.println((int) super.result + " ¿ø");
	}

}

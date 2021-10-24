package abstaract_quiz01;

public class CmToInch extends Converter {

	public CmToInch() {
		super(0.39370);
	}
	
	@Override
	protected void printConverted() {
		System.out.println(super.result + " Inch");		
	}

}

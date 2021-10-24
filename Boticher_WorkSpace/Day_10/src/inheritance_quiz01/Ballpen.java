package inheritance_quiz01;

public class Ballpen extends Amount{

	// ¾ç, »ö
	
	private String color;
	
	public Ballpen(int amount, String color) {
		super(amount);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void disp() {
		super.disp();
		System.out.println("»ö : " + this.color);
	}
	
}

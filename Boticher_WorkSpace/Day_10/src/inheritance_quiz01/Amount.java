package inheritance_quiz01;

public class Amount {

	private int amount;

	public Amount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void disp() {
		System.out.println("¾ç : " + this.amount);
	}
	
}

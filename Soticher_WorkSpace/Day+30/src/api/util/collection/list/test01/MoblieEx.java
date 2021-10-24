package api.util.collection.list.test01;

public class MoblieEx extends Moblie {
	
	private String card;
	private int moth;
	
	public MoblieEx(String name, String telecom, int price, String card, int moth) {
		super(name, telecom, price);
		setCard(card);
		this.moth = moth;
	}
	
	public void setCard(String card) {
		this.card = card;
	}
	public String getCard() {
		return card;
	}
	public int getMoth() {
		return moth;
	}
	
	public void disp() {
		super.disp();
		System.out.println(getCard()+"\t"+getMoth()+"°³¿ù");
	}

}

package map_quizz01;

public class Goods {

	private String item;
	private int price;
	private String state;
	
	public Goods(String item, int price, String state) {
		this.item = item;
		this.price = price;
		this.state = state;
	}
	
	public String getItem() {
		return item;
	}
	
	public String getState() {
		return state;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void disp() {
		System.out.println("��ǰ�� : " + this.item + ", ���� : " + this.price + ", �ǸŻ��� : " + this.state);
	}
	
}

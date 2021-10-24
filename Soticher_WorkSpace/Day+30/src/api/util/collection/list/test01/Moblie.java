package api.util.collection.list.test01;

public class Moblie {

	private final String name;
	private String telecom;
	private int price;
	
	public Moblie(String name, String telecom, int price) {
		this.name = name;
		setTelecom(telecom);
		setPrice(price);
	}
	
	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	public void setPrice(int price) {
		if(price < 40) {
			System.out.println("가격을 잘못 입력하셨습니다");
			this.price = 40;
			return; 
		}
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getTelecom() {
		return telecom;
	}
	public int getPrice() {
		return price;
	}
	
	public void disp() {
		System.out.print(name+"\t"+telecom+"\t"+price+"만원\t");
	}
	
}

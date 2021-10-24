package oop.mobile;

public class Mobile {

	private String name;
	private String telecom;
	private int price;
	
	public void setDate(String _name, String _telecom, int _price) {
		name = _name;
		telecom = _telecom;
		price = _price;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	
	public void setTelecom(String _telecom) {
		telecom = _telecom;
	}
	
	public void setPrice(int _price) {
		price = _price;
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
		System.out.print(name+"\t"+telecom+"\t"+price+"¸¸¿ø");
		System.out.println();
	}
	
}

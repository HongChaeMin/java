package oop_test;

public class Mobile {

	private String name;
	private String telecom;
	private int price;
	private int max;
	private int arr[] = new int[3];
	
	public Mobile(String _name, String _telecom, int _price) {
		if(_price<=400000) {
			System.out.println("금액이 옳바르지 않습니다");
			setName(_name);
			telecom = _telecom;
			price = 400000;
			return;
		}
		setName(_name);
		telecom = _telecom;
		price = _price;
	}
	public Mobile() {
	}
	
	//setter
	private void setName(String _name) {
		name = _name;
	}
	public void setTelecom(String _telecom) {
		telecom = _telecom;
	}
	public void setPrice(int _price) {
		price = _price;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getTelecom(){
		return telecom;
	}
	public int getPrice() {
		return price;
	}
	
	public void disp() {
		System.out.println(getName()+"\t"+getTelecom()+"\t"+getPrice());
	}
	
	public int expensive(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public int expensive(int a, int b, int c) {
	int arr[] = {a, b, c};
	for(int i=0; i<arr.length; i++) {
		if(max < arr[i]) {
			max = arr[i];
		}
	}
	return max;
	}

	
	public void compare(Mobile m, Mobile n) {
		if(price < m.price && m.price < n.price) {
			n.disp();
		}else if(m.price < price && price < n.price) {
			n.disp();
		}
	}
	
}

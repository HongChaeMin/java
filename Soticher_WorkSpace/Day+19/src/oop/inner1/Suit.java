package oop.inner1;

public class Suit {

	int price;
	Bottom b = new Bottom();
	
	public void setPrice(int price) {
		this.price = price;
		b.price = price;
	}
	
	public class Top{
		int price;
		
		//Top의 생성자
		public Top(){
			
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getPrice() {
			return price;
		}
		
	}
	
	private class Bottom{
		int price;
		
	}
	
	
	
	
}

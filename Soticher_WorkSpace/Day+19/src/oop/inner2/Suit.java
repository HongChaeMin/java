package oop.inner2;

public class Suit {
	
	int price;
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void disp() {
		System.out.println("Suit price : "+getPrice());

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
		
		public void disp() {
			System.out.println("price : "+getPrice());
		}
		
	}

}

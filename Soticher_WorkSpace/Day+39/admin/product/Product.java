package product;

public class Product {

	private String name;
	private int quantity;
	private int price;

	public Product(String name, int price, int quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void disp() {
		System.out.println(getName() + "\t" + getPrice() + "¿ø\t" + getQuantity() + "°³");
	}

}

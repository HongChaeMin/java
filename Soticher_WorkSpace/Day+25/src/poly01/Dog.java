package poly01;

public class Dog extends Animal implements Eat,Bark{

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println("¸Ó¾ö¤·¸Û");
	}
	
	@Override
	public void eat() {
		System.out.println("»À´Ù±Í");
	}
	
}

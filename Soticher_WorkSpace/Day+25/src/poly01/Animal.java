package poly01;

public abstract class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void disp() {
		System.out.println("¿Ã∏ß : "+name);
	}
	
	public abstract void bark();
	
}

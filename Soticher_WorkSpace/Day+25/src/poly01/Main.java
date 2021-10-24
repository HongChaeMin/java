package poly01;

public class Main {

	public static void eat(Eat e) {
		e.eat();
	}
	
	public static void brak(Bark b) {
		b.bark();
	}
	
	public static void disp(Animal a) {
		a.disp();
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog("´ó´óÀÌ");
		Cat c = new Cat("³ªºñ");
		
		brak(d);
		brak(c);
		
		eat(d);
		eat(c);
		
		disp(d);
		disp(c);
		
		//Bark¸¦ ÀÍ¸í ÁßÃ¸Å¬·¡½º·Î °´Ã¼·Î ¸¸µé¾îº¸±â
		
		Bark b = new Bark() {

			public void bark() {
				System.out.println("¿Ð¿Ð¿Ð¿Ð¿Ð¿Í·Î¾Æ·Î¾Æ·Ø·Õ¿Ð");
				
			}
			
		};
	
		b.bark();
		
	}

}

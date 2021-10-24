package oop.poly;

public class Main {

	public static void eat(Dog d) {
		d.eat();
	}
	
	public static void eat(Cat c) {
		c.disp();
	}
	
	public static void bark(Animal a) {
		a.bark();
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog("´ó´óÀÌ");
		Cat c = new Cat("°íÎ¹Ì");
		
		eat(d);
		eat(c);
		
		bark(d);
		bark(c);
		

	}

}

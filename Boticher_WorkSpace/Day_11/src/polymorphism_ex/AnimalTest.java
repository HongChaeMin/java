package polymorphism_ex;

public class AnimalTest {

	public static void main(String[] args) {

		/*
		 * Animal animal = new Animal(); 기존에 객체 만들던 방법 up casting (업캐스팅) : 자식 -> 부모로 캐스팅
		 * 1. 부모 클래스의 메소드를 사용할 수 있다 2. 부모 클래스에 있는 메소드를 오버라이드 한 메소드를 사용할 수 있다 3. 자식 클래스에만
		 * 있는 메소드는 사용 할 수 없다
		 */

		Animal animal = new Cat(); // or Animal animal = (Animal) new Cat(); 생략 가능
		animal.eat();
		animal.cry();
		// animal.grooming(); 3번 특징 때문에 사용 불가

		Animal animal2 = new Dog();
		animal2.eat();
		animal2.cry();
		// animal2.rash(); 부모는 자식 맘 모른다~~~!!!!

		/*
		 * down casting (다운 캐스팅) : 부모 -> 자식으로 캐스팅
		 * 
		 */
		if (animal2 instanceof Dog) {
			Dog dog = (Dog) animal2;
			dog.cry();
			dog.eat();
			dog.lash();
		} else if(animal2 instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.cry();
			cat.eat();
			cat.grooming();
		}
	}

}

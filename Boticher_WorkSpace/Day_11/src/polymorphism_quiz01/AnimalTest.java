package polymorphism_quiz01;

public class AnimalTest {

	public static void main(String[] args) {

		Animal[] animals = new Animal[2];
		animals[0] = new Cat();
		animals[1] = new Dog();

		for (int i = 0; i < animals.length; i++) {
			for (int j = 0; j < 3; j++) {
				animals[i].weeping();
			}
		}

		if (animals[0] instanceof Cat) {
			Cat cat = (Cat) animals[0];
			cat.grooming();
		}

		if (animals[1] instanceof Dog) {
			Dog dog = (Dog) animals[1];
			dog.tail();
		}

	}

}

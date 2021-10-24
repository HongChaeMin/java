package polymorphism_ex;

public class AnimalTest {

	public static void main(String[] args) {

		/*
		 * Animal animal = new Animal(); ������ ��ü ����� ��� up casting (��ĳ����) : �ڽ� -> �θ�� ĳ����
		 * 1. �θ� Ŭ������ �޼ҵ带 ����� �� �ִ� 2. �θ� Ŭ������ �ִ� �޼ҵ带 �������̵� �� �޼ҵ带 ����� �� �ִ� 3. �ڽ� Ŭ��������
		 * �ִ� �޼ҵ�� ��� �� �� ����
		 */

		Animal animal = new Cat(); // or Animal animal = (Animal) new Cat(); ���� ����
		animal.eat();
		animal.cry();
		// animal.grooming(); 3�� Ư¡ ������ ��� �Ұ�

		Animal animal2 = new Dog();
		animal2.eat();
		animal2.cry();
		// animal2.rash(); �θ�� �ڽ� �� �𸥴�~~~!!!!

		/*
		 * down casting (�ٿ� ĳ����) : �θ� -> �ڽ����� ĳ����
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

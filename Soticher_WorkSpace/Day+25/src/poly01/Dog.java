package poly01;

public class Dog extends Animal implements Eat,Bark{

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println("�Ӿ�����");
	}
	
	@Override
	public void eat() {
		System.out.println("���ٱ�");
	}
	
}

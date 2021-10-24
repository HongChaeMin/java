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
		
		Dog d = new Dog("�����");
		Cat c = new Cat("����");
		
		brak(d);
		brak(c);
		
		eat(d);
		eat(c);
		
		disp(d);
		disp(c);
		
		//Bark�� �͸� ��øŬ������ ��ü�� ������
		
		Bark b = new Bark() {

			public void bark() {
				System.out.println("�пппппͷξƷξƷطտ�");
				
			}
			
		};
	
		b.bark();
		
	}

}

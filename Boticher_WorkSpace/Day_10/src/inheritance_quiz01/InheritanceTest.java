package inheritance_quiz01;

public class InheritanceTest {

	public static void main(String[] args) {
		
		SharpPencil sharpPencil = new SharpPencil(4, 1);
		Ballpen ballpen = new Ballpen(3, "RED");
		FountainPen fountainpen = new FountainPen(5, "BLUE");
		
		System.out.println("����");
		sharpPencil.disp();
		
		System.out.println("����");
		ballpen.disp();
		
		System.out.println("������");
		fountainpen.disp();
		
	}

}

package class_ex01;

public class CellphoneTest {

	public static void main(String[] args) {
		
		// �ǽ��� �帧
		Cellphone c1 = new Cellphone();
		c1.maker = "apple";
		c1.model = "iphoneXr";
		c1.color = "whith";
		c1.price = 800000;
		
		System.out.println(c1.maker);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.price);

		// �׳� 100���� ������
		Cellphone[] cellphones = new Cellphone[100];
		for(int i=0; i<100; i++) {
			cellphones[i] = new Cellphone();
		}
		
		c1.maker = "samsung";
		c1.model = "zflip";
		System.out.println(c1.maker);
		System.out.println(c1.model);
		
	}

}

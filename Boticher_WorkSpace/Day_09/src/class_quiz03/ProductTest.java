package class_quiz03;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("유통기한 (yyyy-mm-dd) : ");
		String shelfLife = sc.next();
		
		Product pr1 = new Product(name, price, shelfLife);
		
		pr1.pricesDisp(5);
		pr1.pricesDisp(13);
		pr1.shelfLife();
		
	}

}

package admin;

import java.util.*;
import product.Product;
import product.file.FileIo;

public class AdminMain {

	Scanner sc = new Scanner(System.in);

	List<Product> list = new ArrayList<>();
	FileIo file = new FileIo();

	public AdminMain() throws Exception {

		boolean check = true;

		while (check) {
			System.out.println("1. 상품 등록\t2. 상품 확인\t3. 종료");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("상품 이름 : ");
				String name = sc.next();
				System.out.print("상품 가격 : ");
				int price = sc.nextInt();
				System.out.print("상품 수량 : ");
				int quantity = sc.nextInt();
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getName().equals(name)) {
						System.out.println("같은 이름의 상품이 있습니다");
						System.out.println("적어주신 정보로 변경하시겠습니까?");
					}
				}
				list.add(new Product(name, price, quantity));
				file.fileOutput(list);
				break;
			case 2:
				list = file.fileInput();
				for (int i = 0; i < list.size(); i++) {
					list.get(i).disp();
				}
				break;
			case 3:
				System.out.println("시스템을 종료합니다");
				check = false;
				break;
			}
		}
	}


}

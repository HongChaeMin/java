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
			System.out.println("1. ��ǰ ���\t2. ��ǰ Ȯ��\t3. ����");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("��ǰ �̸� : ");
				String name = sc.next();
				System.out.print("��ǰ ���� : ");
				int price = sc.nextInt();
				System.out.print("��ǰ ���� : ");
				int quantity = sc.nextInt();
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getName().equals(name)) {
						System.out.println("���� �̸��� ��ǰ�� �ֽ��ϴ�");
						System.out.println("�����ֽ� ������ �����Ͻðڽ��ϱ�?");
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
				System.out.println("�ý����� �����մϴ�");
				check = false;
				break;
			}
		}
	}


}

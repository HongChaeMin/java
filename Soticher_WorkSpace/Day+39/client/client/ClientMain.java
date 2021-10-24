package client;

import java.util.*;

import client_product.clientProduct;
import client_product.file.clientFileIo;
import product.Product;

public class ClientMain {

	@SuppressWarnings("unused")

	Scanner sc = new Scanner(System.in);

	List<clientProduct> clientList = new ArrayList<>();
	List<clientProduct> list = new ArrayList<>();
	clientFileIo file = new clientFileIo();

	@SuppressWarnings("unused")
	public ClientMain() {

		boolean check = true;

		while (check) {
			System.out.println("1. ��ǰ ����\t 2. ��ٱ��� ����\t 3. �����ϱ�\t 4. ����");
			switch (sc.nextInt()) {
			case 1:
				list = file.fileInput();
				for (int i = 1; i <= list.size(); i++) {
					System.out.print("(" + i + ") ");
					list.get(i - 1).disp();
				}
				System.out.println("1. ��ٱ��� ��� \t 2. ���ư���");
				int c = sc.nextInt();
				boolean on = true;
				boolean on1 = true;
				boolean on2 = true;
				if (c == 1) {
					System.out.print("��ٱ��Ͽ� ���� ��ǰ�� �Է��ϼ��� : ");
					String name = sc.next();
					System.out.print("��ǰ�� ������ �Է��ϼ��� : ");
					int quantity = sc.nextInt();
					for (int i = 0; i < clientList.size(); i++) {
						if (clientList.get(i).getName().equals(name)) {
							System.out.println("�̹� ���� ��ǰ�� ����ֽ��ϴ� �ٽ� �����ðڽ��ϱ�?");
							System.out.println("1. �� \t 2. �ƴϿ�");
							int y = sc.nextInt();
							on = false;
							if (y == 1) {
								for (int j = 0; j < list.size(); j++) {
									if (list.get(j).getName().equals(clientList.get(i).getName())
											&& list.get(j).getQuantity() >= quantity) {
										clientList.remove(i);
										clientList.add(i, new clientProduct(list.get(j).getName(),
												list.get(j).getPrice() * quantity, quantity));
										System.out.println("��ٱ��� ��ǰ�� �����Ǿ����ϴ�");
										on2 = false;
										on1 = false;
										break;
									}
								}
								if (on2) {
									on1 = false;
									System.out.println("������ �߸� �Է��ϼ̽��ϴ�");
								}
							} else if (y == 2) {
								break;
							}
						}
					}
					if (on) {
						for (int i = 0; i < list.size(); i++) {
							if (list.get(i).getName().equals(name) && list.get(i).getQuantity() >= quantity) {
								clientList.add(new clientProduct(name, list.get(i).getPrice() * quantity, quantity));
								System.out.println("��ٱ��Ͽ� ��ǰ�� �����ϴ�");
								on1 = false;
							}
						}
					}
					if (on1) {
						System.out.println("�̸� �Ǵ� ������ �߸� �Է��ϼ̽��ϴ�");
					}
				}
				break;
			case 2:
				for (int i = 1; i <= clientList.size(); i++) {
					System.out.print("(" + i + ") ");
					clientList.get(i - 1).disp();
				}
				break;
			case 3:
				int price = 0;
				for (int i = 0; i < clientList.size(); i++) {
					price += clientList.get(i).getPrice();
				}
				System.out.println("�� ��ǰ�� ��� : " + price + "��");
				System.out.println("1. �����ϱ� \t 2. ���ư���");
				int n = sc.nextInt();
				if (n == 1) {
					List<clientProduct> finalList = new ArrayList<>();
					for (int i = 0; i < list.size(); i++) {
						for (int j = 0; j < clientList.size(); j++) {
							if (list.get(i).getName().equals(clientList.get(j).getName())) {
								int quantity = list.get(i).getQuantity() - clientList.get(j).getQuantity();
								finalList.add(
										new clientProduct(list.get(i).getName(), list.get(i).getPrice(), quantity));
								break;
							} else {
								finalList.add(list.get(i));
								break;
							}
						}
					}
					file.fileOutput(finalList);
					clientList = new ArrayList<>();
					finalList = null;
					System.out.println("������ �Ϸ� �Ǿ����ϴ�");
				}
				break;
			case 4:
				System.out.println("�ý����� �����մϴ�");
				check = false;
				break;
			}
		}
	}

}

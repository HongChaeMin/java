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
			System.out.println("1. 상품 보기\t 2. 장바구니 보기\t 3. 결제하기\t 4. 종료");
			switch (sc.nextInt()) {
			case 1:
				list = file.fileInput();
				for (int i = 1; i <= list.size(); i++) {
					System.out.print("(" + i + ") ");
					list.get(i - 1).disp();
				}
				System.out.println("1. 장바구니 담기 \t 2. 돌아가기");
				int c = sc.nextInt();
				boolean on = true;
				boolean on1 = true;
				boolean on2 = true;
				if (c == 1) {
					System.out.print("장바구니에 담을 상품을 입력하세요 : ");
					String name = sc.next();
					System.out.print("상품의 수량을 입력하세요 : ");
					int quantity = sc.nextInt();
					for (int i = 0; i < clientList.size(); i++) {
						if (clientList.get(i).getName().equals(name)) {
							System.out.println("이미 같은 상품이 담겨있습니다 다시 담으시겠습니까?");
							System.out.println("1. 예 \t 2. 아니요");
							int y = sc.nextInt();
							on = false;
							if (y == 1) {
								for (int j = 0; j < list.size(); j++) {
									if (list.get(j).getName().equals(clientList.get(i).getName())
											&& list.get(j).getQuantity() >= quantity) {
										clientList.remove(i);
										clientList.add(i, new clientProduct(list.get(j).getName(),
												list.get(j).getPrice() * quantity, quantity));
										System.out.println("장바구니 상품이 수정되었습니다");
										on2 = false;
										on1 = false;
										break;
									}
								}
								if (on2) {
									on1 = false;
									System.out.println("수량을 잘못 입력하셨습니다");
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
								System.out.println("장바구니에 상품이 담겼습니다");
								on1 = false;
							}
						}
					}
					if (on1) {
						System.out.println("이름 또는 수량을 잘못 입력하셨습니다");
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
				System.out.println("총 상품의 비용 : " + price + "원");
				System.out.println("1. 결제하기 \t 2. 돌아가기");
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
					System.out.println("결제가 완료 되었습니다");
				}
				break;
			case 4:
				System.out.println("시스템을 종료합니다");
				check = false;
				break;
			}
		}
	}

}

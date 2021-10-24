package map_quizz01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

enum uqdate{
	ITEM,
	PRICE,
	STATE
	
	
}

public class Market {

	private List<Goods> list = new ArrayList<>();

	public void create(Goods goods) {
		if (goods.getState().equals("판매중") || goods.getState().equals("판매완료") || goods.getState().equals("예약중")) {
			for (Goods protacted : this.list) {
				if (goods.getItem().equals(protacted.getItem())) {
					System.out.println("등록된 상품이 존재합니다");
					return;
				}
			}
			this.list.add(goods);
			System.out.println("등록되었습니다");
		} else {
			System.out.println("판매 상태가 유효하지 않습니다");
		}
	}

	public void read() {
		if (this.list.isEmpty()) {
			System.out.println("비어있습니다");
			return;
		}
		for (Goods protacted : this.list) {
			protacted.disp();
		}
	}

	public void update(String item, int price) {
		
		boolean check = true;
		
		if (this.list.isEmpty()) {
			System.out.println("수정할 상품이 존재하지 않습니다");
			return;
		} else {
			for(Goods protacted : this.list) {
				if(protacted.getItem().equals(item)) {
					protacted.setPrice(price);
					System.out.println("수정 되었습니다");
					check = false;
					break;
				}
			}
		}
		
		if(check) {
			System.out.println("상품을 잘못입력하셨습니다");
		}
		
	}

	public void update(String item, String state) {
		
		if (this.list.isEmpty()) {
			System.out.println("수정할 상품이 존재하지 않습니다");
			return;
		} else {
			if(state.equals("판매 중") || state.equals("판매 완료") || state.equals("예약 중")) {
				for(Goods protacted : this.list) {
					if(protacted.getItem().equals(item)) {
						protacted.setState(state);;
						System.out.println("수정 되었습니다");
						break;
					}
				}
			}else {
				System.out.println("판매 상태가 유효하지 않습니다");
			}
			
		}

	}
	
	public void delete(String item) {
		if(this.list.isEmpty()) {
			System.out.println("삭제할 상품이 존재하지 않습니다");
			return;
		}
		Iterator<Goods> iter = this.list.iterator();
		while(iter.hasNext()) {
			Goods protacted = iter.next();
			if(protacted.getItem().equals(item)) {
				iter.remove();
				System.out.println("삭제 되었습니다");
				break;
			}
		}
	}

}

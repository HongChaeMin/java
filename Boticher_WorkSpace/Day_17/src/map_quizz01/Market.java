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
		if (goods.getState().equals("�Ǹ���") || goods.getState().equals("�ǸſϷ�") || goods.getState().equals("������")) {
			for (Goods protacted : this.list) {
				if (goods.getItem().equals(protacted.getItem())) {
					System.out.println("��ϵ� ��ǰ�� �����մϴ�");
					return;
				}
			}
			this.list.add(goods);
			System.out.println("��ϵǾ����ϴ�");
		} else {
			System.out.println("�Ǹ� ���°� ��ȿ���� �ʽ��ϴ�");
		}
	}

	public void read() {
		if (this.list.isEmpty()) {
			System.out.println("����ֽ��ϴ�");
			return;
		}
		for (Goods protacted : this.list) {
			protacted.disp();
		}
	}

	public void update(String item, int price) {
		
		boolean check = true;
		
		if (this.list.isEmpty()) {
			System.out.println("������ ��ǰ�� �������� �ʽ��ϴ�");
			return;
		} else {
			for(Goods protacted : this.list) {
				if(protacted.getItem().equals(item)) {
					protacted.setPrice(price);
					System.out.println("���� �Ǿ����ϴ�");
					check = false;
					break;
				}
			}
		}
		
		if(check) {
			System.out.println("��ǰ�� �߸��Է��ϼ̽��ϴ�");
		}
		
	}

	public void update(String item, String state) {
		
		if (this.list.isEmpty()) {
			System.out.println("������ ��ǰ�� �������� �ʽ��ϴ�");
			return;
		} else {
			if(state.equals("�Ǹ� ��") || state.equals("�Ǹ� �Ϸ�") || state.equals("���� ��")) {
				for(Goods protacted : this.list) {
					if(protacted.getItem().equals(item)) {
						protacted.setState(state);;
						System.out.println("���� �Ǿ����ϴ�");
						break;
					}
				}
			}else {
				System.out.println("�Ǹ� ���°� ��ȿ���� �ʽ��ϴ�");
			}
			
		}

	}
	
	public void delete(String item) {
		if(this.list.isEmpty()) {
			System.out.println("������ ��ǰ�� �������� �ʽ��ϴ�");
			return;
		}
		Iterator<Goods> iter = this.list.iterator();
		while(iter.hasNext()) {
			Goods protacted = iter.next();
			if(protacted.getItem().equals(item)) {
				iter.remove();
				System.out.println("���� �Ǿ����ϴ�");
				break;
			}
		}
	}

}
package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();
		strList.add("apple");
		strList.add("banana");
		strList.add("grape");

		// 1. index ������� ���
		// ������ : ��Ҹ� �߰��� �����ϸ� ������ ����� (����� ������ �Ǳ� ������)
		System.out.println("-----for-----");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
			
			// ���࿡ b�� �����ϸ� �������
			String fruit = strList.get(i);
			if(fruit.startsWith("b")) {
				strList.remove(i);
				i--; // ���� �� �� �� �� �� ������ ���� 
			}
		}

		// 2. Iterator ����ϱ�
		System.out.println("-----iterator-----");
		
		Iterator<String> iter = strList.iterator();
		
		while(iter.hasNext()) {
			String frit = iter.next(); // next() ȣ���� �� ���� �Һ� �ǹǷ� �ݺ������� �� �� �� �����ϴ� ��
			System.out.println(frit);
			
			if(frit.startsWith("b")) {
				iter.remove(); // ����Ʈ���� ������ �ƴ϶� �ݵ�� iterator�� remove�� ������� �Ѵ�
			}
		}
		
		// 3. ���� for������ ������
		System.out.println("-----���� for-----");
		for(String fruit : strList) {
			System.out.println(fruit);
			
			if(fruit.startsWith("b")) {
				strList.remove(fruit);
			}
		}
		
	}

}

package list_ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(3);
		list.add(9);
		list.add(1);
		
		// List�� ���� 5�� ����ִ°�?
		boolean contatnValue = list.contains(5);
		System.out.println(contatnValue);
		System.out.println(list.contains(7));
		
		// �������� �����ϱ�
		list.sort(Comparator.naturalOrder()); // return ���� �ʾƵ� ���ĵǾ� ����ȴ�
		System.out.println(list);
		
		// �������� �����ϱ�
		list.sort(Comparator.reverseOrder()); // ����
		System.out.println(list);
		 
		// List�� ���� ����ִ°� ?
		System.out.println("����Ʈ�� ����ִ°� ? : " + list.isEmpty());
		
		list.clear();
		System.out.println("����Ʈ�� ����ִ°� ? : " + list.isEmpty());
		System.out.println(list);
	}

}

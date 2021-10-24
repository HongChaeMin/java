package api.util.cellection.list;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();

		//Integer - int : ������
		
		for(int i=1; i<=10; i++) {
			list.add(i);// �߰��� int/Integer ����(auto - boxing)
		}
		
		System.out.println(list);
		//List�� ��� Collections��� ���� Ŭ������ ������ �޾� �پ��� ó���� ������ �� �ִ�
		//ex) Arrays Ŭ����
		
		//[1] ������ ���� ���		.shuffle()
		Collections.shuffle(list);
		System.out.println(list);
		
		//[2] ������ ���		.reverse()
		Collections.reverse(list);
		System.out.println(list);
		
		//[3] ���� ���		.sort()
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}

package api.util.collection.list;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		
		
		//��ü �迭 ����
//		Mobile[] m = new Mobile[3];
//		
//		m[0] = new Mobile("������xr", "LG", 400000);
//		
//		Mobile[] m1 = new Mobile[] {
//			new Mobile("iphoen7", "lg", 410000)
//		};
		
		//Mobile Ŭ������ ������ List�� ��� �������
		List<Mobile> list = new ArrayList<>();
		
		//list�� Mobile�� �߰�(��ü �߰�)
		list.add(new Mobile("V20", "LG", 500000));
		list.add(new Mobile("G5", "SK", 600000));
		list.add(new Mobile("IP", "LG", 450000));
		
		//System.out.println(list);
		
		Mobile a = list.get(0);
		Mobile b = list.get(1);
		Mobile c = list.get(2);
		
		a.compare(b, c);
		//�� ���� ��
		list.get(0).compare(list.get(1), list.get(2));
		
		for(int i=0; i<list.size(); i++) {
			Mobile s = list.get(i); //list�ȿ� �ִ� ��ü�� get�ؼ� Mobile s ���������� ����
			System.out.println(s); //a.String()�� ����
			s.disp();//s�� �ϳ��� ��ü�� ��ұ� ������ disp�޼ҵ带 �����
		}
		
	}

}

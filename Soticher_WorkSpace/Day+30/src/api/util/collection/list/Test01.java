package api.util.collection.list;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		
		
		//객체 배열 선언
//		Mobile[] m = new Mobile[3];
//		
//		m[0] = new Mobile("아이폰xr", "LG", 400000);
//		
//		Mobile[] m1 = new Mobile[] {
//			new Mobile("iphoen7", "lg", 410000)
//		};
		
		//Mobile 클래스를 저장할 List는 어떻게 만드는지
		List<Mobile> list = new ArrayList<>();
		
		//list에 Mobile을 추가(객체 추가)
		list.add(new Mobile("V20", "LG", 500000));
		list.add(new Mobile("G5", "SK", 600000));
		list.add(new Mobile("IP", "LG", 450000));
		
		//System.out.println(list);
		
		Mobile a = list.get(0);
		Mobile b = list.get(1);
		Mobile c = list.get(2);
		
		a.compare(b, c);
		//한 번에 ↓
		list.get(0).compare(list.get(1), list.get(2));
		
		for(int i=0; i<list.size(); i++) {
			Mobile s = list.get(i); //list안에 있는 객체를 get해서 Mobile s 참조변수에 넣음
			System.out.println(s); //a.String()과 동일
			s.disp();//s가 하나의 객체를 담았기 때문에 disp메소드를 사용함
		}
		
	}

}

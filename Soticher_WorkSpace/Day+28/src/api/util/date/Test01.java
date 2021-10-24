package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		//Date		시스템 시간을 구하는 클래스
		
		Date a = new Date();
//		Date b = new Date(2017,5,9);
//		System.out.println(b);
		
		System.out.println(a.toString());
		
		Format f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//원하는 방식대로 출력하는 것을 만들어주는 과정
		String time = f.format(a);
		System.out.println(time);
		
	}

}

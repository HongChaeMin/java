package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		//Date		�ý��� �ð��� ���ϴ� Ŭ����
		
		Date a = new Date();
//		Date b = new Date(2017,5,9);
//		System.out.println(b);
		
		System.out.println(a.toString());
		
		Format f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//���ϴ� ��Ĵ�� ����ϴ� ���� ������ִ� ����
		String time = f.format(a);
		System.out.println(time);
		
	}

}

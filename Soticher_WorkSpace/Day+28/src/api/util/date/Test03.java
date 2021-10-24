package api.util.date;

import java.text.DecimalFormat;
import java.text.Format;

public class Test03 {

	public static void main(String[] args) {
		//Format		����
		//SimpleDateFormat		��¥ ����
		//DecimalFormat			���� ����
		
		int a = 12345678;
		double b = 1234.5678;
		
		//#		���ڸ� �� �ڸ��� ����(������ X)
		//0		���ڸ� �� �ڸ��� ����(��� O)
		
		Format f1 = new DecimalFormat("#,###.##");
		System.out.println(f1.format(a));
		System.out.println(f1.format(b));
		
		Format f2 = new DecimalFormat("0,000.00");
		System.out.println(f2.format(a));
		System.out.println(f2.format(b));
		int otp = (int)(Math.random()*100000);
		Format f = new DecimalFormat("000000");///######���� �� ���� �տ� 0�̶�� ���ڰ� ���� �ʴ´�
		System.out.println(f.format(otp));
		

	}

}

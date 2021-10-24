package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test02 {

	public static void main(String[] args) {
		//����(Locale)����
		Locale.setDefault(Locale.CHINA);
		
		while(true) {
			Date d = new Date();
			
			String text = "������ y�� M�� d�� E a h�� m�� s�� �Դϴ�";
			Format f = new SimpleDateFormat(text);
			System.out.println(f.format(d));
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}

}

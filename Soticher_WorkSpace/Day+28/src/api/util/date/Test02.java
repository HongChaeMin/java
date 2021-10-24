package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test02 {

	public static void main(String[] args) {
		//지역(Locale)설정
		Locale.setDefault(Locale.CHINA);
		
		while(true) {
			Date d = new Date();
			
			String text = "오늘은 y년 M월 d일 E a h시 m분 s초 입니다";
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

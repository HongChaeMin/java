package fileio_ex;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		// 파일 쓰기
		FileOutputStream fos = new FileOutputStream("output.txt", false);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bf = new BufferedWriter(osw);
		
		String text = "안녕하세요\n제 이름은 코난, 탐정이죠";
		bf.write(text);
		bf.close();
		
		
	}

}

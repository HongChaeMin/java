package api.io.string;

import java.io.*;

public class Test01 {

	public static void main(String[] args) throws IOException {
		// 문자열 출력
		File target = new File("files", "string1.txt");

		// 통로 생성
		OutputStream out = new FileOutputStream(target);
		
		String text = "안녕하세요 Java시간입니다";
		//out.write(text);
		
		byte[] data = text.getBytes(); // String -> byte 변환
		out.write(data);
		
		//통로 폐기
		out.close();
		
	}

}

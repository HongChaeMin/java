package api.io.string;

import java.io.*;

public class Test01 {

	public static void main(String[] args) throws IOException {
		// ���ڿ� ���
		File target = new File("files", "string1.txt");

		// ��� ����
		OutputStream out = new FileOutputStream(target);
		
		String text = "�ȳ��ϼ��� Java�ð��Դϴ�";
		//out.write(text);
		
		byte[] data = text.getBytes(); // String -> byte ��ȯ
		out.write(data);
		
		//��� ���
		out.close();
		
	}

}

package fileio_ex;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		// ���� ����
		FileOutputStream fos = new FileOutputStream("output.txt", false);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bf = new BufferedWriter(osw);
		
		String text = "�ȳ��ϼ���\n�� �̸��� �ڳ�, Ž������";
		bf.write(text);
		bf.close();
		
		
	}

}
package api.io.string;

import java.io.*;
import java.util.*;

public class Test02 {

	public static void main(String[] args) throws Exception {
		// ���ڿ��� ���� ��θ� �̿��Ͽ� ���ϰ� ��/���
		
		File target = new File("files", "string2.txt");
		
		//Writer, PrintWriter�� ���� ���ϼ��ۿ� ����
		//Writer�� Writer�� �ᵵ �Ǵµ� PrintWriter������ ���� ��ߵ�
		Writer out = new FileWriter(target);
		PrintWriter printer = new PrintWriter(out);
		
		out.write("java\n");
		out.write("����\n");
		out.write("��~\n");
		
		printer.println("java�ð�");
		printer.println();
		printer.println();
		printer.println("�ȳ��ϼ���");
		
		out.close();
		printer.close();
		
		
	}

}

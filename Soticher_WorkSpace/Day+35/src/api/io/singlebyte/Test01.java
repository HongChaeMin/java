package api.io.singlebyte;

import java.io.*;

public class Test01 {
	
	public static void main(String[] args) throws IOException{
		
		File target = new File("files", "single.txt");
	
		//target�� ���� �ۼ�(���)
		OutputStream out = new FileOutputStream(target); // Scanner����...
		//CPU -> out -> target            -> ���� ����
		
		//out���� byte������ �����͸� ����
		out.write(65);
		out.write(66);
		out.write(97);
		out.write('b');//98
		
		//�� ����� ��δ� ���
		out.close();
		System.out.println("ó�� �Ϸ�");
		
	}

}
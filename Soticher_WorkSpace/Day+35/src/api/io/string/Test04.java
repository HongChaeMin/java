package api.io.string;

import java.io.*;

public class Test04 {

	public static void main(String[] args) throws Exception {
		
		File target = new File("files", "string2.txt");
		
		Reader in = new FileReader(target);

		BufferedReader buffer = new BufferedReader(in);
		
		//CPU <- buffer <- in <- target <- "string2.txt"
		
		//buffer�� �̿��Ͽ� �� �پ� �б�
		//.readLine()    �� ���� �о���� ���
		
		while(true) {
			String text = buffer.readLine();
			if(text == null) break; //EOF
			System.out.println(text);
		}
		
	}

}

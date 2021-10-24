package api.io.string;

import java.io.*;

public class Test03 {

	public static void main(String[] args) throws Exception {
		
		File target = new File("files", "string2.txt");
		Reader in = new FileReader(target);

		char[] cart = new char[10];
		while(true) {
			int n= in.read(cart);
			if(n == -1) break;
			System.out.println(new String(cart,0,n)); // String 형으로 바꿔 출력
		}
		in.close();
	}

}

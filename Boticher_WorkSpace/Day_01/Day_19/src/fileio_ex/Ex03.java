package fileio_ex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/fileio_ex/input.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);

		String line = br.readLine();
		Integer saceSount = Integer.valueOf(line);

		for (int i = 0; i < saceSount; i++) {
			String text = br.readLine();
			String[] check = text.split(" ");
			if(check[0].equals(check[1])) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}

	}

}

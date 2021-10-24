package fileio_quiz01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz01 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/fileio_quiz01/input.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			String text = br.readLine();
			String[] xy = text.split(" ");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);

			disp(x, y);

		}

	}
	
	public static void disp(int x, int y) {
		if (x > 0 && y > 0) {
			System.out.println("제 1사분면");
		} else if (x < 0 && y > 0) {
			System.out.println("제 2사분면");
		} else if (x < 0 && y < 0) {
			System.out.println("제 3사분면");
		} else {
			System.out.println("제 4사분면");
		}
	}

}

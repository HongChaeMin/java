package fileio_quiz01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Quiz03 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("src/fileio_quiz01/input2.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			String line = br.readLine();
			String[] arr = line.split("");

			for (int j = 0; j < arr.length / 2; j++) {
				String temp = arr[j];
				arr[j] = arr[arr.length - j - 1];
				arr[arr.length - j - 1] = temp;
			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}

	}
}

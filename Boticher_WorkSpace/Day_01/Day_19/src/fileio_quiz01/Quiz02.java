package fileio_quiz01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz02 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/fileio_quiz01/input1.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);

		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			String line = br.readLine();
			String[] num = line.split(" ");
			double sum = 0;
			for(int j=0; j<num.length; j++) {
				if(num[j].equals("@")) {
					sum *= 3.0;
				} else if(num[j].equals("%")) {
					sum += 5.0;
				} else if(num[j].equals("#")) {
					sum -= 7.0;
				} else {
					sum += Double.parseDouble(num[j]);
				}
			}
			System.out.println(Math.round(sum * 100) / 100.0);
		}
		
	}

}

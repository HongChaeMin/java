package api.io.singlebyte;

import java.io.*;

public class Test03 {

	public static void main(String[] args) throws IOException {
		
		File target = new File("files", "single.txt");
		File target1 = new File("files", "single1.txt");
		OutputStream out = new FileOutputStream(target);
		OutputStream out1 = new FileOutputStream(target1);
		
		//out.write("Hello"); String 형 error //2byte 이상
		//out.write(1.234); 소수 error // 8byte
		
		//out에게 byte단위의 데이터를 전송
		out.write(70);
		out.write(85);
		out.write(67);
		out.write(75);
		//다 사용한 통로 폐기
		out.close();
		
		InputStream in = new FileInputStream(target);
		InputStream in1 = new FileInputStream(target1);
		
		int n;
		while(true) {
			n = in.read();
			if(n == -1) break;
			System.out.print((char)n);
		}
		System.out.println();
		in.close();
		
		out1.write(89);
		out1.write(79);
		out1.write(85);
		out1.close();
		
		while(true) {
			n = in1.read();
			if(n == -1) break;
			System.out.print((char)n);
		}
		in1.close();
		
	}

}

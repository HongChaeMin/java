package api.io.string;

import java.io.*;
import java.util.*;

public class Test02 {

	public static void main(String[] args) throws Exception {
		// 문자열을 전용 통로를 이용하여 편하게 입/출력
		
		File target = new File("files", "string2.txt");
		
		//Writer, PrintWriter는 같이 쓰일수밖에 없음
		//Writer는 Writer만 써도 되는데 PrintWriter쓰려면 같이 써야됨
		Writer out = new FileWriter(target);
		PrintWriter printer = new PrintWriter(out);
		
		out.write("java\n");
		out.write("수업\n");
		out.write("끝~\n");
		
		printer.println("java시간");
		printer.println();
		printer.println();
		printer.println("안녕하세요");
		
		out.close();
		printer.close();
		
		
	}

}

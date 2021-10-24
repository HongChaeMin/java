package api.io.singlebyte;

import java.io.*;

public class Test01 {
	
	public static void main(String[] args) throws IOException{
		
		File target = new File("files", "single.txt");
	
		//target에 내용 작석(출력)
		OutputStream out = new FileOutputStream(target); // Scanner같음...
		//CPU -> out -> target            -> 실제 파일
		
		//out에게 byte단위의 데이터를 전송
		out.write(65);
		out.write(66);
		out.write(97);
		out.write('b');//98
		
		//다 사용한 통로는 폐기
		out.close();
		System.out.println("처리 완료");
		
	}

}

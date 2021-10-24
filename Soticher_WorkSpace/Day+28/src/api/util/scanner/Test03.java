package api.util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		//파일 읽는 스캐너
		File target = new File("sample.txt");//파일 객체
		try {
			Scanner s = new Scanner(target);
			
			while(s.hasNextLine()) {//문장
				System.out.println(s.nextLine());//문장 전체를 출력
			}
			s.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다");
			e.printStackTrace();
		}

	}

}

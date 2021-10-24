package api.io.string;

import java.io.*;
import java.util.*;

public class Test05 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		File target = new File("files", "mamber.txt");
		
		Writer out = new FileWriter(target);
		PrintWriter printer = new PrintWriter(out);
				
		boolean cheak = true;
		String id, pw;
		
		while(cheak){
			System.out.print("아이디 입력 : "); id = sc.next();
			System.out.print("비밀번호 입력 : "); pw = sc.next();
			if(check(id)) {
				System.out.println("중복된 아이디 입니다");
			}else {
				printer.println(id+"/"+pw);
				printer.flush(); // close를 안해도 입력 할 수 있게 해줌
				System.out.println("등록 성공");
			}
		}
	}

	public static boolean check(String id) throws Exception {
		Reader in = new FileReader(new File("files", "mamber.txt"));
		Scanner s1 = new Scanner(in);
		s1.useDelimiter("[/\n]");
		while(s1.hasNext()) { // 다음 단어가 있는지
			if(s1.next().equals(id)) { // 아이디와 비교
				s1.close();
				return true;
			}
		}
		s1.close();
		return false;
	}
	
}

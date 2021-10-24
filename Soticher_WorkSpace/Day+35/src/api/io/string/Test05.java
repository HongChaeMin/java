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
			System.out.print("���̵� �Է� : "); id = sc.next();
			System.out.print("��й�ȣ �Է� : "); pw = sc.next();
			if(check(id)) {
				System.out.println("�ߺ��� ���̵� �Դϴ�");
			}else {
				printer.println(id+"/"+pw);
				printer.flush(); // close�� ���ص� �Է� �� �� �ְ� ����
				System.out.println("��� ����");
			}
		}
	}

	public static boolean check(String id) throws Exception {
		Reader in = new FileReader(new File("files", "mamber.txt"));
		Scanner s1 = new Scanner(in);
		s1.useDelimiter("[/\n]");
		while(s1.hasNext()) { // ���� �ܾ �ִ���
			if(s1.next().equals(id)) { // ���̵�� ��
				s1.close();
				return true;
			}
		}
		s1.close();
		return false;
	}
	
}

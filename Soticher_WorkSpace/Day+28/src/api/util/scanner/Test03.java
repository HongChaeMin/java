package api.util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		//���� �д� ��ĳ��
		File target = new File("sample.txt");//���� ��ü
		try {
			Scanner s = new Scanner(target);
			
			while(s.hasNextLine()) {//����
				System.out.println(s.nextLine());//���� ��ü�� ���
			}
			s.close();
		}catch(FileNotFoundException e) {
			System.out.println("������ �����ϴ�");
			e.printStackTrace();
		}

	}

}

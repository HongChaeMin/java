package api.lang.string;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String dbId = "megait";
		String dbPw = "study";
		
		String id = sc.next();
		String pw = sc.next();
		
		if(id.equals(dbId) && pw.equals(dbPw)) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�");
		}
		
	}

}

package api.exception;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] blacklist = new String[] {"�ٺ�", "��û��", "����"};
		
		while(true) {
			String id;
			int check = 0;
			
			try {
				System.out.print("�г����� �Է����ּ���(3~10 ���� ����) : ");
				id = sc.next();
				for(int i=0; i<blacklist.length; i++) {
					if(id.indexOf(blacklist[i])!=-1) {
						check++;
					}
				}
				if(id.length()<3 || id.length()>10) {
					throw new Exception("�г��� ���̰� �߸��Ǿ����ϴ�");
				}else if(id.indexOf("���")!=-1) {
					throw new Exception("\'���\'�� ���ԵǾ� �ֽ��ϴ�");
				}else if(check != 0) {
					throw new Exception("���� �ܾ ���ԵǾ� �ֽ��ϴ�");
				}else {
					System.out.println("����� �Ϸ�Ǿ����ϴ�");
					return;
				}
				
			}catch(Exception e) {
				System.err.println("���� : "+e.getMessage());
			}
			
		}
		
	}

}

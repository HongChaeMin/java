package api.util.cellection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
	
		
//		while(true) {
//			System.out.println("������ : ");
//			String c = sc.next();//������� , ���� ����Ű nextLine();
//			if(list.contains(c)){
//				System.out.println("�̹� ��ϵ� �����Դϴ�");
//			}else if(c.equals("����")) {
//				System.out.println("���α׷��� �����մϴ�");
//				break;
//			}else {
//				list.add(c);
//				System.out.println("���� ����� �Ǿ����ϴ� [���� ���� "+list.size()+"��]");
//			}
//		}
		
		int cheak = 1;
		
		while(cheak == 1) {
			
			System.out.println("���ϴ� ���� ��ȣ�� �Է��ϼ���");
			System.out.println("1. ���� ����ϱ�     2. ���ϴ� ��ȣ�� ���� ����ϱ�     3. ��ϵ� ���� ����    4. ���� �˻��ϱ�     5. ��ϵ� ���� ��� ����     6. ����");
			
			switch(sc.nextInt()) {
				case 1 :
					sc.nextLine();
					System.out.print("����� ���� �̸��� �Է����ּ��� : ");
					String c1 = sc.nextLine();
					if(list.contains(c1)) {
						System.out.println("�̹� ��ϵ� �����Դϴ�");
					}else {
						list.add(c1);
						System.out.println("���� ����� �Ǿ����ϴ� [���� ���� "+list.size()+"��]");
					}
					break;
				case 2 : 
					sc.nextLine();
					System.out.print("����� ���� �̸��� �Է����ּ��� : ");
					String c = sc.nextLine();
					System.out.print("����� ���� ��ȣ�� �Է����ּ��� : ");
					int n = sc.nextInt();
					
					if(n<=list.size()) {
							list.add(n, c);
							System.out.println("���� ����� �Ǿ����ϴ� [���� ���� "+list.size()+"��]");
					}else {
						System.out.println("���� ��ȣ�� �����ϴ�");
					}
					
					break;
				case 3 : 
					sc.nextLine();
					System.out.print("������ ���� �̸��� �Է����ּ��� : ");
					String r = sc.nextLine();
					list.remove(r);
					System.out.println("[���� ���� "+list.size()+"��]");
					break;
				case 4 : 
					sc.nextLine();
					System.out.print("�˻��� �������� �Է����ּ��� : ");
					String d = sc.nextLine();
					if(list.contains(d)) {
						System.out.println("["+list.indexOf(d)+"] "+d);
					}
					break;
				case 5 : 
					for(int i=0; i<list.size(); i++) {
						System.out.print("["+i+"] "+list.get(i)+", ");
					}
					System.out.println("[���� ���� "+list.size()+"��]");
					break;
				case 6 : 
					System.out.println("�ý����� �����մϴ�");
					cheak++;
					break;
			}
			
		}
		
		
	}

}

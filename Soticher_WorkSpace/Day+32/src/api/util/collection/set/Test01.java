package api.util.collection.set;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		//		[���� ��� ���α׷� ����]
		//		����ڿ��� ����ؼ� �������� �Է¹޾� �����ϴ� ����Ҹ� �����Ϸ��� �մϴ�
		//		�̹� ��ϵ� å�̸� ����� �����Ǿ����� �մϴ�
		//		(���� ���)	
		//		������ : � ����
		//		���� ����� �Ǿ����ϴ�... ���� ���� 1��
		//		������ : Ű�ٸ� ������
		//		���� ����� �Ǿ����ϴ�... ���� ���� 2��
		//		������ : � ����
		//		�̹� ��ϵ� �����Դϴ�.
		//		������ : ����
		//		���α׷��� �����մϴ�.
		
		Set<String> set = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String book = null;
			boolean check = true;
			Iterator<String> it = null;
			
			System.out.print("1.������� 2.�������� 3.�������� 4.����\n�Է� :");
			int num = sc.nextInt();
			sc.nextLine();
			if(num==1) {
				System.out.print("å �Է� :");
				book = sc.nextLine();
				
				for(String bk : set) {
					if(bk.equals(book)) {
						System.out.println("���� å�� �����մϴ�");
						check = false;
						break;
					}
				}
				if(check) {
					set.add(book);
				}
			}else if(num==2) {
				System.out.print("å �Է� :");
				book = sc.nextLine();
				it = set.iterator();
				
				while(it.hasNext()) {//���� �����Ͱ��ִ��� Ȯ��
					String bk = it.next();//it�� �ִ� String book �̸��� �Ѱ������´�
					if(bk.equals(book)) {
						it.remove();
						System.out.println(book+"å�� �����Ǿ����ϴ�");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("å �̸��� ã�� ���߽��ϴ�");
				}
					
			}else if(num==3) {
				for(String bk : set) {
					System.out.println(bk);
				}
			}
			else if(num==4) {
				System.out.println("�����մϴ�");
				break;
			}
			
		}

	}

}

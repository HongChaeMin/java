package api.util.collection.set;

import java.util.*;

public class Test02 {

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
		
		Set<String> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		Iterator<String> it = null;
		boolean check = true;
		String name = null;
		
		while(true) {
			System.out.println("����� �޴� ��ȣ�� �Է��ϼ���\n1. �������  2. ��������  3. ��������  4. ����");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("�������� �Է����ּ��� : ");
				name = sc.next();
				for(String in : set) {
					if(in.equals(name)) {
						System.out.println("�������� �����մϴ�");
						check = false;
						break;
					}
				}
				if(check) {
					set.add(name);
					System.out.println("���� ����� �Ϸ�Ǿ����ϴ�");
				}
				break;
			case 2: 
				System.out.print("������ �������� �Է����ּ��� : ");
				name = sc.next();
				it = set.iterator();
				while(it.hasNext()) {
					if(it.next().equals(name)) {
						it.remove();
						System.out.println("������ �Ϸ�Ǿ����ϴ�");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("�������� �������� �ʽ��ϴ�");
				}
				break;
			case 3:
				it = set.iterator();
				for(String nam : set) {
					System.out.println("���� : "+nam);
				}
				break;
			}
		}
		
	}

}

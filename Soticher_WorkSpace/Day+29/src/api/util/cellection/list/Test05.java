package api.util.cellection.list;

import java.util.*;

public class Test05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǰ�� ������ �ο� ���� �Է����ּ��� : ");
		
		int size = sc.nextInt();
		
		List<String> person = new ArrayList<>(size);
		List<String> what = new ArrayList<>(size);

		sc.nextLine();
		System.out.println("�����ϴ� ����� �̸��� �����ּ���");
		for(int i=0; i<size; i++) {
			person.add(sc.nextLine());
		}
		System.out.println("�ο� �� ��ŭ ��ǰ�� �����ּ���");
		for(int i=0; i<size; i++) {
			what.add(sc.nextLine());
		}
		
		Collections.shuffle(what);
		
		for(int i=0; i<size; i++) {
			System.out.println(person.get(i)+"���� ��ǰ�� "+what.get(i)+"�Դϴ� ���ϵ����~!~!");
		}
		
	}

}

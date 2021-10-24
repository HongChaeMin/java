package util.colletion;

import java.util.*;

public class Main {

	private static double max = 0.0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Score> list = new ArrayList<>();
		
		list.add(new Student("�ڳ�", 12, 45.6, 45.9, 12.1));
		list.add(new Student("������", 19, 34.2, 12.6, 99.9));
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).disp();
		}
		
		for(int i=0; i<list.size(); i++) {
			if(max < list.get(i).getSum()) {
				max = list.get(i).getSum();
			}
		}
		for(int i=0; i<list.size(); i++) {
			if(max == list.get(i).getSum()) {
				System.out.println("���� �� ���� ���� �л�");
				list.get(i).disp();
			}
		}
		
		System.out.println("=================================");
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("��ѱ�", 3, 4, 5, 6));
		set.add(new Student("����", 4, 5.5, 5.4, 2.1));
		
		for(Score user : set) {
			user.disp();
		}
		
		String name;
		boolean check =  true;
		boolean c = true;
		Iterator<Student> it = null;
		
		while(c) {
			check = true;
			System.out.println("1. �Է�  2. ��ü ����  3. ���� ����  4. ����");
			int n = sc.nextInt();
			switch(n) {
			case 1: 
				System.out.print("�߰��� �л� �̸��� �����ּ��� : ");
				name = sc.next();
				for(Student user : set) {
					if(user.getName().equals(name)) {
						System.out.println("���� �̸��� �����մϴ�");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("����, �����, ���м���, ������� �����ּ���");
					set.add(new Student(name, sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
					System.out.println("�л� ����� �Ϸ�Ǿ����ϴ�");
				}
				break;
			case 2:
				for(Score student : set) {
					student.disp();
				}
				break;
			case 3 : 
				it = set.iterator();
				System.out.print("ã�� �л� �̐a �Է� : ");
				name = sc.next();
				while(it.hasNext()) {
					Student s = it.next();
					if(s.getName().equals(name)) {
						s.disp();
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("�Է��� �л��� ������ �����ϴ�");
				}
				break;
			case 4:
				System.out.println("���α׷����� �����մϴ�");
				c = false;
				break;
			}
		}
		
	}

}

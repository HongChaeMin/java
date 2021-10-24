package api.util.list;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TotalStudent ts = new TotalStudent();
		
		//��ü �ȿ� ���� ����Ʈ�� �߰�
		System.out.print("�Է��� �л� ���� �Է����ּ��� : ");
		int su = sc.nextInt();
		
		for(int i=0; i<su; i++) {
			System.out.print("�̸� : "); String name = sc.next();
			System.out.print("�˰��� ���� : "); int ar = sc.nextInt();
			System.out.print("�ΰ����� ���� : "); int ai = sc.nextInt();
			System.out.print("�̻���� ���� : "); int ma = sc.nextInt();
			ts.addStudent(name, ar, ai, ma);
		}
		
		ts.totalDisp();
		
		System.out.println();
		
		//��ü ��ü�� ����Ʈ�� �߰�
		ts.addStudent(new Student("ȫä��", 100, 100, 100));
		
		ts.totalDisp();
		
		System.out.println();
		
		//����Ʈ�� ��ü �ȿ� �߰�
		ArrayList<Student> st = new ArrayList<>();
		st.add(new Student("������", 99, 43, 56));
		st.add(new Student("�ڳ�", 34, 65, 90));
		
		TotalStudent st1 = new TotalStudent(st);
		
		st1.totalDisp();
		
	}
	
}

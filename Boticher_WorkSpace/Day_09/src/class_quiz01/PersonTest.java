package class_quiz01;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�, �������, ������ �Է����ּ���");
		Person ps1 = new Person(sc.next(), sc.next(), sc.next());
		
		ps1.�λ��ϱ�();
		ps1.�ȱ�();
		ps1.�Ұ��ϱ�();
		ps1.���̾˷��ֱ�();

	}

}

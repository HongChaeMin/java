package oop_test01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Player py = new Player("�Ƿη�", 10, 100);
		Player py2 = new Player("Ÿ��", 15, 80);
		
		py.disp();
		py2.disp();
		
		System.out.println();
		
		//String�� �� �ٸ� ��ü�̹Ƿ� �ٸ� ���� �񱳸� �� ���� 
		//�����̸�.equals(���� ���)
		//�̷��� �ؾߵ�
		
		int check = 1;
		
		while (check == 1) {			
			System.out.println("�����Ͻðڽ��ϱ�?\n1.��\t2.�ƴϿ�");
			check = sc.nextInt();
			
			if(check == 1) {
				System.out.print("������ ����� �Է����ּ��� : ");
				String id = sc.next();
	
				if(id.equals(py2.getId())) {
					System.out.print(py2.getId()+"�� ������ Ƚ���� �Է����ּ��� : ");
					int n = sc.nextInt();
					py.target(py2, n);		
				}else if(id.equals(py.getId())) {
					System.out.print(py.getId()+"�� ������ Ƚ���� �Է����ּ��� : ");
					int m = sc.nextInt();
					py2.target(py, m);
				}else {
					System.out.println("��ǥ�� �߸� �Է��ϼ̽��ϴ�");
				}
			}
			else {
				System.out.println("�����մϴ�");
				check = 2;
			}
			
		}
		
		/*System.out.println();
		
		py.attack(py2);
		py.attack(py2);
		py2.attack(py);
		py2.attack(py);
		
		py.disp();
		py2.disp();*/
		
	}

}

package ifelse;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----����1-----");
		
		int me = sc.nextInt();
		int com = 8;
		
		if(me<com) {
			System.out.println("Up!");
		}else if(me==com) {
			System.out.println("Bingo!");
		}else {
			System.out.println("Down!");
		}
		
		System.out.println("-----����2-----");
		
		int id = 1234;
		int pw = 1111;
		
		System.out.print("���̵� �Է��ϼ��� : ");
		int uid = sc.nextInt();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		int upw = sc.nextInt();
		
		if(id==uid && pw==upw) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
		System.out.println("-----����3-----");
		
		System.out.println("[ȸ������]");
		System.out.print("���̵� �Է��ϼ��� : ");
		int dbid = sc.nextInt();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		int dbpw = sc.nextInt();
		
		System.out.println("�α����� �Ϸ��� ���̵�� ��й�ȣ�� �Է��ϼ���");
		System.out.print("���̵� �Է��ϼ��� : ");
		int udbid = sc.nextInt();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		int udbpw = sc.nextInt();
		
		if(dbid==udbid && dbpw==udbpw) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}

		System.out.println("-----����4-----");
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		if(100>=score && score>=60) {
			System.out.println("�հ�");
		}else if(0<=score && score<60) {
			System.out.println("���հ�");
		}else {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�");
		}
		
	}

}

package scanner;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		//System.in - ǥ���Է°�ü
		//Scanner - �����͸� �о���� ���� ����
		// - ����, ���ڿ�, �Է½�Ʈ��, URL
		
		//Scannner �����
		
		Scanner sc = new Scanner(System.in);
		
		//.next() �� �ܾ �о���� ��� - ���� �����͸� ���ڿ� ���·� �о���� ���
		System.out.print("�̸��Է� : ");//new line X
		String name = sc.next();
		System.out.println("�̸� : "+name);//ln = new line
		
		//nextLine() - ������ �о���� ���
		//- ���鹮�� �������� �����͸� �о���� ���� �ƴ϶� \n �������� �����͸� �о�´�
		//- �����ΰ� �Է¹��� �Ŀ� nextLine�� ����ϸ� ���ۿ� \n�� �����ֱ� ������ 
		//	�����͸� �Է¹����ɷ� �ν��Ѵ� ���۾ȿ� ���Ͱ��� ����������Ѵ�
		//.nextLine()�� �� �� �� ���ش�
		
		//buffer
		//- �������� ����, �������� ó�� �ӵ�, ������ ���� ���� �ٸ� �� ��ġ�� ���α׷� ���̿� 
		//	�����͸� �ְ� �ޱ� ���� �������� ���Ǵ� �ӽ� ��� ��ġ
		//- ��ǻ�Ϳ��� Ű���� �Է½ÿ��� �����͸� ���鹮�ڸ� �������� �����͸� ���� ���´�
		
		sc.nextLine();
		System.out.println("������� ���� �Ẹ����");
		String str = sc.nextLine();
		System.out.println("str = "+ str);
		
		//.next�ڷ���()
		System.out.print("�����Է� : ");
		int age = sc.nextInt();
		System.out.println("���� : "+age);
		
		System.out.print("����Է� : ");
		double t = sc.nextDouble();
		System.out.println("��� : "+t);

	}

}

package scanner;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----���� 1-----");
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("�� : "+(num1+num2));
		
		System.out.println("-----���� 2-----");
		
		System.out.print("���� = ");
		int num3 = sc.nextInt();
		System.out.println(num3%2!=0);
		
		System.out.println("-----���� 3-----");
		
		System.out.print("���� = ");
		int num4 = sc.nextInt();
		System.out.println(num4>=60&&num4<=100);
		
		System.out.println("-----���� 4-----");
		
		System.out.println("�ڹ� ���� ������ �Է��ϼ���");
		int java = sc.nextInt();
		System.out.println("���̽� ���� ������ �Է��ϼ���");
		int py = sc.nextInt();
		System.out.println("�̸��� �Է��ϼ���");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("===================================");
		System.out.println(name+"���� ���� �հ� = "+(java+py)+", ��� = "+(((double)java+py)/2));
		System.out.println("===================================");
		
		System.out.println("-----���� 5-----");
		
		System.out.println("���� 2�� �Է� : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(y+" "+x);
		
		System.out.println("-----���� 6-----");
		
		System.out.print("�� : ");
		
		int secend = sc.nextInt();
		int hour = secend/3600;
		int bun = (secend-(hour*3600))/60;
		int se = (secend-(hour*3600)+(bun*60))%60;
				
		System.out.println(hour+"�ð� "+bun+"�� "+se+"��");
		
		System.out.println("-----���� 7-----");
		
		System.out.print("���� = ");
		int a = sc.nextInt();
		System.out.print(a%2==0);
		
	}

}

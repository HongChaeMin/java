package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------���� 1-----------");
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<10) System.out.println("10���� �۽��ϴ�");
		else System.out.println("10���� Ů�ϴ�");
		
		System.out.println("-----------���� 2-----------");
		
		System.out.print("�� ���� ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a<b) System.out.println("b�� �� Ů�ϴ�");
		else System.out.println("a�� �� Ů�ϴ�");
		
		System.out.println("-----------���� 3-----------");
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		if(score>70) System.out.println("�հ��Դϴ�");
		else System.out.println("���հ��Դϴ�");
		
		System.out.println("-----------���� 4-----------");
		
		System.out.print("num : ");
		num = sc.nextInt();
		
		if(num%2==0) System.out.println("¦��");
		else System.out.println("Ȧ��");
		
		
	}

}

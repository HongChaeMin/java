package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------���� 1-----------");
		
		System.out.print("�ݺ� �� Ƚ���� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		while(n>0) {
			System.out.println("������ !! ^^");
			n--;
		}
		
		System.out.println("-----------���� 2-----------");
		
		System.out.print("ī��Ʈ �ٿ� ���� �Է��ϼ���  ");
		n = sc.nextInt();
		
		while(n>=0) {
			System.out.println(n--);
			if(n < 0) {
				System.out.println("�߻�~~!~!~!");
			}
		}
		
		System.out.println("-----------���� 3-----------");
		
		n = 5;
		
		while(n>0) {
			System.out.print("�Է� : ");
			int num = sc.nextInt();
			System.out.println("��� : "+ num);
			n--;
		}
		
	}

}

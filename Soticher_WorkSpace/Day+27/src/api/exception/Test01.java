package api.exception;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//���α׷��� ���� ���� �ó�����
		//[1] ������� : ���� 2���� ��Ȯ�� �Է��� ���
		//[2] �̻���� : ���ڰ� �ƴѰ��� �Է��ϴ� 
		//java.util.InputMismatchException
		//[3] �̻���� : ���� ������ 0�̸�
		//java.lang.ArithmeticException
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǰ ���� : ");
		int gift = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int q = sc.nextInt();
				
		System.out.println("���� 1���� ��ǰ�� "+gift/q+"�� �� �� �ֽ��ϴ�");
		System.out.println();
		
	}

}

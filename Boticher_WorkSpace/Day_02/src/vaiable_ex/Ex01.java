package vaiable_ex;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {

		// �Է��ϱ�
		Scanner sc = new Scanner(System.in); // ctrl + shift + o <- ����Ű

		System.out.print("������ ������ �Է��ϼ��� : ");
		int price = sc.nextInt();
		System.out.println("������ ���� : " + price);

		System.out.print("������ �������� ������ �Է��ϼ��� : ");
		int count = sc.nextInt();
		System.out.println("������ : " + count + "��, ���� : " + (price * count));

		sc.close();

	}

}

package oop.staticfinal;

import java.awt.Color;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//static final - ���ȭ ����
		//	- ���� ����� ���
		//	- ������ �̸��� �ֱ� ������ �ٽ� �ҷ��� �� ������ �����͸� ������ �� ���� ����
		//	- ���α׷��󿡼� �ǹ̸� ������ �ְ� �� �ǹ̰� ������� �ʴ� �����͸� ���� ���� 
		//	   �����Ͽ� ����ϱ� ���ؼ�
		
		System.out.println(Integer.MAX_VALUE); // int -> Integer
		System.out.println(Math.PI);
		System.out.println(Color.BLACK);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű �Է� : ");
		char key = sc.next().charAt(0);
		//Character.toLowerCase(key)
		switch(Character.toLowerCase(key)) {
		
		case Key.SKILL1:
			System.out.println("SKIILL 1");
			break;
		
		case Key.SKILL2:
			System.out.println("SKILL 2");
			break;
			
		case Key.SKILL3:
			System.out.println("SKILL 3");
			break;
			
		case Key.SKILL4:
			System.out.println("SKILL 4");
			break;
			
		default:
			System.out.println("�߸��� Ű �Է�!");
			
		}
		//https://docs.oracle.com/javase/8/docs/api/overview-summary.html

	}

}

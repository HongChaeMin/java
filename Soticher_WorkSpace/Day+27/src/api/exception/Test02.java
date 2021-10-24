package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner robot = new Scanner(System.in);
		
		while (true) {
			int gift = 0, q = 0;
			try {
				System.out.print("��ǰ ���� : ");
				gift = robot.nextInt();
				
				System.out.print("���� ���� : ");
				q = robot.nextInt();
				
				System.out.println("���� 1���� ��ǰ�� "+gift/q+"�� �� �� �ֽ��ϴ�");
				System.out.println("���� ��ǰ ������ "+gift%q+"�� �Դϴ�");
			}catch(InputMismatchException e) {
				robot.nextLine();
				System.out.println("������ �Է��ϼž� �մϴ�");
			}catch(ArithmeticException e) {
				System.out.println("0���δ� ���� �� �����ϴ�");
			}finally {//��� ����Ǵ� �ڵ�
				System.out.println("JAVA try catch");
			}
			
		}
		
		
		
		//System.out.print("��ǰ ���� : ");
		//int gift = robot.nextInt();
		
		//System.out.print("���� ���� :");
		//int q = robot.nextInt();
		
		//System.out.println("���� 1���� ��ǰ�� "+gift/q+"�� �� �� �ֽ��ϴ�");
		//System.out.println("���� ��ǰ ������ "+gift%q+"�� �Դϴ�");

	}

}

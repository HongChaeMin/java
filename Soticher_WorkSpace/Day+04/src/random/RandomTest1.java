package random;

import java.util.Scanner;

public class RandomTest1 {

	public static void main(String[] args) {
		//		�ֻ����� 2�� ������ �ڵ带 �����Ͻð�
		//		�ΰ��� �ֻ��� �հ迡 ���� �Ʒ��� ���� �ڵ带 ����
		//
		//		(1) �հ谡 ¦���� ���		¦! ���
		//		(2) �հ谡 Ȧ���� ���		Ȧ! ���
		//		(3) �� �ֻ����� ���� ���� ��� 		����! ���
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		
		int tot = a+b;
		
		if(tot % 2 ==0) {
			if(a==b) {
				System.out.println("����");
			}else {
				System.out.println("¦!");
			}
		}else {
			System.out.println("Ȧ!");
		}
		
		
		
//		ȭ�鿡 �������� ������ 1������ ����(2�� ~ 15��)
			//	2 X 1 = 	���� 		15 X 9 = 		����
			//	����ڰ� ������ �Է��� �� �ֵ��� ���α׷��� �ڵ带 ����(Scanner)
			//	������ ��� �Ʒ��� ���� ó��
			//
			//	[1] ���� ���	����! 10�� ȹ��!
			//	[2] Ʋ�� ���	����! 5�� ����!
			//
			//	�߰�������, ����� ����(11�� �̻�)�� ���߸� 10���� �߰��� ȹ���ϵ��� �ڵ� ����
		
		Scanner sc = new Scanner(System.in);
		
		int su1 = (int)(Math.random()*14)+2;
		int su2 = (int)(Math.random()*9)+1;
		
		int com = su1 * su2;
		
		System.out.print(su1+"x"+su2+"=");
		int user = sc.nextInt();
		
		if(com == user) {
			System.out.println("���� ! 10�� ȹ�� !");
			if(su1>=11) {
				System.out.println("����� ����!10�� �߰� ȹ��");
			}
		}else {
			System.out.println("����!5�� ����");
		}
		
		/*
		 * # 369����[1�ܰ�]
		 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
		 * 2. �� ���� 369�� ������
		 * 	1) 2���̸�, ¦¦�� ���
		 *  2) 1���̸�, ¦�� ���
		 *  3) 0���̸�, �ش� ���ڸ� ���
		 * ��)
		 * 		33	 : ¦¦
		 * 		16	 : ¦
		 * 		 7	 : 7
		 */
		int ra = (int)(Math.random()*50)+1;
		
		int �����ڸ� = ra/10;
		int �����ڸ� = ra%10;
		int cnt = 0;
		if(�����ڸ� == 3 || �����ڸ� == 6 || �����ڸ� == 9) {
			cnt++;//cnt = cnt +1;
		}
		if(�����ڸ� == 3 || �����ڸ� == 6 || �����ڸ� == 9) {
			cnt++;
		}
		
		if(cnt == 2) {
			System.out.println("¦¦");
		}
		else if(cnt == 1) {
			System.out.println("¦");
		}
		else {
			System.out.println(ra);
		}
		
		/* # ������ ��ȣ ���߱� ����
		 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
		 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
		 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
		 * 	  1) ����	  2)  �E��     3) ����	 4) ������
		 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
		 * ��) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) %
		 *    ���� : 1��
		 */
		int x = (int)(Math.random()*10)+1;
		int y = (int)(Math.random()*10)+1;
		int answer = (int)(Math.random()*4)+1;
		
		int z = 0;
		if(answer == 1) {
			z = x + y;
		}
		else if(answer == 2) {
			z = x - y;
		}
		else if(answer == 3) {
			z = x * y;
		}
		else if(answer == 4) {
			z = x % y;
		}
		
		System.out.println(x+" ? "+y+" = "+z);
		System.out.println("1)+ 2)- 3)* 4)%");
		System.out.print("��ȣ�� �Է��ϼ��� :");
		int myAnswer = sc.nextInt();
		
		if(answer == myAnswer) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
	}

}


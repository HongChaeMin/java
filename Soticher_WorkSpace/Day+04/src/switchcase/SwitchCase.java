package switchcase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		//switch ~ case����
		//������ ������ �ӵ��� ����Ǵ� ���ǹ�
		//�������� �ְ� ���� ����
		
		/*
		 * ���� ���
		 * switch(����){
		 * case ���:
		 * 		���೻��;
		 * 		break;
		 * case ���:
		 * 		���೻��;
		 * 		break;
		 * default:
		 * 		break;
		 * }
		 */
		
		int ra = (int)(Math.random()*3)+1;
		//break; - ��� �ȿ��� �߰�ȣ�� ���������� ��Ȱ.
		//switch~case,do~while,while,for �߿� ���� ������ ���� ����� �Ҷ�
		//���Ǵ� �帧 ���
		switch(ra) {
		case 1: // if(ra == 1)
			System.out.println(ra);
			break;
		case 2: // else if(ra == 2)
			System.out.println(ra);
			break;
		case 3: // else if(ra==3)
			System.out.println(ra);
			break;
		default: // else
			System.out.println("�߸��� ��");
			break;
		}
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*10)+1;
		int y = (int)(Math.random()*10)+1;
		int answer = (int)(Math.random()*4)+1;
		int z = 0;
		switch(answer) {
		case 1:
			z = x+y;
			break;
		case 2:
			z = x - y;
			break;
		case 3:
			z = x * y;
			break;
		case 4:
			z = x % y;
			break;
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

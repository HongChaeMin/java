package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ը� �Է��ϼ��� : ");
		int weight = sc.nextInt();
		
		if(weight < 55) System.out.println("ġŲ ���� ~!~!");
		
		if(weight >= 100) System.out.println("������ ���̾�Ʈ �� ��");
		
		if (weight == 68) System.out.println("����� �����Դ� 68kg�̱��� ��������");
		
		if(weight != 75) System.out.println("����� �����Դ� 75kg�� �ƴմϴ� ������");
		
		sc.close();
		
	}
}

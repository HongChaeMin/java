package variable_quiz;

import java.util.*;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------���� 1-----------");

		System.out.print("num 1 : ");
		int num1 = sc.nextInt();
		System.out.print("num 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("�� : "+(num1/num2)+" ������ : "+(num1%num2));
		
		System.out.println("-----------���� 2-----------");
		
		int x, y;
		
		System.out.print("x : ");
		y = sc.nextInt();
		System.out.print("y : ");
		x = sc.nextInt();
		
		System.out.println("x�� "+x+"�̰�, y�� "+y+"�Դϴ�");
		
		System.out.println("-----------���� 3-----------");
		
		int s, m;
		
		System.out.print("�� : ");
		s = sc.nextInt();
		m = s/60;
		s %= 60;
		
		System.out.println(m+"�� "+s+"��");
		
		System.out.println("-----------���� 4-----------");
		
		int a, b, c, d, e;
		
		System.out.print("num : ");
		a = sc.nextInt();
		
		b = a/1000;
		c = (a%1000)/100;
		d = ((a%1000)%100)/10;
		e = ((a%1000)%100)%10;
		
		System.out.println(b+"\n"+c+"\n"+d+"\n"+e);
		
		System.out.println("-----------���� 5-----------");
		
		System.out.print("num : ");
		a = sc.nextInt();
		
		b = a/1000;
		c = (a%1000)/100;
		d = ((a%1000)%100)/10;
		e = ((a%1000)%100)%10;
		
		System.out.println("�հ�� "+(b+c+d+e)+"�Դϴ�");
		
	}

}

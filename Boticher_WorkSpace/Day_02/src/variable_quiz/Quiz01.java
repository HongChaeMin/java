package variable_quiz;

import java.util.*;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------문제 1-----------");

		System.out.print("num 1 : ");
		int num1 = sc.nextInt();
		System.out.print("num 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("몫 : "+(num1/num2)+" 나머지 : "+(num1%num2));
		
		System.out.println("-----------문제 2-----------");
		
		int x, y;
		
		System.out.print("x : ");
		y = sc.nextInt();
		System.out.print("y : ");
		x = sc.nextInt();
		
		System.out.println("x는 "+x+"이고, y는 "+y+"입니다");
		
		System.out.println("-----------문제 3-----------");
		
		int s, m;
		
		System.out.print("초 : ");
		s = sc.nextInt();
		m = s/60;
		s %= 60;
		
		System.out.println(m+"분 "+s+"초");
		
		System.out.println("-----------문제 4-----------");
		
		int a, b, c, d, e;
		
		System.out.print("num : ");
		a = sc.nextInt();
		
		b = a/1000;
		c = (a%1000)/100;
		d = ((a%1000)%100)/10;
		e = ((a%1000)%100)%10;
		
		System.out.println(b+"\n"+c+"\n"+d+"\n"+e);
		
		System.out.println("-----------문제 5-----------");
		
		System.out.print("num : ");
		a = sc.nextInt();
		
		b = a/1000;
		c = (a%1000)/100;
		d = ((a%1000)%100)/10;
		e = ((a%1000)%100)%10;
		
		System.out.println("합계는 "+(b+c+d+e)+"입니다");
		
	}

}

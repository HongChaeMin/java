package ifelse;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = System.currentTimeMillis();
		long b = a/1000;
		long c = b/60;
		long d = c/60;
		long e = d/24;
		long f = e/365;
		long g = 1970 + f;
		
		//long systear = 1970 + (int)(System.currentTimeMillis()/100/60/60/24/365);
		
		int s = sc.nextInt();
		long age = g-s+1;
		
		System.out.println(age+"살");
		
		if(age>=20) {
			System.out.println("성인입니다");
		}else {
			System.out.print("미성년자입니다");
		}
		
		

	}

}

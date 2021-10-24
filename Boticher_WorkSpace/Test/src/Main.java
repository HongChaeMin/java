import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		System.out.println(fibo(a));
		
	}

	private static int fibo(int a) {
		if(a == 1 || a == 2) {
			return 1;
		}
		return fibo(a - 2) + fibo(a - 1);
	}
	
}

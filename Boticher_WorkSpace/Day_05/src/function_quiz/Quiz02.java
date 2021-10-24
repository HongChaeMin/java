package function_quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int n = sc.nextInt();
		System.out.println(sum(n));
		
		System.out.println("5���� ���� �Է��ϼ���");
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("�ּҰ��� "+sort(arr));
		
		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println(prime(num));
		
		
	}
	
	public static int sum(int n) {
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
			if(sum>100) {
				return sum;
			}
		}
		return sum;
	}
	
	public static int sort(int[] arr) {
		Arrays.parallelSort(arr);
		int min = arr[0];
		return min;
	}
	
	public static boolean prime(int n) {
		for(int i=2; i<n; i++) { // ������ �����ų� ��Ʈ ����� ���� ������ �ڵ尡 ��
			if(n%i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
}

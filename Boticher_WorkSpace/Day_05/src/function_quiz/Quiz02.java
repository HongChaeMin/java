package function_quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int n = sc.nextInt();
		System.out.println(sum(n));
		
		System.out.println("5개의 수를 입력하세요");
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("최소값은 "+sort(arr));
		
		System.out.print("수를 입력하세요 : ");
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
		for(int i=2; i<n; i++) { // 반으로 나누거나 루트 씌우면 제일 최적의 코드가 됨
			if(n%i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
}

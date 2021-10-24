package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/*System.out.print("몇 가지의 항목이 필요합니까? : ");
		
		int a = sc.nextInt();
		
		String arr[] = new String[a];
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("항목 : ");
			arr[i] = sc.next();
		}
		
		System.out.println("추첨 중 입니다...");
		
		int b = (int)(Math.random()*(a-1))+0;
		
		System.out.println("추첨된 항목은 "+arr[b]+"입니다");
		*/
		
		int arr1[] = new int[6];
		
		for(int i=0; i<1000; i++) {
			int n = (int)(Math.random()*6)+0;
			arr1[n] ++;
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println((i+1)+"이 나온 횟수 : "+arr1[i]+"번");
		}
		
		System.out.println("-----문제 1-----");
		
		int aa[] = {10, 49, 51, 36, 17};
		int bb[] = {0, 0, 0, 0, 0};
		int cc[] = {0, 0, 0, 0, 0};
		
		System.out.print("리스트 값을 입력하세요 : ");
		int li = sc.nextInt();
		
		for(int i=0; i<aa.length; i++) {
			if(aa[i] == li) {
				System.out.println(i);
			}
		}
		
		System.out.println("-----문제 2-----");
		
		for(int i=0; i<aa.length; i++) {
			if(aa[i]%2!=0) {
				bb[i] = aa[i];
			}
		}
		System.out.println(Arrays.toString(aa));
		
		System.out.println("-----문제 3-----");
		
		for(int i=0; i<cc.length; i++) {
			for(int j=0; j<aa.length; j++) {
				if(aa[j]%2!=0) {
					cc[i] = aa[j];
					aa[j] = 0;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(bb));
		
		System.out.println("-----문제 4-----");
		
		int arr2[] = {1001, 20, 1002, 45, 1003, 54};
		
		System.out.print("학번을 입력하세요 : ");
		int h = sc.nextInt();
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] == h) {
				System.out.println("점수 : "+arr2[i+1]);
			}
		}
		
		System.out.println("-----문제 5-----");
		
		System.out.print("점수를 입력하세요 : ");
		int j = sc.nextInt();
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] == j) {
				System.out.println("점수 : "+arr2[i-1]);
			}
		}
		
	}
}

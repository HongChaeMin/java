package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----���� 1-----");
		
		int arr[] = new int[7];
		int d = 0;
		
		while(true) {
			System.out.println("�¼� �����ϱ� - 1��");
			System.out.println("�����ϱ� - 2��");
			int h = sc.nextInt();
			
			if(h == 1) {
				System.out.println("seat = "+Arrays.toString(arr));
				System.out.print("�¼� ��ȣ�� �Է��ϼ��� : ");
				
				int n = sc.nextInt();
				
				if(arr[n] == 0) {
					arr[n] = 1;
					d++;
				}else if(arr[n] == 1) {
					System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�");
				}
			}else if(h == 2) {
				System.out.println("������ �ݾ��� "+d*12000+"�� �Դϴ�");
				break;
			}
			
		}
		
		System.out.println("-----���� 2-----");
		
		int arr1[] = new int[5];
		int check[] = new int[5];
		int on = 0;
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*5)+0;
			for(int j=0; j<100; j++) {
				if(check[n] == 0) {
					arr[on] = n;
					check[n]++;
					on++;
					break;
				}
			}
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("-----���� 3-----");
		
		int a[] = {10, 20, 30, 40, 50};
		int b[] = {13, 54, 17, 42, 1};
		int c[] = {0, 0, 0, 0, 0};
		on = 0;
		
		for(int i=0; i<a.length; i++) {
			if((a[i]+b[i])%2==0) {
				c[on] = a[i]+b[i];
				on++;
			}
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		System.out.println("-----���� 4-----");
		
		int num[] = {1001, 1002, 1003};
		int score[] = {50, 83, 78};
		int win[] = {0, 0, 0};
		
		on = 0;
		
		for(int i=0; i<score.length; i++) {
			if(score[i]>=60) {
				win[on] = num[i];
				on++;
			}
		}
		
		for(int i=0; i<win.length; i++) {
			System.out.print(win[i]+" ");
		}
		System.out.println();
		
		System.out.println("-----���� 5-----");
		
		int data[] = {1001, 80, 1002, 23, 1003, 78};
		int win2[] = {0, 0, 0};
		on = 0;
		
		for(int i=0; i<data.length; i++) {
			if(i%2==0) {
				if(data[i+1]>=60) {
					win2[on] = data[i];
					on++;
				}
			}
		}
		
		for(int i=0; i<win2.length; i++) {
			System.out.print(win2[i]+" ");
		}
		System.out.println();
				
		
	}

}

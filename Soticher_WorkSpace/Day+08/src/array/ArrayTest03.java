package array;

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int c = 0;
		int h = 0;
		
		for(int i=0;i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			c += arr[i];
			if(arr[i]>=60) {
				h++;
			}
		}
		
		System.out.println("���� ("+c+ "), ��� ("+(c/5.0)+")");
		System.out.println("�հݻ� "+h+"��");
		
		int arr1[] = {87, 11, 45, 98, 23};
		
		System.out.print("���ϴ� ��ȣ �Է� : ");
		int num = sc.nextInt();
		System.out.println("���� : "+arr1[num]);
		
		System.out.print("���� �Է� : ");
		int num2 = sc.nextInt();
		for(int i=0;i<arr1.length; i++) {
			if(arr1[i] == num2) {
				System.out.println("��ȣ : "+ i);
			}
		}
		
		int hakbuns[] = {1001, 1002, 1003, 1004, 1005};
		int scores[] = {87, 11, 45, 98, 23};
		
		System.out.print("�й� �Է� : ");
		int num3 = sc.nextInt();
		
		for(int i=0; i<hakbuns.length; i++) {
			if(num3 == hakbuns[i]) {
				System.out.println("���� : "+scores[i]);
			}
		}
		
		int on = 0;
		
		System.out.print("�й� �Է� : ");
		int ha = sc.nextInt();
		
		for(int i=0; i<hakbuns.length; i++) {
			if(ha==hakbuns[i]) {
				System.out.println("���� : "+scores[i]);
				on++;
			}
		}
		if(on == 0) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�");
		}
	}

}

package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/*System.out.print("�� ������ �׸��� �ʿ��մϱ�? : ");
		
		int a = sc.nextInt();
		
		String arr[] = new String[a];
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("�׸� : ");
			arr[i] = sc.next();
		}
		
		System.out.println("��÷ �� �Դϴ�...");
		
		int b = (int)(Math.random()*(a-1))+0;
		
		System.out.println("��÷�� �׸��� "+arr[b]+"�Դϴ�");
		*/
		
		int arr1[] = new int[6];
		
		for(int i=0; i<1000; i++) {
			int n = (int)(Math.random()*6)+0;
			arr1[n] ++;
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println((i+1)+"�� ���� Ƚ�� : "+arr1[i]+"��");
		}
		
		System.out.println("-----���� 1-----");
		
		int aa[] = {10, 49, 51, 36, 17};
		int bb[] = {0, 0, 0, 0, 0};
		int cc[] = {0, 0, 0, 0, 0};
		
		System.out.print("����Ʈ ���� �Է��ϼ��� : ");
		int li = sc.nextInt();
		
		for(int i=0; i<aa.length; i++) {
			if(aa[i] == li) {
				System.out.println(i);
			}
		}
		
		System.out.println("-----���� 2-----");
		
		for(int i=0; i<aa.length; i++) {
			if(aa[i]%2!=0) {
				bb[i] = aa[i];
			}
		}
		System.out.println(Arrays.toString(aa));
		
		System.out.println("-----���� 3-----");
		
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
		
		System.out.println("-----���� 4-----");
		
		int arr2[] = {1001, 20, 1002, 45, 1003, 54};
		
		System.out.print("�й��� �Է��ϼ��� : ");
		int h = sc.nextInt();
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] == h) {
				System.out.println("���� : "+arr2[i+1]);
			}
		}
		
		System.out.println("-----���� 5-----");
		
		System.out.print("������ �Է��ϼ��� : ");
		int j = sc.nextInt();
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] == j) {
				System.out.println("���� : "+arr2[i-1]);
			}
		}
		
	}
}

package array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];
		
		int k = 1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10*k;
				k += 1;
			}
		}
		
		System.out.println("-----���� 1-----");
		
		System.out.print("��ǥ x�� �Է��ϼ��� : ");
		int x = sc.nextInt();
		System.out.print("��ǥ y�� �Է��ϼ��� : ");
		int y = sc.nextInt();
		
		System.out.println("��ǥ�� : "+arr[x][y]);
		
		System.out.println("-----���� 2-----");
		
		System.out.print("��ǥ���� �Է��ϼ��� : ");
		int p = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j]==p) {
					System.out.println("��ǥ ("+i+", "+j+")");
				}
			}
		}
		
		System.out.println("-----���� 3-----");
		
		int xMax = 0;
		int yMax = 0;
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
					xMax = i;
					yMax = j;
				}
			}
		}
		System.out.println("���� ū ��ǥ���� ��ǥ : ("+xMax+", "+yMax+")");
		
		System.out.println("-----���� 4-----");
		
		System.out.println("��ǥ���� �ٲ� ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j] == a) {
					arr[i][j] = b;
				}
			}
		}
		
		System.out.println("��ǥ��");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

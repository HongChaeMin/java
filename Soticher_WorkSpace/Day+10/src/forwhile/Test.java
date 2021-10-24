package forwhile;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("-----巩力 1-----");
			
			int a = sc.nextInt();
			int count = 0;
			
			for(int i=2; i<=a; i++) {
				for(int j=1; j<=i; j++) {
					if(i%j==0) {
						count++;
					}
				}
				if(count == 2) {
					System.out.print(i+" ");
				}
				count = 0;
			}
			
			System.out.println();
			System.out.println("-----巩力 2-----");			
			
			for(int i=1; i<=3; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("-----巩力 3-----");
			
			for(int i=1; i<=3; i++) {
				for(int j=i; j<=3; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("-----巩力 4-----");
			
			int arr[][] = new int[5][5];
			
			for(int i=0;i<=2; i++){
		        for(int j=2-i; j<=2+i; j++){
		            arr[i][j] = 1;
		        }
		    }
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length; j++) {
					if(arr[i][j] == 1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			
			
			
	}

}

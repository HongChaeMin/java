package oop_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10, 20, 0, 0, 0};
		
		System.out.print("만드려는 배열에 크기를 정해주세요 : ");
		Array array1 = new Array(sc.nextInt());
		
		Array array2 = new Array(arr);
		
		Array array3 = new Array(array1);
		
		System.out.println("array1의 data, data size");
		array1.disp();
		System.out.println("\n");
		System.out.println("array2의 data, data size");
		array2.disp();
		System.out.println("\n");
		System.out.println("array3의 data, data size");
		array3.disp();

		System.out.println("\n");
		
		System.out.println("array2에 5를 add");
		array2.add(30);
		array2.add(40);
		array2.disp();
		
		System.out.println("\n");
		
		System.out.println("array3에 4를 add");
		array3.add(4);
		array1.disp();
		array3.add(5);
		array3.add(6);
		array3.disp();
		
		System.out.println("\n");
		
		System.out.println("array1[3]에 4를 add");

		array1.disp();
		
		System.out.println("\n");
		
		System.out.println("array1의 2번째 데이터 : "+array1.get(2));
		
		System.out.println();
		
		System.out.println("array1를 remove");
		array1.remove();
		array1.disp();
		
		System.out.println("\n");
		
		array1.remove();
		array1.remove();
		array1.remove();
		array1.remove();
		array1.remove();
		array1.disp();
		
	}

}

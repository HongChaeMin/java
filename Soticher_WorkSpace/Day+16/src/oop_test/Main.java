package oop_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10, 20, 0, 0, 0};
		
		System.out.print("������� �迭�� ũ�⸦ �����ּ��� : ");
		Array array1 = new Array(sc.nextInt());
		
		Array array2 = new Array(arr);
		
		Array array3 = new Array(array1);
		
		System.out.println("array1�� data, data size");
		array1.disp();
		System.out.println("\n");
		System.out.println("array2�� data, data size");
		array2.disp();
		System.out.println("\n");
		System.out.println("array3�� data, data size");
		array3.disp();

		System.out.println("\n");
		
		System.out.println("array2�� 5�� add");
		array2.add(30);
		array2.add(40);
		array2.disp();
		
		System.out.println("\n");
		
		System.out.println("array3�� 4�� add");
		array3.add(4);
		array1.disp();
		array3.add(5);
		array3.add(6);
		array3.disp();
		
		System.out.println("\n");
		
		System.out.println("array1[3]�� 4�� add");

		array1.disp();
		
		System.out.println("\n");
		
		System.out.println("array1�� 2��° ������ : "+array1.get(2));
		
		System.out.println();
		
		System.out.println("array1�� remove");
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

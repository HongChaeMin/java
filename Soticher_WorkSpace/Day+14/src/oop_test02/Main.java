package oop_test02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Info in[] = new Info[3];

		for(int i=0; i<in.length; i++) {
			in[i] = new Info();
			
			System.out.println("ÀÌ¸§, ³ªÀÌ : ");
			in[i].setData(sc.next(), sc.nextInt());
		}
		
		for(int i=0; i<in.length; i++) {
			in[i].disp();
		}
	
		Info arr[] = new Info[3];
		arr[0] = new Info();
		arr[1] = new Info();
		arr[2] = new Info();
		
		arr[0].setData("ºñ½ÇÀÌ", 16);
		arr[1].setData("ÅüÅüÀÌ", 16);
		arr[2].setData("µµ¶ó¿¡¸ù", 99999);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].disp();
		}
		
	}

}

package array;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};	
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};		
		
		System.out.println("-----���� 1-----");
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum += pay[i][j];
			}
			System.out.println((i+1)+"�� ������ : "+sum+"��");
		}
	
		System.out.println("-----���� 2-----");
		
		System.out.print("ȣ�� �Է��ϼ��� : ");
		int ho = sc.nextInt();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == ho) {
					System.out.println("�����ؾ� �� ������ : "+pay[i][j]+"��");
				}
			}
		}
		
		System.out.println("-----���� 3-----");
		
		int max = 0;
		int min = 999999;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(max < pay[i][j]) {
					max = pay[i][j];
				}
				if(min > pay[i][j]) {
					min = pay[i][j];
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(pay[i][j] == max) {
					System.out.println("������ ���� ���� ���� �� : "+apt[i][j]+"ȣ");
				}
				if(pay[i][j] == min) {
					System.out.println("������ ���� ���� ���� �� : "+apt[i][j]+"ȣ");
				}
			}
		}
		
	}
	
}

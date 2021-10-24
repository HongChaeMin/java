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
		
		System.out.println("-----문제 1-----");
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum += pay[i][j];
			}
			System.out.println((i+1)+"층 관리비 : "+sum+"원");
		}
	
		System.out.println("-----문제 2-----");
		
		System.out.print("호를 입력하세요 : ");
		int ho = sc.nextInt();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == ho) {
					System.out.println("납부해야 될 관리비 : "+pay[i][j]+"원");
				}
			}
		}
		
		System.out.println("-----문제 3-----");
		
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
					System.out.println("관리비가 가장 많이 나온 집 : "+apt[i][j]+"호");
				}
				if(pay[i][j] == min) {
					System.out.println("관리비가 가장 적게 나온 집 : "+apt[i][j]+"호");
				}
			}
		}
		
	}
	
}

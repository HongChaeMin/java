package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//다차원 배열
		//- 배열이 중첩적인 차원을 가지는 배열
		//- 여러개의 배열 공간의 정보를 저장할 수 있는 배열
		
		//2차원 배열
		//- 1차원 배열의 배열
		int[][] arr = null;
		
		//- 인스턴스 공간
		//new 자료형[개수][개수];
		//new 자료형[][] {{데이터,데이터..},{데이터,데이터..},{데이터,데이터..}}
		
		arr = new int[2][3];
		//int[][] arr = new int[2][3];
		
		System.out.println(Arrays.toString(arr));
		
		arr[0][0] = 10;
		arr[1][0] = 15;
		
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		int num[][] = new int[5][5];
		int count = 1;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = count;
				count++;
			}
		}
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}

package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//������ �迭
		//- �迭�� ��ø���� ������ ������ �迭
		//- �������� �迭 ������ ������ ������ �� �ִ� �迭
		
		//2���� �迭
		//- 1���� �迭�� �迭
		int[][] arr = null;
		
		//- �ν��Ͻ� ����
		//new �ڷ���[����][����];
		//new �ڷ���[][] {{������,������..},{������,������..},{������,������..}}
		
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

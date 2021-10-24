package array;

public class ArraysTest01 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];

		int k = 1;
		
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				arr[i][j] = 10*k;
				k += 1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.print("전체 합 : ");
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
		
		System.out.print("4의 배수 : ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%4==0) {
					System.out.print(arr[i][j]+"\t");
				}
			}
		}
		
		System.out.println();
		System.out.print("4의 배수의 합 : ");
		
		sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%4==0) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
		
		System.out.print("4의 배수의 갯수 : ");
		
		sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%4==0) {
					sum++;
				}
			}
		}
		System.out.println(sum);
		
	}

}

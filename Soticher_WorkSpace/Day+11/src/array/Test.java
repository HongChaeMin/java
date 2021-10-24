package array;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("-----문제 1-----");
		
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
			for(int i=0; i<garo.length; i++) {
				for(int j=0; j<sero.length; j++) {
					garo[i] += arr[i][j];
				}
			}
			for(int i=0; i<garo.length; i++) {
				System.out.print(garo[i]+" ");
			}
			
			System.out.println();
			System.out.println("-----문제 2-----");
			
			for(int i=0; i<sero.length; i++) {
				for(int j=0; j<garo.length; j++) {
					sero[i] += arr[j][i];
				}
			}
			for(int i=0; i<sero.length; i++) {
				System.out.print(sero[i]+" ");
			}
			
			System.out.println();
			System.out.println("-----문제 3-----");
			
			int a[][] = new int[5][5];
			
			for(int i=1; i<=25; i++) {
				int x = (int)(Math.random()*5)+0;
				int y = (int)(Math.random()*5)+0;
				if(a[x][y] == 0) {
					a[x][y] = i;
				}else {
					i--;
				}
			}
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			

	}

}

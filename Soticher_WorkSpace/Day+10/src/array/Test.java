package array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];
		
		int k = 1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10*k;
				k += 1;
			}
		}
		
		System.out.println("-----¹®Á¦ 1-----");
		
		System.out.print("ÁÂÇ¥ x¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		int x = sc.nextInt();
		System.out.print("ÁÂÇ¥ y¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		int y = sc.nextInt();
		
		System.out.println("ÁÂÇ¥°ª : "+arr[x][y]);
		
		System.out.println("-----¹®Á¦ 2-----");
		
		System.out.print("ÁÂÇ¥°ªÀ» ÀÔ·ÂÇÏ¼¼¿ä : ");
		int p = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j]==p) {
					System.out.println("ÁÂÇ¥ ("+i+", "+j+")");
				}
			}
		}
		
		System.out.println("-----¹®Á¦ 3-----");
		
		int xMax = 0;
		int yMax = 0;
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
					xMax = i;
					yMax = j;
				}
			}
		}
		System.out.println("°¡Àå Å« ÁÂÇ¥°ªÀÇ ÁÂÇ¥ : ("+xMax+", "+yMax+")");
		
		System.out.println("-----¹®Á¦ 4-----");
		
		System.out.println("ÁÂÇ¥°ª°ú ¹Ù²Ü °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j] == a) {
					arr[i][j] = b;
				}
			}
		}
		
		System.out.println("ÁÂÇ¥°ª");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

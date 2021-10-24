package forwhile;

public class ForTest01 {

	public static void main(String[] args) {
		
		int a[][] = new int[4][4];
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=i; j++) {
				a[i][j] = 1;
			}
		}
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(a[i][j] == 1) {
					System.out.print("*");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}

		int count = 0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<5-count;z++) {
				System.out.print("*");
			}
			count+=2;
			System.out.println();
		}
		
	}

}

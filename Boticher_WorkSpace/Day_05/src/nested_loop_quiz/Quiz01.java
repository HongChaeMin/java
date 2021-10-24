package nested_loop_quiz;

public class Quiz01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}

		for (int i = 2; i <= 9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
		}

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<(2*i)+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
}

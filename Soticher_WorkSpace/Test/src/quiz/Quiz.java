package quiz;

public class Quiz {
	public static void main(String[] args) {
		int i = 2;
//		int j = 0;
//		
//		while (i <= 9) {
//			j++;
//			System.out.println(i + " X " + j + " = " + i*j);
//			i += j / 9;
//			j %= 9;
//		}
		int i = 2;
		int j = 1;

		while ( i <= 9 ) {
			System.out.println(i + " X " + j + " = " + i * j);
		    if ( j == 9 ) {
		        i++;
		        j = 1;
		    }
		    j++;
		}
	}
}

package ifelse;

public class IfTest1 {

	public static void main(String[] args) {
		
		int num1 = -10;
		
		if(num1<0) {
			System.out.println("음수");
		}else if(num1==0) {
			System.out.println("0");
		}else {
			System.out.println("양수");
		}
		
		int num2 = 12;
		
		if(num2%4==0) {
			System.out.println("4의 배수");
		}
		
		int score = 87;
		
		if(score>=80){
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}

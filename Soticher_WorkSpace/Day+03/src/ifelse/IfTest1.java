package ifelse;

public class IfTest1 {

	public static void main(String[] args) {
		
		int num1 = -10;
		
		if(num1<0) {
			System.out.println("����");
		}else if(num1==0) {
			System.out.println("0");
		}else {
			System.out.println("���");
		}
		
		int num2 = 12;
		
		if(num2%4==0) {
			System.out.println("4�� ���");
		}
		
		int score = 87;
		
		if(score>=80){
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}

	}

}

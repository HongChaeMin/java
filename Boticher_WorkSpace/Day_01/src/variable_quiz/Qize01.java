package variable_quiz;

public class Qize01 {

	public static void main(String[] args) {
		
//		�̸�: �ź��� ����: 25
//
//		3 + 5 = 8
//		3 - 5 = -2
//
//		7 X 1 = 7
//		7 X 2 = 14
//		7 X 3 = 21


		String name = "ȫä��";
		int age = 19;
		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		
		System.out.println();
		
		int a = 3;
		int b = 5;
		
		System.out.println(a+" + "+b+" = "+(a+b));
		
		b = -5;
				
		System.out.println(a+" "+b+" = "+(a+b));
		
		System.out.println();
		
		for(int i=1; i<=3; i++) {
			int num = 7;
			System.out.println(num+" X "+i+" = "+num*i);
		}
	}

	private static int abs(int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}

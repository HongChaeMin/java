package variable;

public class VariableTest3 {

	public static void main(String[] args) {

		int kor = 100;
		int eng = 87;
		int math = 41;

		int sum = (kor + eng + math) / 3;

		System.out.println((sum >= 60) && (kor < 50 && eng < 50 && math < 50));

		int height1 = 199;
		int weight2 = 199;

		System.out.println(height1 >= 200 || weight2 >= 200);

	}

}

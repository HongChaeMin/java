package api.exception;

public class Test06 {

	public static void main(String[] args) {

		Calc cal = new Calc();

		try {
			int v = cal.div(10, 0);
			System.out.println("v = " + v);

			int w = cal.mod(10, 0);
			System.out.println("w = " + w);
		} catch (Exception e) {
			System.out.println("계산 오류");
		}

	}

}

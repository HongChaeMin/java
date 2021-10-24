package api.exception;

public class Calc {

	// throws Exception :
	// Exception 발생시 처리하지 않겠다

	public int div(int a, int b) throws Exception {
		return a / b;
	}

	public int mod(int a, int b) throws Exception {
		return a % b;
	}

}

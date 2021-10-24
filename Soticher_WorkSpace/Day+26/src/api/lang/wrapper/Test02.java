package api.lang.wrapper;

public class Test02 {

	public static void main(String[] args) {
		
		Integer a = new Integer("100");
		Integer b = new Integer("100");
		
		System.out.println("[2] : "+a+", "+b);
		
		System.out.println("[3] : "+a.equals(b));
		
		System.out.println("[4] : "+Integer.toHexString(a));
		
		System.out.println("[5] : "+Integer.toBinaryString(b));
		
		System.out.println("[6] : "+Integer.MAX_VALUE);
		
		String x = "12321";
		String y = "32123";
		
		System.out.println("[7] : "+(Integer.parseInt(x)+Integer.valueOf(y)));
		
		//»ý¼ºÀÚ
		System.out.println(new Integer(x)+new Integer(y));
	}

}

package api.lang.etc;

public class Test01 {
	public static void main(String[] args) {
		
		//Math		���� ��� �����
		// - �����ڰ� ���� Ŭ����(�� Ŭ���� �Ǵ� �̱��� Ŭ����)
		
		//Math a = new Math();
		System.out.println(Math.random());//0.xxx�� ��÷
		
		double a = 1.5;
		System.out.println(Math.floor(a));//����
		System.out.println(Math.round(a));//�ݿø�
		System.out.println(Math.ceil(a));//�ø�
		
		int b = 3;
		int c = 4;
		
		System.out.println(Math.pow(b, 2));//����
		System.out.println(Math.pow(c, 2));
		double d = Math.pow(b, 2) + Math.pow(c, 2);
		double e = Math.sqrt(d);
		System.out.println(e);
		
	}

}

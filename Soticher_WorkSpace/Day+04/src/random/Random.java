package random;

public class Random {

	public static void main(String[] args) {
		
		//Math.random();
		// - 0���� 1�̸��� ������ �Ǽ��� ���ϴ� ���
		// - 0.0000000 ~ 0.9999999
		
		//���� ���ϴ� ������ ������ �� ���ϱ�
		// -(int)(Math.random * ����) + ���ۼ�
		
		int su = (int)(Math.random() * 3)+9;
		System.out.println("su ="+su);
		
		double a = Math.random();//0.0000~0.9999
		double b = a *3;//0.0000 ~ 2.9999;
		int c = (int)b; // 0~ 2
		int d = c+9; // 9~ 11
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}

package wrapper_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// �⺻ �ڷ���(primitive) : int, double, float, boolean...
		// ���� �ڷ���(reference) : int[], String, Integer, Double, Float, Boolean -> wrapper class or boxed class
		//						<heap�� ��� �ִ� �ڷ��� / �ּҰ��� �ִ� �ڷ���>
		
		// �ʵ�
		// �޼ҵ�
		
		// 1. �⺻ �ڷ���(primitive)�� �����ϱ�
		int n1 = 5;
		System.out.println(n1);
		
		// 2. ���� Ŭ����(Wrapper class)�� �����ϱ�
		Integer n2 = 5;
		System.out.println(n2);
		
		// 3. ���� Ŭ���� ��ü�� ����� �� �����ϱ�
		Integer n3 = new Integer(5);
		System.out.println(n3);
		
		Integer n4 = 5;
		
		System.out.println(n1 == n2); // int - Integer : true => ����
		System.out.println(n1 == n3); // int - new Integer : true => ����
		System.out.println(n2 == n3); // Integer - new Integer : false => �ּҺ�
		System.out.println(n2 == n4); // Integer = Integer : true => �ּҺ� (�ּҰ��� ��Ȱ��Ǹ� ���� ����)

		System.out.println(n2.equals(n3));
		
		// �� �� ���� Ŭ������ .equals �� ���ϱ�

		Integer num1 = new Integer(15);
		Integer num2 = new Integer(15);
		System.out.println(num1 == num2); // �ּҰ� ���� �ʴ�
		System.out.println(num1.equals(num2));
		
	}

}

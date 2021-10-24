package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		// String ������ �� �����ϱ�
		String a = "�ȳ��ϼ���";
		String b = new String("�ȳ��ϼ���");
		String c = new String("�ȳ��ϼ���");
		String d = "�ȳ��ϼ���"; // heap ������ constant pool�� ����ǰ� ��Ȱ��ȴ� (new�� ���� ���� �� )

		System.out.println(a);
		System.out.println(b);

		// String ���� �� ���ϱ�
		// == ���� �񱳸� �ϴ� ���� stack������ ����� �ּҰ��� ���� ���̴�
		// String���� ���� ���Ϸ��� .equals() ����ؾ��Ѵ�
		System.out.println(a == d);
		System.out.println(b == c);
		System.out.println(a == b);
		System.out.println(a.equals(b));

	}

}

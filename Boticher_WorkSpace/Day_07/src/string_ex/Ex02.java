package string_ex;

public class Ex02 {

	public static void main(String[] args) {

		//�ڷ��� ��ȯ
		
		// 1. ���� -> ���ڿ�
		int num = 3; // "3"
		String str = num + ""; // ��... ÷ �˾Ҵ� ���� + ���� = ����	StringBuilder, StringBuffer (�������ü��� �ִ� ���� �����鶧��)
		
		String str2 = String.valueOf(num);
		System.out.println(str);
		System.out.println(str2);
		
		// 2. ���ڿ� -> ����
		String str3 = "5";
		int num2 = Integer.valueOf(str3);
		int num3 = Integer.parseInt(str3);
		
	}

}

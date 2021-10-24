package api.lang.wrapper;

public class Main {

	public static void main(String[] args) {
		//wrapperŬ����
		// - �⺻�ڷ����� Ŭ����ȭ ��Ų �ڷ���
		// - �⺻ �ڷ����� ��ü�� �����ߴ�
		
		boolean bol = true;	
		Boolean a = new Boolean(true);//1�� �ȵ� �غ���
		Boolean b = new Boolean(false);
		
		Boolean c = new Boolean("TRUE1");//�����ڸ� ���� ����ó���� ����� ������  false
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("=================================");
		
		//��ü������ �񱳿����� equals�� ����Ѵ�
		System.out.println(b == c);
		System.out.println(b.equals(c));
		
		System.out.println("=================================");
		System.out.println(Boolean.logicalXor(c, b));
		System.out.println(Boolean.logicalAnd(c, b));
		//or - �ϳ��� ���� ���  : ��
		//and - �� �� ���̿��� ��
		
		System.out.println("=================================");
		System.out.println(Boolean.valueOf("true"));//�ٵ� 1�� �ȵ� �غ� 
		//valueOf - �Է¹��� ������ ���� ������ ���� ��ü������ ��ȯ�Ͽ� ��ȯ
		String.valueOf(5);// -> "5"
		//valueOf - String�� ����� �ֵ� String������ �� ��ȯ
		
		System.out.println("=================================");
		//auto-boxing - ������������ �Ϲ� �����͸� ������ �ڵ����� ��üȭ ��Ű�°�
		Boolean d = true;
		System.out.println(d.toString());
		
		//auto-unboxing - �Ϲ� ������ ������ �����͸� ������ �ڵ����� �Ϲ� �����ͷ� ��ȯ ��Ű�°�
		boolean e = new Boolean("dfdf");
		
		System.out.println(e);
		//e.toString()�� �ȵǴ� ������ �������� �ƴϱ� ������
		
		
	}

}

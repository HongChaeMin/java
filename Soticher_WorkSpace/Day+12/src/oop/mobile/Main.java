package oop.mobile;

public class Main {

	public static void main(String[] args) {
		
		/*
		[����] oop.mobile01 ��Ű���� ����� ������ Ǫ����

		Main.java	main() �޼ҵ带 ������ Ŭ����
		Mobile		�޴���ȭ Ŭ����
			(�׸�) �̸�, ��Ż�, ����
			(�޼ҵ�) disp(���)

		Ŭ������ ����� �Ʒ��� ��ü�� ������ �� ������ ȭ�鿡 ���
			name		telecom		price
		[1]	G6		LG		70����
		[2]	������7		KT		95����
		[3]	Galaxy S8	SKT		90����
		*/

		Mobile in = new Mobile();
		Mobile in2 = new Mobile();
		Mobile in3 = new Mobile();
		
		in.setDate("G6", "LG", 70);
		in2.setDate("������7", "KT", 95);
		in3.setDate("Galaxy S8", "SKT", 90);
		
		in.disp();
		in2.disp();
		in3.disp();
		
	}

}

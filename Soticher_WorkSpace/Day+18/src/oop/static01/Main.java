package oop.static01;

public class Main {

	public static void main(String[] args) {
		
		//Test.su = 10; private�� ���� �������� ���� �Ұ�
		
		Test.setSu(20);
		Test t1 = new Test(1, 1);
		Test t2 = new Test(2, 2);
		Test t3 = new Test(3, 3);
		
		t1.disp();t2.disp();t3.disp();
		//Static : �ַ� Ŭ�������� �Ҵ�
		//��� ��ü�� �޸𸮸� ����
		
		//Heap : �ַ� ��ü���� �Ҵ�
		//�޸𸮸� �������� �ʽ��ϴ�

		Test num1 = new Test();
		Test num2 = new Test();
		
		Test.setSu(20);
		num1.disp();
		num2.disp();
		
	}

}

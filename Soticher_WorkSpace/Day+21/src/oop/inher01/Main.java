package oop.inher01;

public class Main {

	public static void main(String[] args) {
		
		//��� (Inheritance)
		// - Ŭ�������� �����ְų� �����޴°�
		// - ������ Ŭ����(�θ� Ŭ����)�� �Ӽ��� ����� �������� Ŭ����(�ڽ� Ŭ����)
		//	 ���� ����� ���������� �������� Ŭ���������� �߰����� ǥ���� ���� ���ο�
		//	 Ŭ������ ����� ����
		// - Ŭ������ ��Ȱ��, ���α׷��� ������(����, ����, �߰�)�� ���븦 ���� ���
		// - ����� �������� �������� �����Ѵ�
		
		//����
		// - �ڽ� Ŭ�������� �θ� Ŭ������ �����Ѵ�
		// - extends�� ���Ͽ� Ŭ������ ��ӹ޴´� (�� 1����)
		// - �ƹ��� �ڽñ���� �θ��� private����� ���� �Ұ� ***
		
		//class �ڽ�Ŭ������ extends �θ� Ŭ������{
		//			�ڵ� ����;
		//}
		
		NewTest in = new NewTest(); //�ڽ� ��ü
		in.disp();
		in.info();
		
		Test t = new Test();
		t.info();
		//t.disp();

	}

}
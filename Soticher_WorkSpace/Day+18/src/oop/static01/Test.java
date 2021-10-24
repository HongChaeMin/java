package oop.static01;

//static
//	- ��ü�� ������ ��� ���� ���Ǵ� ���
//	- Ŭ������ ���Ͽ� �����Ѵ�
//	- static ����� ���� ������ ������ �޴´�

//����
//	- ��� ��ü�� ���� �����Ͽ� �ϰ������� ó���Ǿ�� �� �����͸� �����ϴ� ���� ����
//	- ���� �޸� ������ ������ ���� �����ǰ� ��� ��ü�� �� ������ �����ϰ� �ȴ�
//	- ���α׷��� ���� �� �� ������ �����ǰ� ���α׷��� ���� �� ������ �Ҹ�ȴ�
//	- ��� ��ü�� ��Ʋ� �� �ϳ��� ������ ���������
//	- �ƹ��� Ŭ���� ���δ��� static����� Ŭ������ ���Ͽ� �����Ͽ����Ѵ�

public class Test {

	private int no; // ��ü ��ȣ(������ ������ ���� ����)
	private static int su;
	
	public Test(int no, int su) {
		this.no = no;
		//this.su = su;
		Test.su = su;
	}
	public Test() {
		
	}
	
	public void disp() {
		System.out.println("no = "+no+"\tsu = "+su);
	}
	
	//static �޼ҵ�
	//	- ��ü�� ������ ����� ������ Ŭ������ ��ɰ� ������ �ִ� �޼ҵ���� ����� �� static
	//		�޼ҵ带 ������ش�
	//	- static �޼ҵ�� static ����� ����� �����ϴ�
	//	- this�� �������� �ʴ´�

	public static void setSu(int su) {
		Test.su = su;
		//no = 20; static����� �ƴϱ� ������ error
		getSu();
		System.currentTimeMillis(); //static
		System.out.println(); //static
	}
	
	public static int getSu() {
		return su;
	}
}

package oop_test;

public class Main {

	//�޼ҵ��� �����ε�
	// - ��ü���� ����� �޼ҵ��� ���� ����� �޼ҵ��� *�Ű��������� �ν�*�Ѵ�
	// - �޼ҵ���� �ߺ�����
	// - ���� ����̶�� �ϳ��� �̸����� �������� ó���� ���� ����Ѵ�
	
	// - �����ε��� ����
	//		- ��ȯ �ڷ����� �����ε��� ���ǿ� �ش���� �ʴ´�(getter�� �ش� X)
	// 	- �Ű������� ���� ���� �ڷ��� �� �߿� �ϳ��� �ٸ��� �������� ���ǿ� �ش�ȴ�
	
	public void disp(int a) {
		System.out.println("a ="+a);
	}
	
	public void disp(int a,double b) {
		System.out.println("a ="+a);
	}
	
	public void disp(double a,int b) {
		System.out.println("a ="+a);
	}
	
	public void disp(double a) {
		System.out.println("a ="+a);
	}
	
	public void disp(char a) {
		System.out.println("a ="+a);
	}
	
	public void disp(String a) {
		System.out.println("a ="+a);
	}
	
	public static void main(String[] args) {
		
		Info in = new Info("ȫ�浿",13);//�̸� ���� ������
		in.disp();
		
		Info in1 = new Info("ȫ�浿");//�̸��� �־ �̸�������
		in1.disp();
		
		Info in2 = new Info();//���� �����ʾƼ� ����Ʈ������
		in2.setData("ȫ�浿", 15);
		in2.disp();

		Main ma = new Main();
		ma.disp("a");
		
		ma.disp('a');
		ma.disp(20);
		ma.disp(0.36, 45);
		
	}

}

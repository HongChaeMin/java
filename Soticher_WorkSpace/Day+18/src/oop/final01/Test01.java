package oop.final01;

public final class Test01 {

	int b;
	
	//final�� �ٿ� ������ ������ ������ �ȿ��� �ʱ�ȭ�� �������־���Ѵ�
	final int a = 0;
	public Test01(int a) {
		//this.a = a; //�ʱ�ȭ�� ���� �ʾƼ� error
	}
	
//	public  final void setData(int b) {
//		this.b = b;
//	} // �ڽ��� �θ��� �޼ҵ带 �����Ⱑ �Ұ���
	
	public static void main(String[] args) {
		
		//������ - ��� ����, �Ǵ� ������ �߻���Ű�� Ű����
		
//		final : ��������, ������
//			- �̰��� �������̴�
//			- �缳�� ����
			
//		���� - �� �� ���� �����ϸ� �� ���� �������� ���� �ȴ�. ������ ������ �Ұ�
//		setter ��ü�� ����� �Ұ�
	
//		�޼ҵ� - �������̵� ����.. �޼ҵ� ������ ����
//				���� �̸��� �޼ҵ�� ������ �Ұ��ϴ�
			
//		Ŭ���� - ��ӱ��� �Ұ���
		
		final int a;
		//System.out.println("a = "+a);
		
		a = 20;
		//a = 30; ���� �� �� �����߱� ������ error
		System.out.println("a = "+a);
		
		//final : ���̻� _____�� �����Ѵٴ� ��
		//����	: �缳������
		//�޼ҵ�	: 
		

	}

}

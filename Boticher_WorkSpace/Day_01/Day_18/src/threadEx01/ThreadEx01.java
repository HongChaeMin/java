package threadEx01;

public class ThreadEx01 {
	public static void main(String[] args) throws InterruptedException {
		
		// Thread : ��� ���α׷�(���μ���) ������ ����Ǵ� �帧�� ������ ���Ѵ�
		
		ThreadExtends te1  = new ThreadExtends("��");
		ThreadExtends te2 = new ThreadExtends("��");
		
		// Single Threaad : ������ ����
		//te1.run();
		//te2.run();
		
		// Multi Thread : ���ÿ� ����
//		te1.start();
//		te2.start();
		
		ThreadImplements ti1 = new ThreadImplements("��");
		ThreadImplements ti2 = new ThreadImplements("��");

		// Single Thread : ������ ����
//		ti1.run();
//		ti2.run();
		
		// Multi Thread : ���ÿ� ����
		Thread th1 = new Thread(ti1);
		Thread th2 = new Thread(ti2);
		
		th1.start();
		th1.join(); // th1 �����尡 ���� �� ���� ���� �����尡 ��ٸ���
		th2.start();
		th2.join(); // th2 �����尡 ���� �� ���� ���� �����尡 ��ٸ���
		
		System.out.println("==========����Ϸ�=========");
	}
}
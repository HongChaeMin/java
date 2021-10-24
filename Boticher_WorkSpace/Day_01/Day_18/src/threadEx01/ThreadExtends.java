package threadEx01;

public class ThreadExtends extends Thread {

	private String resource;

	public ThreadExtends(String resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		// ���⼭ �����ϴ� ������ �����忡�� ����Ǵ� ����
		for (int i = 0; i < 10; i++) {
			try {
				// �ʹ� ���� ������ ���� �����ϱ� ���� 0.5�� �� ���鼭 ��´�
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.resource);
		}
	}

}

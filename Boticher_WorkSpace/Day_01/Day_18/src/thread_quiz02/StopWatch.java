package thread_quiz02;

public class StopWatch extends Thread {

	private boolean stop; // stop flag

	@Override
	public void run() {
		int secound = 0;
		while (!stop) {
			try {
				Thread.sleep(1000);
				System.out.println((++secound) + "��");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ���� ����
		System.out.println("�ɸ� �ð� : " + secound + "��");
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
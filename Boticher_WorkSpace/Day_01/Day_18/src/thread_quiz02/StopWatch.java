package thread_quiz02;

public class StopWatch extends Thread {

	private boolean stop; // stop flag

	@Override
	public void run() {
		int secound = 0;
		while (!stop) {
			try {
				Thread.sleep(1000);
				System.out.println((++secound) + "초");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 실행 종료
		System.out.println("걸린 시간 : " + secound + "초");
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}

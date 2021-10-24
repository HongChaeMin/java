package thread_quiz01;

public class Lamb implements Runnable {

	private String resounes;
	
	public Lamb(String resounes) {
		this.resounes = resounes;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.resounes);
		}

	}

}

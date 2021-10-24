package thread_quiz01;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Tiger tiger = new Tiger("┐|・▽・#|┌");
		Lamb lamb = new Lamb("( つ≧～≦)つ");
		Pony pony = new Pony("(╬☉д⊙)");
		
		Thread ti = new Thread(tiger);
		Thread la = new Thread(lamb);
		Thread po = new Thread(pony);
		
		ti.start();
		la.start();
		ti.join();
		la.join();
		
		po.start();

	}

}

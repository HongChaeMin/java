package thread_quiz02;

import java.util.Scanner;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		StopWatch stopwatch = new StopWatch();

		System.out.println("������ ���� �����ġ�� ����ǰ�, �׸��� ���� �����ġ�� �ߴܵ˴ϴ�");

		if (sc.next().equals("����")) {
			stopwatch.start();
			if (sc.next().equals("�׸�")) {
				stopwatch.setStop(true);
			} else {
				stopwatch.setStop(false);
			}
			stopwatch.join();
		}

	}

}

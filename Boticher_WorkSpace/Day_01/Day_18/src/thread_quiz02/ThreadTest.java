package thread_quiz02;

import java.util.Scanner;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		StopWatch stopwatch = new StopWatch();

		System.out.println("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 스톱워치가 중단됩니다");

		if (sc.next().equals("시작")) {
			stopwatch.start();
			if (sc.next().equals("그만")) {
				stopwatch.setStop(true);
			} else {
				stopwatch.setStop(false);
			}
			stopwatch.join();
		}

	}

}

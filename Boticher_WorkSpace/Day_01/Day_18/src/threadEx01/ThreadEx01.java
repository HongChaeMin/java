package threadEx01;

public class ThreadEx01 {
	public static void main(String[] args) throws InterruptedException {
		
		// Thread : 어떠한 프로그램(프로세스) 내에서 실행되는 흐름의 단위를 말한다
		
		ThreadExtends te1  = new ThreadExtends("★");
		ThreadExtends te2 = new ThreadExtends("●");
		
		// Single Threaad : 순차적 수행
		//te1.run();
		//te2.run();
		
		// Multi Thread : 동시에 수행
//		te1.start();
//		te2.start();
		
		ThreadImplements ti1 = new ThreadImplements("■");
		ThreadImplements ti2 = new ThreadImplements("□");

		// Single Thread : 순차적 수행
//		ti1.run();
//		ti2.run();
		
		// Multi Thread : 동시에 수행
		Thread th1 = new Thread(ti1);
		Thread th2 = new Thread(ti2);
		
		th1.start();
		th1.join(); // th1 쓰레드가 끝날 때 까지 메인 쓰레드가 기다린다
		th2.start();
		th2.join(); // th2 쓰레드가 끝날 때 가지 메인 쓰레드가 기다린다
		
		System.out.println("==========수행완료=========");
	}
}

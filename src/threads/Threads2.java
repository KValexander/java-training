package threads;

public class Threads2 {

	public static void main(String[] args) throws InterruptedException {

//		Create a subclass if Thread
		MyThread2 thread1 = new MyThread2();
//		or
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		
		thread1.start();
//		thread1.join(3000); // calling thread (ex.main) wait until the specified thread dies or for x milliseconds
		thread2.start();
		
//		System.out.println(1/0);
		
	}
}

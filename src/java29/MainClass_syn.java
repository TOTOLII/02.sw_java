package java29;

public class MainClass_syn {

	public static void main(String[] args) {
		
		ThreadTest_syn threadTest = new ThreadTest_syn();
		
		Thread thread0 = new Thread(threadTest, "A");
		Thread thread1 = new Thread(threadTest, "B");
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
	}
	
}

//멀티 스레드 객체 1개 스레드 2개
package java29;

public class Multi_Main {
	
	public static void main(String[] args) {
		
		Multi_ThreadTest threadTest = new Multi_ThreadTest();
		
		Thread M1_thread0 = new Thread(threadTest, "A");
		Thread M1_thread1 = new Thread(threadTest, "B");
		M1_thread0.start();
		M1_thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
	}

}

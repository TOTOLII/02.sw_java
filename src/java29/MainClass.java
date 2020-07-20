package java29;

public class MainClass {
	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		
		Thread thread = new Thread(threadTest, "A"); // 스레드에 매개변수와 이름을 직접 정할수 있음.
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}

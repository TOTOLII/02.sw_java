package java29;

public class Main_Thread {
	public static void main(String[] args) {
		Thread_extends threadex = new Thread_extends();
		threadex.setName("B");
		threadex.start();
		
		System.out.println(threadex.currentThread().getName());
	}

}

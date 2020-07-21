//멀티스레드 객체1개 스레드 1개
package java29;

public class Multi_Main2 {
	
	public static void main(String[] args) {
		
		Multi_Thread2 M2_threadTest0 = new Multi_Thread2();
		Multi_Thread2 M2_threadTest1 = new Multi_Thread2();
		
		Thread M2_thread0 = new Thread(M2_threadTest0, "A");
		Thread M2_thread1 = new Thread(M2_threadTest1, "B");
		
		M2_thread0.start();
		M2_thread1.start();
		
		
	}

}

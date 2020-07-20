package java29;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		//thread가 static으로 선언 되어 있어, 바로 접근하여 현재 구동이 되고 있는 스레드를 구한다음, 스레드의 이름을 가져옴
		System.out.println("Thread"); // 스레드 이름 출력
		
		for (int i = 0; i < 10; i++) { //i가 10번 돌아감.
			System.out.println("i = " + i); 
			try {
				Thread.sleep(500); //스레드를 잠시 멈춤, 500이면 0.5초, 0.5초 쉰다음 바로 작업을 실행할지 아무도 모름.
			} catch (Exception e) {
			}
			
		}

	}

}

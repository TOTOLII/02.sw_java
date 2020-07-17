package java24;

import java.util.Timer;
import java.util.TimerTask;


public class Java24_TimerEx {
	
	public Java24_TimerEx() throws InterruptedException {
		// TODO Auto-generated constructor stub
		
		System.out.println("^^");
		Timer timer = new Timer(true); //이 과정을 넣어줘야 작업을 다하고 멈춘다.
		TimerTask t1 = new Java24_ExTimerTask1();
		TimerTask t2 = new Java24_ExTimerTask2();
		
		timer.schedule(t1, 2000);	//2���� ����
		timer.schedule(t2, 10000);	//10���� ����
		
		Thread.sleep(11000); //t2가 찍히는지 확인 하기 위해서 대기
		System.out.println("**");
		
	}
}

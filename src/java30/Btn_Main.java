package java30;

import java.awt.Dimension;

public class Btn_Main {
	public static void main(String[] args) {
		
		Ex_makebtn btn = new Ex_makebtn();
		btn.pack();
		btn.setSize(new Dimension(200, 200));
		btn.setVisible(true);
		
		try {
			Thread.sleep(2000); //2초 동안 홀드
		} catch (Exception e) {}
			
		btn.setVisible(false); // 화면에서 안보이게 만듦. 눈에 보이진 않지만 자원은 가지고 있다.
		btn.dispose(); //자원을 해제 
			
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		
		System.exit(0);
		
	}

}

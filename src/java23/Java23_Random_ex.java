package java23;

import java.util.Random;

public class Java23_Random_ex {
	
	public static void main(String[] args) {
		
		double d = Math.random();
		System.out.println(d);
		
		int di = (int)(d*10); // 명시적 형변환으로 더블형 자료를 정수형 자료로 변환.
		System.out.println(di);
		
		Random random_ex = new Random();
		int i = random_ex.nextInt(100);
		System.out.println(i);
	}

}

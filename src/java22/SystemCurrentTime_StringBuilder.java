//개발 테스트에 많이 쓰이는 System.currentTimeMillis()_StringBuilder 사용 코드
package java22;

public class SystemCurrentTime_StringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("A");
		long startNum1 = System.currentTimeMillis();
		
		for (int i = 0; i < 50000; i++) {
			stringBuilder = stringBuilder.append("A");
		}
		
		long endNum1 = System.currentTimeMillis();
		System.out.println("경과 시간" + (endNum1 - startNum1));
	}

}

//개발 테스트에 많이 쓰이는 System.currentTimeMillis()_String 사용 코드
package java22;

public class SystemCurrentTime_String {    
	
	 public static void main(String[] args) {
		 
		 System.out.println(System.currentTimeMillis());
		 
		 String str = "A"; 
		 long startNum = System.currentTimeMillis(); 
		 
		 for (int i = 0; i < 50000; i++) { //5만번을 돌면서 str 변수에 + A 문자열을 계속 붙힌다. 
			 str = str + "A"; 
		 }
		 
		 long endNum = System.currentTimeMillis();
		 System.out.println("경과 시간" + (endNum - startNum));
	}

}

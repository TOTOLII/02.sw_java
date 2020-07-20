package java25;

public class Java25_ThrowsExClass {
	
	public Java25_ThrowsExClass() {
		actionC();
	}
	
	private void actionA() throws Exception {
		System.out.println("actionA");
		
		int[] iArr = {1, 2, 3, 4};   //여기서 오류 발생, throws 구문으로 인해 앞으로 돌아감 action b의 try 문으로 돌아감.
		System.out.println(iArr[4]);
		
		System.out.println("actionAA"); //action b의 try 구문이 끝나면 이 구문이 실행됨.
	}
	
	private void actionB() { //action a의 마지막 구문을 실행후 밑으로 내려와 마지막 구문인 actionBB를 출력함.
		System.out.println("actionB");
		
		try {  //action a에서 오류가 발생 한 후 이쪽으로 넘어옴.
			actionA();
		} catch (Exception e) {
			System.out.println("���ܴ� ���⼭ ó�� �Ҳ���.^^");
			System.out.println(e.getMessage());
		}  //try 구문이 끝나면 다시 action a의 오류 밑 부분을 실행함.
		
		System.out.println("actionBB"); // 실행 된 뒤, 자동으로  action c로 넘어감.
	}
	
	private void actionC() { //actionBB를 출력 한뒤 action c로 넘어와서 마지막 줄인 action CC출력을 실행.
		System.out.println("actionC");
		actionB();
		System.out.println("actionCC");
	}
}

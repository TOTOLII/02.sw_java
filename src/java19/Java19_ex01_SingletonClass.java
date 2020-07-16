package java19;

public class Java19_ex01_SingletonClass {

	private static Java19_ex01_SingletonClass SINGLETON_CLASS_INSTANCE = new Java19_ex01_SingletonClass(); //이 클래스에서만 사용  
	public int i = 10;
	
	private Java19_ex01_SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static Java19_ex01_SingletonClass getSingletonClass() {
		
		if(SINGLETON_CLASS_INSTANCE == null) {
			SINGLETON_CLASS_INSTANCE = new Java19_ex01_SingletonClass();
		}
		
		return SINGLETON_CLASS_INSTANCE;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}

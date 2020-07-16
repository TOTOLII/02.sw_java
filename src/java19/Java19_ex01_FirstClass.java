package java19;

public class Java19_ex01_FirstClass {
	public Java19_ex01_FirstClass() {
		// TODO Auto-generated constructor stub
		
		Java19_ex01_SingletonClass singletonClass = Java19_ex01_SingletonClass.getSingletonClass();
		System.out.println("FirstClass");
		System.out.println("i = " + singletonClass.getI());
		singletonClass.setI(200);
		System.out.println("i = " + singletonClass.getI());
		
	}
}

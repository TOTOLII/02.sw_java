package java19;

public class Java19_ex01_SecondClass {
	public Java19_ex01_SecondClass() {
		// TODO Auto-generated constructor stub
		
		Java19_ex01_SingletonClass singletonClass = Java19_ex01_SingletonClass.getSingletonClass();
		System.out.println("SecondClass");
		System.out.println("i = " + singletonClass.getI());
		
	}
}

package java15;

public class Java15_ex01_Child2 extends Java15_ex01_LunchMenu {

	public Java15_ex01_Child2(int rice, int bulgogi, int banana, int milk, int almond) {
		// TODO Auto-generated constructor stub
		super(rice, bulgogi, banana, milk, almond);
	}
	
	@Override
	public int calculating() {
		// TODO Auto-generated method stub
		return rice + bulgogi + milk + almond;
	}

}

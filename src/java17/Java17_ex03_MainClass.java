package java17;

public class Java17_ex03_MainClass {
	
	public static void main(String[] args) {
		
		Java17_ex03_Actress actress = new Java17_ex03_Actress();
		actress.canCatchCriminal();
		actress.canSearch();
		actress.outFire();
		actress.saveMan();
		actress.makePizza();
		actress.makeSpaghetti();
		
		Java17_ex03_PoliceMan actressP = new Java17_ex03_Actress();
		actressP.canCatchCriminal();
		actressP.canSearch();
		
		actressP.outFire();
		actressP.saveMan();
		actressP.makePizza();
		actressP.makeSpaghetti();
		
		Java17_ex03_Firefighter actressF = new Java17_ex03_Actress();
		actressF.outFire();
		actressF.saveMan();
		
		actressF.canCatchCriminal();
		actressF.canSearch();
		actressF.makePizza();
		actressF.makeSpaghetti();
		
	}
	
}

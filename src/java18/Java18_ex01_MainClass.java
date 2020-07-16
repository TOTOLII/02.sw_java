package java18;

public class Java18_ex01_MainClass {
	public static void main(String[] args) {
		
		Java18_ex01_Toy pooh = new Java18_ex01_PoohToyClass();
		Java18_ex01_Toy mazinger = new Java18_ex01_MazingerToyClass();
		Java18_ex01_Toy airPlaToy = new Java18_ex01_AirPlaneToyClass();
		
		
		AbsClass absclass = new AbsClass() {
			
			@Override
	 		public void doMethod() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}

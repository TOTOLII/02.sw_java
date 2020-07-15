package java16;

public class Java16_ex01_MainClass {
	public static void main(String[] args) {
		
		Java16_ex01_StarCar starCarLowGrade = new Java16_ex01_StarCarLowGrade(Java16_ex01_CarSpecs.COLOR_BLUE, Java16_ex01_CarSpecs.TIRE_NORMAL, Java16_ex01_CarSpecs.DISPLACEMENT_2000, Java16_ex01_CarSpecs.HANDLE_POWER);
		Java16_ex01_StarCar starCarHighGrade = new Java16_ex01_StarCarHighGrade(Java16_ex01_CarSpecs.COLOR_RED, Java16_ex01_CarSpecs.TIRE_WILD, Java16_ex01_CarSpecs.DISPLACEMENT_2200, Java16_ex01_CarSpecs.HANDLE_NORMAL);
		
		starCarLowGrade.getSpec();
		starCarHighGrade.getSpec();
		
	}
}

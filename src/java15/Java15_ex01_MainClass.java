package java15;

public class Java15_ex01_MainClass {

	public static void main(String[] args) {
		
		Java15_ex01_LunchMenu child1 = new Java15_ex01_Child1(Java15_ex01_PriceTable.RICE, Java15_ex01_PriceTable.BULGOGI, Java15_ex01_PriceTable.BANANA, Java15_ex01_PriceTable.MILK, Java15_ex01_PriceTable.ALMOND);
		Java15_ex01_LunchMenu child2 = new Java15_ex01_Child2(Java15_ex01_PriceTable.RICE, Java15_ex01_PriceTable.BULGOGI, Java15_ex01_PriceTable.BANANA, Java15_ex01_PriceTable.MILK, Java15_ex01_PriceTable.ALMOND);
		
		System.out.println("child1 ������ �Ĵ� : " + child1.calculating());
		System.out.println("child2 ������ �Ĵ� : " + child2.calculating());
		
	}
}

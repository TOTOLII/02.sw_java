package java13;

public class Java13_ex02_MainClass {

	public static void main(String[] args) {
		
		Java13_ex02_HeadQuarterStore store1 = new Java13_ex02_StoreNum1();
		store1.orderKimChijjige();
		store1.orderBuDaejjige();
		store1.orderBiBimbap();
		store1.orderSunDaeguk();
		store1.orderGongGibap();
		
		System.out.println("==========================");
		
		Java13_ex02_HeadQuarterStore store2 = new Java13_ex02_StoreNum2();
		store2.orderKimChijjige();
		store2.orderBuDaejjige();
		store2.orderBiBimbap();
		store2.orderSunDaeguk();
		store2.orderGongGibap();
		
		System.out.println("==========================");
		
		Java13_ex02_HeadQuarterStore store3 = new Java13_ex02_StoreNum3();
		store3.orderKimChijjige();
		store3.orderBuDaejjige();
		store3.orderBiBimbap();
		store3.orderSunDaeguk();
		store3.orderGongGibap();
		
	}
	
}

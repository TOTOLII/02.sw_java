package java13;

public class Java13_ex02_StoreNum1 extends Java13_ex02_HeadQuarterStore {
	
	public Java13_ex02_StoreNum1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void orderKimChijjige() {
		System.out.println("4,500원 입니다.");
	}
	
	@Override
	public void orderBuDaejjige() {
		System.out.println("5,000원 입니다.");
	}
	
	@Override
	public void orderSunDaeguk() {
		System.out.println("판매 하지 않습니다.");
	}
	
}

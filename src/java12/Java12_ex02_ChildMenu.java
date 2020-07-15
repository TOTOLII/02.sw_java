package java12;

public class Java12_ex02_ChildMenu extends Java12_ex02_ParentMenu {
	
	public Java12_ex02_ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	private void makeBeefChungGukJang() {
		// TODO Auto-generated method stub
		System.out.println("쇠고기 청국장");
	}
	
	public void makeHotDoenJangGuk() {
		// TODO Auto-generated method stub
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNaMool() {
		// TODO Auto-generated method stub
		System.out.println("콩나물국");
	}
	
	@Override //재정의
	public void makeChungGukJang() {
		// TODO Auto-generated method stub
		System.out.println("냄세 없는 청국장");
	}
	
}

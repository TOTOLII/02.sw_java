package java17;

public class Java17_ex02_MainClass {
	public static void main(String[] args) {
		
//		APhone aPhone = new APhone();
//		BPhone bPhone = new BPhone();
//		CPhone cPhone = new CPhone();
		
		Java17_ex02_IFunction aPhone = new Java17_ex02_APhone();
		Java17_ex02_IFunction bPhone = new Java17_ex02_BPhone();
		Java17_ex02_IFunction cPhone = new Java17_ex02_CPhone();
		
		int[] iArr = {10, 20, 30};
		
		Java17_ex02_IFunction[] iFunctions = {aPhone, bPhone, cPhone};
		
		for (int i = 0; i < iFunctions.length; i++) {
			iFunctions[i].callSenderReceive();
			iFunctions[i].canLte();
			iFunctions[i].tvRemoteController();
			System.out.println("======================================");
		}
		
	}
}

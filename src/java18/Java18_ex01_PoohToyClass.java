package java18;

public class Java18_ex01_PoohToyClass implements Java18_ex01_MoveArmLeg {

	public Java18_ex01_PoohToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("곰돌이 입니다.");
		canMoveArmLeg();
		System.out.println("==============================");
	}
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

}

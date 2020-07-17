package java20;

public class Java20_ex01_MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("SuperRobot�� �ֹ� ��� �Ծ��. ����� �ּ���.");
		Java20_ex01_Robot superRobot = new Java20_ex01_SuperRobot();
		superRobot.shape();
		superRobot.actionBasic();
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionKnife();
		System.out.println("----------------------------------------------");
		
		System.out.println("StandardRobot�� �ֹ� ��� �Ծ��. ����� �ּ���.");
		Java20_ex01_Robot standardRobot = new Java20_ex01_StandardRobot();
		standardRobot.shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		System.out.println("----------------------------------------------");
		
		System.out.println("CheapRobot�� �ֹ� ��� �Ծ��. ����� �ּ���.");
		Java20_ex01_Robot cheapRobot = new Java20_ex01_CheapRobot();
		cheapRobot.shape();
		cheapRobot.actionBasic();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionKnife();
		System.out.println("----------------------------------------------");
	}
	
}

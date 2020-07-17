package java20;

import java20.robot.option.Java20_ex01_FireOk;
import java20.robot.option.Java20_ex01_FlyNo;
import java20.robot.option.Java20_ex01_FlyOk;
import java20.robot.option.Java20_ex01_KnifeWithLazer;
import java20.robot.option.Java20_ex01_KnifeWithWood;

public class Java20_ex01_StandardRobot extends Java20_ex01_Robot {

	public Java20_ex01_StandardRobot() {
		// TODO Auto-generated constructor stub
		flyAction = new Java20_ex01_FlyNo();
		fireAction = new Java20_ex01_FireOk();
		knifeAction = new Java20_ex01_KnifeWithWood();
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("�⺻������ ��, �ٸ�, �Ӹ�, �������� �̷���� �ֽ��ϴ�. �׸��� �Ȱ�, �޸� �� �ֽ��ϴ�.");
	}
	

}

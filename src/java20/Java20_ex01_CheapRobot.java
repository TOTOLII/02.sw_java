package java20;

import java20.robot.option.Java20_ex01_FireNo;
import java20.robot.option.Java20_ex01_FireOk;
import java20.robot.option.Java20_ex01_FlyNo;
import java20.robot.option.Java20_ex01_FlyOk;
import java20.robot.option.Java20_ex01_KnifeNo;
import java20.robot.option.Java20_ex01_KnifeWithLazer;
import java20.robot.option.Java20_ex01_KnifeWithWood;

public class Java20_ex01_CheapRobot extends Java20_ex01_Robot {

	public Java20_ex01_CheapRobot() {
		// TODO Auto-generated constructor stub
		flyAction = new Java20_ex01_FlyNo();
		fireAction = new Java20_ex01_FireNo();
		knifeAction = new Java20_ex01_KnifeNo();
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("�⺻������ ��, �ٸ�, �Ӹ�, �������� �̷���� �ֽ��ϴ�. �׸��� �Ȱ�, �޸� �� �ֽ��ϴ�.");
	}
	

}

package java20;

import java20.robot.option.Java20_ex01_FireAction;
import java20.robot.option.Java20_ex01_FlyAction;
import java20.robot.option.Java20_ex01_KnifeAction;

public abstract class Java20_ex01_Robot {
	
	public Java20_ex01_FlyAction flyAction;
	public Java20_ex01_FireAction fireAction;
	public Java20_ex01_KnifeAction knifeAction;
	
	public Java20_ex01_Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void shape();
	
	public void actionFly() {
		// TODO Auto-generated method stub
		flyAction.fly();
	}
	
	public void actionFire() {
		// TODO Auto-generated method stub
		fireAction.fire();
	}
	
	public void actionKnife() {
		// TODO Auto-generated method stub
		knifeAction.knife();
	}
	
	public void actionBasic() {
		// TODO Auto-generated method stub
		System.out.println("��, �ٸ�, �Ӹ�, ������ �ֽ��ϴ�.");
	}

	public void setFlyAction(Java20_ex01_FlyAction flyAction) {
		this.flyAction = flyAction;
	}

	public void setFireAction(Java20_ex01_FireAction fireAction) {
		this.fireAction = fireAction;
	}

	public void setKnifeAction(Java20_ex01_KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}
	
	
}

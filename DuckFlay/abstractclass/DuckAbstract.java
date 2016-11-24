package abstractclass;

import duckinterface.FlyMotorBehavior;
import duckinterface.FlyWingBehavior;
import duckinterface.IFlyBehavior;

public abstract class DuckAbstract {
	IFlyBehavior flyBehavior;
	
	public DuckAbstract () {
		
	}
	
	public void perfomFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
	}
	
	public abstract void display();
	
	public void setFlyBehavior(FlyMotorBehavior fm, FlyWingBehavior fb) {
		flyBehavior = fb;
		flyBehavior = fm;
	}

}

package abstractclass;

import duckinterface.IFlayBehavior;

public abstract class DuckAbstract {
	IFlayBehavior flyBehavior;
	
	public DuckAbstract () {
		
	}
	
	public void swim() {
	}
	
	public abstract void display();
	
	public void setFlyBehavior() {
		flyBehavior.fly();
	}

}

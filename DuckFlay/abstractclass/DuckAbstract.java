package abstractclass;

import duckinterface.IFlayBehavior;

public abstract class DuckAbstract {
	IFlayBehavior flyBehavior;
	
	public DuckAbstract () {
		
	}
	
	abstract public void swim();
	
	public void display() {
		System.out.println("It is duck");
	}
	
	public void setFlyBehavior() {
		flyBehavior.fly();
	}

}

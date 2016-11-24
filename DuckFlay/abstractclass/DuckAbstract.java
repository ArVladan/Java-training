package abstractclass;

import duckinterface.IFlayBehavior;

public abstract class DuckAbstract {
	IFlayBehavior flyBehavior;
	
	public DuckAbstract () {
		
	}
	
	public void swim() {
		System.out.println("This duck swim");
	}
	public void display() {
		System.out.println("It is duck");
	}
	public void setFlyBehavior() {
		flyBehavior.fly();
		
	}

}

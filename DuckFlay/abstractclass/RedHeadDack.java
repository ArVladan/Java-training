package abstractclass;

import duckinterface.FlyWingBehavior;

public class RedHeadDack extends DuckAbstract {

	public RedHeadDack() {
		flyBehavior = new FlyWingBehavior();
	}
	
	public void swim() {
		System.out.println("Swim - dive - swim");
	}
	
	public void display() {
		super.display();
	}
	
	public void setFlyBehavior() {
		flyBehavior.fly();
	}
	

}

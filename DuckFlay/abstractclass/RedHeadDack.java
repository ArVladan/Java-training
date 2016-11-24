package abstractclass;

import duckinterface.FlyWingBehavior;
import duckinterface.IFlyBehavior;

public class RedHeadDack extends DuckAbstract {

	public RedHeadDack() {
		flyBehavior = new FlyWingBehavior();
	}
	
	public void swim() {
		System.out.println("Swim - dive - swim");
	}
	
	public void display() {
		System.out.println("This is redhead duck");
	}
	
	public void setFlyBehavior(IFlyBehavior fl) {
		flyBehavior = fl;
	}
	

}

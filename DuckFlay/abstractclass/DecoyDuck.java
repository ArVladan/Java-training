package abstractclass;

import duckinterface.NoFlyBehavior;

public class DecoyDuck extends DuckAbstract {

	public DecoyDuck() {
		
		flyBehavior = new NoFlyBehavior();
		
	}
	public void swim() {
		System.out.println("Swing - swing");
	}
	
	public void display() {
		System.out.println("Wood duck");
		
	}
	
	public void setFlyBehavior() {
		flyBehavior.fly();
		
	}
}

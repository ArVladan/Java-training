package abstractclass;

import duckinterface.FlyMotorBehavior;
import duckinterface.FlyWingBehavior;
import duckinterface.IFlyBehavior;

public class MotorDuck extends DuckAbstract {

		
			IFlyBehavior flyBehavior = new FlyMotorBehavior();	
	
		
		public void swim() {
			System.out.println("Fiu - fiu");
		}
		
		public void display() {
			System.out.println("Motor duck");
		}
		
		public void perfomFly() {
			flyBehavior.fly();
		}
		
		public void setFlyBehavior(FlyWingBehavior fb) {
			flyBehavior = fb;
		}

}

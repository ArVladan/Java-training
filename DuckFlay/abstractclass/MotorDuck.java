package abstractclass;

import duckinterface.FlyMotorBehavior;

public class MotorDuck extends DuckAbstract {

		public MotorDuck() {
			
			flyBehavior = new FlyMotorBehavior();
			
		}
		public void swim() {
			System.out.println("Fiu - fiu");
		}
		
		public void display() {
			System.out.println("Motor duck");
			
		}
		
		public void setFlyBehavior() {
			flyBehavior.fly();
			
		}

}

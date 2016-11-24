package realisation;

import abstractclass.DecoyDuck;
import abstractclass.MotorDuck;
import abstractclass.RedHeadDack;

public class LikeDuck {

	public static void main(String[] args) {
		 RedHeadDack redDuck = new RedHeadDack();
		 DecoyDuck playDuck = new DecoyDuck();
		 MotorDuck speedDuck = new MotorDuck();
		 System.out.println("This is one duck ");
		 redDuck.display();
		 System.out.println("She swim: ");
		 redDuck.swim();
		 System.out.println("To fly: ");
		 redDuck.setFlyBehavior();
		 System.out.println("Two duck ");
		 playDuck.display();
		 System.out.println("Swim: ");
		 playDuck.swim();
		 System.out.println("To fly: ");
		 playDuck.setFlyBehavior();
		 System.out.println("Last duck ");
		 speedDuck.display();
		 System.out.println("Last duck swim: ");
		 speedDuck.swim();
		 System.out.println("Last duck to fly: ");
		 speedDuck.setFlyBehavior();
		 
	
		 
		 

	}

}

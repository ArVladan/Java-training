package duckinterface;

public class NoFlyBehavior implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Not fly: Oops!");
	}

}

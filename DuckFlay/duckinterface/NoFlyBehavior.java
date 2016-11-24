package duckinterface;

public class NoFlyBehavior implements IFlayBehavior {

	@Override
	public void fly() {
		System.out.println("Not fly: Oops!");
	}

}

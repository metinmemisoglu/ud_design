package factory;

public class Car extends Transport{

	@Override
	protected void drive() {
		System.out.println("Car drive...");
	}

}

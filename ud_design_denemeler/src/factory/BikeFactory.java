package factory;

public class BikeFactory implements Factory{

	@Override
	public Transport create() {
		return new Bike();
	}

}

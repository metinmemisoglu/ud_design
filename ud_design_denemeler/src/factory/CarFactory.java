package factory;

public class CarFactory implements Factory{
	@Override
	public Transport create() {
		return new Car();
	}
	
}

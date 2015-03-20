package factory;

public class Client {

	public static void main(String[] args) {
		Factory fact = new CarFactory();
		Transport transport = fact.create();
		transport.drive();
		
		fact = new BikeFactory();
		transport = fact.create();
		transport.drive();
	}

}

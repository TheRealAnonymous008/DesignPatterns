package facadePackage;

public class Client {

	public static void main(String[] args) {
		// When the client needs to access the subsystems,
		// it simply needs to do so via the facade
		
		Facade fac = new Facade();
		
		// All operations are called from the facade
		fac.performOperation();
		fac.specialOperation();
		fac.receiveRequest();

	}

}
